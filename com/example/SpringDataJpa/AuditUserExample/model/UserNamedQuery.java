package com.example.SpringDataJpa.AuditUserExample.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="users")
@EntityListeners(AuditingEntityListener.class)
@NamedQuery(name="findByEmailAddress",query="select u from UserNamedQuery u where u.emailAddress=?1")
@NamedQueries(value= {@NamedQuery(name="UserNamedQuery.findLastName",query="select u from UserNamedQuery u where u.lastName=?1"),
		              @NamedQuery(name="UserNamedQuery.findFirstName",query="select u from UserNamedQuery u where u.firstName=?1")})
public class UserNamedQuery extends Auditable<String>{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO	)
	@Column(name="userId")
	private int id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="emailAddress")
	private String emailAddress;
	
	@Column(name="startDate")
	private Date startDate;
	
	@Column(name="age")
	private int age;
	
	@Column(name="active")
	private int active;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getActive() {
		return active;
	}
	public void setActive(int active) {
		this.active = active;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
				+ emailAddress + ", startDate=" + startDate + ", age=" + age + ", active=" + active + "]";
	}
	
	
	
}
