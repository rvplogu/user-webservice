package com.scop.androidmdm.userservice.server.client;

public class UsermanagerContext {
	
	private static final ThreadLocal<String> CONTEXT = new ThreadLocal<>();
	
	public static void setUsername(String username) {
		CONTEXT.set(username);
	}
	public static String getUsername() {
		return CONTEXT.get();
	}
	public static void clear() {
		CONTEXT.remove();
	}
	
	public static String getList() {
		return CONTEXT.get();
	}
//	public static String getUserList() {
//		List<String> userList= Lists.newArrayList();
//		CONTEXT.withInitial((value) -> userList.add(value));
//	}
}
