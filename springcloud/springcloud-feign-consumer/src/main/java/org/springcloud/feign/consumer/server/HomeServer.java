package org.springcloud.feign.consumer.server;

import org.springcloud.feign.consumer.server.hystrix.HomeServerHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-provider", fallback = HomeServerHystrix.class)
public interface HomeServer {

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String consumer();
}
