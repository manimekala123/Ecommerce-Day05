package lk.ac.vau.fas.ict.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CURDController<K, T> {
private Map<K, T> objects = new HashMap<K, T>();
	
	public Map<K, T> getMap() {
		return objects;
	}
	
	@GetMapping("/")
	public Map<K, T> getAll() {
		return objects;
	}
	
	@GetMapping("/{id}")
	public T get(@PathVariable("id") K id) {
		return objects.get(id);
	}
	

	
	//Add new
	@PostMapping("/add/{id}")
	public String addNew(@RequestBody T object, @PathVariable("id") K id) {
		this.objects.put(id, object);
		return "Added new object";
	}
	
	//update 
	@PutMapping("/update/{id}")
	public String updateOne(@PathVariable("id") K id, @RequestBody T object) {
		if(this.objects.get(id) != null) {
			this.objects.put(id, object);
			return "The details are updated";
		}
		return "404 couldn't find the object";
	}
	
	//delete
	@DeleteMapping("/delete/{id}")
	public String DeleteOne(@PathVariable("id") K id) {
		if(objects.get(id) != null) {
			objects.remove(id);
			return "The Details are Deleted";
		}
		return "404 couldn't find the object";
	}
}
