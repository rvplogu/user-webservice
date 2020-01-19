package com.scop.androidmdm.userservice.server.controller;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scop.androidmdm.userservice.server.client.CookieStatusVo;
import com.scop.androidmdm.userservice.server.client.CookieUtil;
import com.scop.androidmdm.userservice.server.vo.LoginVo;

@RestController
@RequestMapping(value="user/")
public class Usercontroller {

	@PostMapping(value="login")
	public String loginSuccess( HttpServletRequest request, HttpServletResponse response, LoginVo loginVo){
		response.addCookie(CookieUtil.createCookie(loginVo.getUsername()));
		return "success";
	}
	
	@GetMapping(value="login-status")
	public CookieStatusVo loginStatus( HttpServletRequest request, HttpServletResponse response){
		CookieStatusVo result = null;
		if(request.getCookies() !=null && request.getCookies().length != 0) {
			for(Cookie cookie : request.getCookies()) {
				 result = CookieUtil.validateCookie(cookie);
				 if(result.isStatus()) {
					 return result;
				 }else {
					 return result;
				 }
			}
		}
		return result;
	}
	
	@PostMapping(value="logout")
	public String logoutSuccess(HttpServletRequest request, HttpServletResponse response,LoginVo loginVo){
		if(request.getCookies() !=null && request.getCookies().length != 0) {
			for(Cookie cookie : request.getCookies()) {
				 CookieStatusVo result = CookieUtil.validateCookie(cookie);
				 if(result.isStatus()) {
					 cookie.setMaxAge(0);
					 CookieUtil.removeValue(result.getUsername());
					 return "active";
				 }else {
					 return "in-active";
				 }
			}
		}
		return "success";
	}
	
//	@GetMapping(value="login-list")
//	public String userlist(){
//		return UsermanagerContext.getList();
//	}
}
