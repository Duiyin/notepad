package com.tinghan.notepad.domain;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.tinghan.notepad.util.ID;
import com.tinghan.notepad.util.Time;

@Entity
public class User {

	@Id
	private String id;

	private String account;

	private String password;

	private Timestamp createtime;

	// 以下为个人信息↓
	private String headimgs; // 头像

	private String nickname; // 昵称

	private String autograph; // 个性签名

	private String sex; // 性别

	private String email;

	private String idcard; // 标识符-编号

	public User() {
		this.id = ID.uuid();
		this.idcard = ID.Intercept();
		this.createtime = Time.timestamp();
		this.headimgs = "/images/default_head.png";
		this.nickname = idcard;
		this.autograph = "此人较懒，暂无信息";
		this.sex = "保密";
		this.email = "保密";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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

	public Timestamp getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdcard() {
		return idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
}
