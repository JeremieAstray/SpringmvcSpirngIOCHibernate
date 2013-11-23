package com.jeremie.www.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "user", catalog = "signinsystem", uniqueConstraints = @UniqueConstraint(columnNames = "user_num"))
public class User implements java.io.Serializable {

	// Fields

	private Integer id;
	private String userNum;
	private String password;
	private String name;
	private String clazz;
	private String telephone;
	private String shortTelephone;
	private String qq;
	private Short userType;
	//1为管理员，0为普通会员
	private Set<SignIn> signIns = new HashSet<SignIn>(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userNum, String password) {
		this.userNum = userNum;
		this.password = password;
	}

	/** full constructor */
	public User(String userNum, String password, String name, String clazz,
			String telephone, String shortTelephone, String qq, Short userType,
			Set<SignIn> signIns) {
		this.userNum = userNum;
		this.password = password;
		this.name = name;
		this.clazz = clazz;
		this.telephone = telephone;
		this.shortTelephone = shortTelephone;
		this.qq = qq;
		this.userType = userType;
		this.signIns = signIns;
	}

	// Property accessors
	@Id
	@GeneratedValue
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "user_num", unique = true, nullable = false, length = 12)
	public String getUserNum() {
		return this.userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	@Column(name = "password", nullable = false, length = 50)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "name", length = 20)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "clazz", length = 20)
	public String getClazz() {
		return this.clazz;
	}

	public void setClazz(String clazz) {
		this.clazz = clazz;
	}

	@Column(name = "telephone", length = 11)
	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Column(name = "short_telephone", length = 6)
	public String getShortTelephone() {
		return this.shortTelephone;
	}

	public void setShortTelephone(String shortTelephone) {
		this.shortTelephone = shortTelephone;
	}

	@Column(name = "QQ", length = 15)
	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	@Column(name = "userType")
	public Short getUserType() {
		return this.userType;
	}

	public void setUserType(Short userType) {
		this.userType = userType;
	}

	@OneToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,
			CascadeType.REFRESH,CascadeType.REMOVE}, fetch = FetchType.LAZY, mappedBy = "user")
	public Set<SignIn> getSignIns() {
		return this.signIns;
	}

	public void setSignIns(Set<SignIn> signIns) {
		this.signIns = signIns;
	}

}