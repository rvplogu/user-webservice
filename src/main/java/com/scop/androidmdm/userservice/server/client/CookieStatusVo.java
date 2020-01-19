package com.scop.androidmdm.userservice.server.client;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CookieStatusVo {
	private boolean status = false;
	private String message;
	private String username;
}
