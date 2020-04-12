package tacos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoApplication {

	@GetMapping("/helloworld")
	public String hello() {
			return "Hello World!";
		}
}