package org.springcloud.ribbon.consumer.server;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class HomeServer {

	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "baseError")
	public String homeService() {
		return restTemplate.getForObject("http://eureka-provider/", String.class);
	}

	public String baseError() {
		return "sorry,error!";
	}
}
