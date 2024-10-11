package project.myvet.core_ms.config;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "billing_ms")
public interface FeignService {

	
	
}
