package com.fegin;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//url指定为要访问的外部地址，name为要访问的service name
@FeignClient(value="sa")
public interface FeginClientController {
    @RequestMapping("/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b);

}
