package hello

import org.apache.log4j.Logger
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@EnableAutoConfiguration
class HelloGroovy {

	@RequestMapping("/logger")
	String logger(){
		
		
		return "Logger Called."
		
	}
	
	static main(args) {
	
		//SpringApplication.run(this, args)
	}

}
