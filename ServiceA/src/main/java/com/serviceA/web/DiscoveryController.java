package com.serviceA.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController("api/v1/instances")
public class DiscoveryController {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	@Value("${server.port}")
	private String ip;
	@Value("${spring.application.name}")
	private String hostname;
	
	@GetMapping("/client")
	public String client() {
		String services = "Services: " + discoveryClient.getServices()+" ip :"+ip;
				System.out.println(services);
		return services+"host:"+discoveryClient.getLocalServiceInstance().getHost()+"   -----port:"+discoveryClient.getLocalServiceInstance().getPort();
	}

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(){
		String services = "Services: " + discoveryClient.getServices()+" ip :"+ip+" hostname :"+hostname;
		System.out.println(services);
		return services;
	}
    @RequestMapping("/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b){
	    return a+b;
    }

}