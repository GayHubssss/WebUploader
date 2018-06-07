package pers.me.pharmacy.handler;


import java.io.File;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import pers.me.pharmacy.bean.User;
import pers.me.pharmacy.service.UserService;

@Controller
public class UserHandler {
	
	@Autowired
	private UserService userService;
	
	/**
	 * 
	 * @param 参数user对象
	 * @param 参数model对象
	 * @return 返回视图
	 * @throws Exception 异常基类
	 */
	@RequestMapping("/tologin")
	public String tologin(String uname,String upassword,HttpSession session)throws Exception{
		
		User user = userService.findByName(uname);
		if(user!=null){
			if(user.getUpassword().equals(upassword)){
				session.setAttribute("user", user);
			}
		}else{
			return "redirect:/login";
		}
		return "redirect:/index";
	}
	
	/**
	 * 
	 * @param request用于获取文件的真实路径
	 * @param session用于获取需要修改的的user信息
	 * @param file 用于获取表单传过来的文件
	 * @throws Exception 异常基类
	 */
	
	@RequestMapping("/upload")
	@ResponseBody
	public String upload(HttpServletRequest request,HttpSession session,@RequestParam(value="fileName") MultipartFile fileName)throws Exception{
		
		User user = (User) session.getAttribute("user");
		
		String trueFileName = null;
		
		if(user!=null){
            
            //上传的文件名
            String filename=fileName.getOriginalFilename();
            
            // 自定义的文件名称
            trueFileName=String.valueOf(System.currentTimeMillis())+filename;
            
            // 文件保存路径  
            String filePath = request.getSession().getServletContext().getRealPath("\\") + "resources\\img\\"  
                    + trueFileName;  
            // 转存文件  
            fileName.transferTo(new File(filePath));  
            
	        user.setImage(trueFileName);
	        
	        userService.update(user);
	  }
		return trueFileName;
	}
	
	@RequestMapping("/register")
	public String register(String uname,String upassword)throws Exception{
		return "";
	}
  } 

