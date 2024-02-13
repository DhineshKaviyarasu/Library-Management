package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.annotation.Generated;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "libarary_Entity")
public class LibararyEntity {
	@Id
	@GeneratedValue
	@Column(name = "reflibId")
	private int reflibId;
	private String book;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date createdDate;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date returnedDate;
	@OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "reflibId", referencedColumnName = "reflibId")
    private List<BookRecords> usersLogs;
	
	
	public int getReflibId() {
		return reflibId;
	}
	public void setReflibId(int reflibId) {
		this.reflibId = reflibId;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getReturnedDate() {
		return returnedDate;
	}
	public void setReturnedDate(Date returnedDate) {
		this.returnedDate = returnedDate;
	}
	public List<BookRecords> getUsersLogs() {
		return usersLogs;
	}
	public void setUsersLogs(List<BookRecords> usersLogs) {
		this.usersLogs = usersLogs;
	}
	public LibararyEntity(int reflibId, String book, Date createdDate, Date returnedDate, List<BookRecords> usersLogs) {
		super();
		this.reflibId = reflibId;
		this.book = book;
		this.createdDate = createdDate;
		this.returnedDate = returnedDate;
		this.usersLogs = usersLogs;
	}
	public LibararyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LibararyEntity [reflibId=" + reflibId + ", book=" + book + ", createdDate=" + createdDate
				+ ", returnedDate=" + returnedDate + ", usersLogs=" + usersLogs + "]";
	}
	

}
