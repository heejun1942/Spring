package model;

import lombok.Data;

@Data
public class Member {
	private String name;
	private String userId;
	private String userPassword;
	@Override
	public String toString() {
		return "Member [name=" + name + ", userId=" + userId + ", userPassword=" + userPassword + "]";
	}

	
}