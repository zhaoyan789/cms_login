/**
 * 
 */
package com.cms.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cms.constant.CmsConstant;
import com.cms.pojo.User;
import com.cms.service.LoginService;

/**
 * @author zhaoyan
 *
 * 2020年1月7日
 */

@Controller
@RequestMapping("user")
public class LoginController {
	
	@Autowired
	private LoginService loginService ;
	

	@RequestMapping(value = "toregister",method = RequestMethod.GET)
	public String toRegister(Model m) {
		
		m.addAttribute("user", new User());
		
		return "register";
	}
	
	@RequestMapping(value = "register" ,method = RequestMethod.POST)
	public String regirest(Model m, @Valid @ModelAttribute("user")User user ,BindingResult br) {
		
		if(br.hasErrors()) {
			return "register";
		}
		
		System.out.println(user);
		
		int num = loginService.register(user);
		
		if(num > 0) {
			m.addAttribute(CmsConstant.USER_KEY, user);
			return "redirect:login";
		}
		
		return "register";
	}
	
	
	@RequestMapping("checkuser")
	@ResponseBody
	public boolean checkUser(String username) {
		
		System.out.println(username);
		
		User user = loginService.findByName(username);
		
		return (user == null);
	}
	
	@RequestMapping(value = "login",method = RequestMethod.POST)
	public String toLogin(HttpSession session, @Valid @ModelAttribute("user")User user ,BindingResult br) {
		
		if(br.hasErrors()) {
			return "register";
		}
		
		System.out.println(user);
		
		User loginPen = loginService.loginUser(user);
		
		if(loginPen == null) {
			return "login";
		}
		
		session.setAttribute(CmsConstant.USER_KEY, loginPen);
		
		return "redirect:toindex";
	}
	
	@RequestMapping(value = "toindex",method = RequestMethod.GET)
	public String toIndex() {
		return "index";
	}
}
