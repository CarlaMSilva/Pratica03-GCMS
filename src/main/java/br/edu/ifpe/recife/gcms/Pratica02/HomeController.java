package br.edu.ifpe.recife.gcms.Pratica02;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping; 
	import org.springframework.web.bind.annotation.ResponseBody;
	
	@Controller 
	public class HomeController {
		
		//@RequestMapping("/") 
		//public @ResponseBody String greeting() {
		//return "Hello, World!";
		//}
		
		@RequestMapping("/carla")
		public @ResponseBody String greetingCarla() { 
			return "Hello, Carla Maria teste da prática 3!";
			}
		
		@RequestMapping("/pessoa")
		public @ResponseBody String greetingPessoa() { 
			return "Hello, Carla Pessoa da prática 3!";
			}
		
		@RequestMapping("/hotfix")
		public @ResponseBody String greetingHotfix() { 
			return "Hello, criação da branch hotfix!";
			}


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello, world!";

	}

	@RequestMapping("/carla")
	public @ResponseBody String greetingCarla() {
		return "Hello, Carla Maria!";
	}

	@RequestMapping("/pessoa")
	public @ResponseBody String greetingPessoa() {
		return "Hello, Carla Pessoa!";
	}
	
	@RequestMapping("/hotfix")
	public @ResponseBody String greetingHotfix() {
		return "Mudança na branch para hotfix!";
	}

	
	@RequestMapping("/hotfix")
	public @ResponseBody String greetingHotfix() {
		return "Hello, isto é um hotfix!";
	}

}
