package com.alexbt.goodies;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/goodies")
public class MyController {
	
	@RequestMapping
	public void test() {
	}
	
}
