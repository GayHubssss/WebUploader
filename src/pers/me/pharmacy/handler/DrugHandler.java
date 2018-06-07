package pers.me.pharmacy.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DrugHandler {
	
	@RequestMapping("/Turn")
	public String Turn()throws Exception{
		return "index";
	}

}
