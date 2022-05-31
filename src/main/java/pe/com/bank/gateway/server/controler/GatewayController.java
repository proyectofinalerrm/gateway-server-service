package pe.com.bank.gateway.server.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {
	
	 @GetMapping("/defaultFallBack")
	    public String defaultMessage() {
	        return "connection failed";

	 }
}
