package com.scop.androidmdm.userservice.server.client;

import javax.servlet.http.Cookie;


public final class CookieUtil {

//	@Autowired
//	UsermanagerContext context;

	public static Cookie createCookie(String username) {
		Cookie cookie = new Cookie("username", username);
		cookie.setMaxAge(3600);
		UsermanagerContext.setUsername(username);
		return cookie;
	}

	public static CookieStatusVo validateCookie(Cookie cookie) {
		System.out.println(cookie.getValue());
//		if(cookie.getValue().equals(UsermanagerContext.getUsername())) {
//			return CookieStatusVo.builder().status(true).username(UsermanagerContext.getUsername()).build();	
//		}
		return CookieStatusVo.builder().status(true).build();
		
	}

	public static void removeValue(String username) {
//		UsermanagerContext.clear();
	}
}
