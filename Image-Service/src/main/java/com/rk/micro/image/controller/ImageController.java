package com.rk.micro.image.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk.micro.image.domain.Images;

@RestController
public class ImageController {

	@RequestMapping("/images")
	public List<Images> getImages() {
		List<Images> images = new ArrayList<Images>();
		setImages(images);
		return images;
	}
	
	private void setImages(List<Images> images) {
		Images img = new Images("1","https://danimosite.files.wordpress.com/2016/12/143476-steve-jobs-computer-programming-quote.jpg","Image1");
		Images img1 = new Images("2","https://www.azquotes.com/picture-quotes/quote-there-are-two-ways-to-write-error-free-programs-only-the-third-one-works-alan-perlis-60-26-43.jpg","Image2");
		Images img2 = new Images("3","https://www.webdevelopersnotes.com/wp-content/uploads/programming-is-thinking.png","Image3");
		images.add(img);
		images.add(img1);
		images.add(img2);
	}
}
