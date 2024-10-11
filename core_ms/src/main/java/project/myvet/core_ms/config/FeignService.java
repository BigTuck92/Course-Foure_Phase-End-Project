package project.myvet.core_ms.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "billing_ms")
public interface FeignService {

	@GetMapping("/bill")
	ResponseEntity<Double> calculateBill(@RequestParam Double visitRate, @RequestParam Integer numberPets);
	
}
