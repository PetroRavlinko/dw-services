package com.dw.services;

import com.dw.services.dto.DwDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public DwDto home() {
		logger.info("Request home controller");
		if (true) {
			logger.info("Unuseful code detected");

		} else {

		}
		return new DwDto().setMessage("Hello!");
	}
}
