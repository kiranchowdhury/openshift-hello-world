package com.cirrus.poc.msa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {
    final static Logger logger = LoggerFactory.getLogger(HelloCtrl.class);

	@GetMapping(path="greet")
	public String greet() {
		logger.info("Hello Controller Called");
		return "Hello World";
	}

}
