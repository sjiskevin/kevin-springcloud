package org.springcloud.feign.consumer.controller;

import org.springcloud.feign.consumer.server.HomeServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	@Autowired
	private HomeServer homeServer;

	@GetMapping(value = "/hello")
	public String hello() {
		return homeServer.consumer();
	}
}
