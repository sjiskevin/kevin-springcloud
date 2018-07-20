package org.springcloud.ribbon.consumer.controller;

import javax.annotation.Resource;

import org.springcloud.ribbon.consumer.server.HomeServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	@Resource
	private HomeServer homeServer;

	@GetMapping(value = "/hello")
	public String hello() {
		return homeServer.homeService();
	}
}
