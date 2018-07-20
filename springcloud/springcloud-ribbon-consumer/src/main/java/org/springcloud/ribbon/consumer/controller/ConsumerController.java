package org.springcloud.ribbon.consumer.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

	@Resource
	private RestTemplate restTemplate;

	@GetMapping(value = "/hello")
	public String hello() {
		return restTemplate.getForEntity("http://eureka-provider/", String.class).getBody();
	}
}
