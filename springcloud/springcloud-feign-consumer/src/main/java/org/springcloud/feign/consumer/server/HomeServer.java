package org.springcloud.feign.consumer.server;

import org.springframework.cloud.netflix.feign.FeignClient;

import feign.RequestLine;

@FeignClient("eureka-provider")
public interface HomeServer {

	@RequestLine("GET /")
	public String consumer();
}
