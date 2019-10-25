package com.pzl.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pzl.pojo.User;
import com.pzl.service.UserService;
import com.pzl.service.impl.UserServiceImpl;
import com.pzl.utils.Utils;

@Controller
public class UserController {
	@Resource
	private UserServiceImpl usi;
	@RequestMapping("userlogin")
	public ModelAndView UserLogin(String username,String password,HttpSession httpSession) {
		ModelAndView mav = new ModelAndView("redirect:/myself.jsp");
		User user = usi.selOneUser(username,password);
		if(user!=null) {
			
			httpSession.setAttribute("status",UserService.LOGIN_SUCCESS_STATUS);
		}else {
			httpSession.setAttribute("status",UserService.LOGIN_NOT_SUCCESS_STATUS);
		}
		
		httpSession.setAttribute("user",user);
		return mav;
	}
	
	@RequestMapping("userregister")
	public ModelAndView UserRegister(String username,String password1,String password2,String email,HttpSession httpSession) {
		
		ModelAndView mav = new ModelAndView("redirect:/myself_reg.jsp");
		if(username==""||password1==""||password2==""||email=="") {
			httpSession.setAttribute("regstatus",UserService.REGISTER_HAVE_NULL_VALUES);
			return mav;
		}
		else if(username.length()>10||password1.length()>20) {
			httpSession.setAttribute("regstatus",UserService.REGISTER_CHAR_OUT_OF_BOUNDS); 
			return mav;
		}else if(usi.selOneUserByName(username)!=null) {
			httpSession.setAttribute("regstatus",UserService.REGISTER_USER_EXIST); 
			return mav;
		}else if(!password1.equals(password2)) {
		 httpSession.setAttribute("regstatus",UserService.REGISTER_PASSWORD_NOT_EQUALS);
		 return mav;
		}else if(!Utils.CheckRegEx(email)) {
			httpSession.setAttribute("regstatus",UserService.REGISTER_EMAIL_NOT_MATCH);
			return mav;
		}else {
			User user = new User();
			user.setUsername(username);
			user.setPassword(password1);
			user.setEmail(email);
			usi.insOneUser(user);
			httpSession.setAttribute("regstatus",UserService.REGISTER_SUCCESS_STATUS);
			return mav;
		}
	}
}
