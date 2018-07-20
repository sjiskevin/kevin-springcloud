package org.springcloud.feign.consumer.server.hystrix;

import org.springcloud.feign.consumer.server.HomeServer;
import org.springframework.stereotype.Component;

@Component
public class HomeServerHystrix implements HomeServer {

	@Override
	public String consumer() {
		return "sorry feign hystrix";
	}

}
