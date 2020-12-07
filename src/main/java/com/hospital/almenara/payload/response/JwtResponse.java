package com.hospital.almenara.payload.response;

import com.hospital.almenara.entity.User;
import lombok.Data;

import java.util.List;

@Data
public class JwtResponse {
	private Long id;
	private String token;
	private String type = "Bearer";
	private List<String> roles;
	private String username;
	private String name;
	private String lastName;
	private Boolean status;

	public JwtResponse(String accessToken, Long id, String name, String lastName, String username, Boolean status, List<String> roles) {
		this.token = accessToken;
		this.id = id;
		this.username = username;
		this.roles = roles;
		this.name = name;
		this.lastName = lastName;
		this.status = status;
	}
}
