package pers.me.pharmacy.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspPublicHandler {
	
	/**
	 * @return 用来访问WEN-INF下的视图
	 * @throws Exception
	 */
	
	
	@RequestMapping("/main_uploadImage")
	public String main_uploadImage()throws Exception{
		return "main_uploadImage";
	}
	
	@RequestMapping("/uploadImage")
	public String uploadImage()throws Exception{
		return "Test";
	}
	
	@RequestMapping("/main_druglist")
	public String main_druglist()throws Exception{
		return "main_druglist";
	}
	
	@RequestMapping("/left")
	public String left()throws Exception{
		return "left";
	}
	
	@RequestMapping("/top")
	public String top()throws Exception{
		return "top";
	}
	
	@RequestMapping("/main")
	public String main()throws Exception{
		return "main";
	}
	
	@RequestMapping("/bottom")
	public String bottom()throws Exception{
		return "bottom";
	}
	
	@RequestMapping("/index")
	public String index()throws Exception{
		return "index";
	}
	
	@RequestMapping("/login")
	public String login()throws Exception{
		return "login";
	}
	
	@RequestMapping("/main_info")
	public String main_info()throws Exception{
		return "main_info";
	}
	
	@RequestMapping("/main_list")
	public String main_list()throws Exception{
		return "main_list";
	}
	
	@RequestMapping("/main_menu")
	public String main_menu()throws Exception{
		return "main_menu";
	}
	
	@RequestMapping("/main_message")
	public String main_message()throws Exception{
		return "main_message";
	}
	
	@RequestMapping("/message_info")
	public String message_info()throws Exception{
		return "message_info";
	}
	
	@RequestMapping("/swich")
	public String Swich()throws Exception{
		return "swich";
	}

}
