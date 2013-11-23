package com.jeremie.www.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SignIn entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "sign_in", catalog = "signinsystem")
public class SignIn implements java.io.Serializable {

	// Fields

	private Integer id;
	private User user;
	private Timestamp subdate;

	// Constructors

	/** default constructor */
	public SignIn() {
	}

	/** full constructor */
	public SignIn(User user, Timestamp subdate) {
		this.user = user;
		this.subdate = subdate;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "subdate", nullable = false, length = 19)
	public Timestamp getSubdate() {
		return this.subdate;
	}

	public void setSubdate(Timestamp subdate) {
		this.subdate = subdate;
	}

}