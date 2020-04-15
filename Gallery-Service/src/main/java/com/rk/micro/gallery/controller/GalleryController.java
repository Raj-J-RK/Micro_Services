package com.rk.micro.gallery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rk.micro.gallery.domain.Gallery;

@RestController
public class GalleryController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/home")
	public String home() {
		return "Service is up and running";
	}
	
	@RequestMapping("/{id}")
	public Gallery getGallery(@PathVariable int id) {
		Gallery gallery = new Gallery();
		gallery.setId(id);
		List<Object> objects = restTemplate.getForObject("http://image-service/images", List.class);
		gallery.setList(objects);
		return gallery;
	}

}
