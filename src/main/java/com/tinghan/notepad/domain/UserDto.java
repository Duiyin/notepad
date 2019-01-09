package com.tinghan.notepad.domain;

public class UserDto {
	
	private String account;

	private String password;
	
	private String headimgs; // 头像

	private String nickname; // 昵称

	private String autograph; // 个性签名

	private String email;

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getHeadimgs() {
		return headimgs;
	}

	public void setHeadimgs(String headimgs) {
		this.headimgs = headimgs;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAutograph() {
		return autograph;
	}

	public void setAutograph(String autograph) {
		this.autograph = autograph;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
