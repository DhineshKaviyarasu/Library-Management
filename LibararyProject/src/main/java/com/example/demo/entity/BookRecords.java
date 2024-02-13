package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Book_Records")
public class BookRecords {
	@Id
	@GeneratedValue
	@Column(name ="bookRefId")
	private int bookRefId;
	private String bookName;
	private String author;
	private String titile;
	@Column(name = "reflibId")
    private Integer reflibId;
	public int getBookRefId() {
		return bookRefId;
	}
	public void setBookRefId(int bookRefId) {
		this.bookRefId = bookRefId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitile() {
		return titile;
	}
	public void setTitile(String titile) {
		this.titile = titile;
	}
	public Integer getReflibId() {
		return reflibId;
	}
	public void setReflibId(Integer reflibId) {
		this.reflibId = reflibId;
	}
	public BookRecords(int bookRefId, String bookName, String author, String titile, Integer reflibId) {
		super();
		this.bookRefId = bookRefId;
		this.bookName = bookName;
		this.author = author;
		this.titile = titile;
		this.reflibId = reflibId;
	}
	public BookRecords() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BookRecords [bookRefId=" + bookRefId + ", bookName=" + bookName + ", author=" + author + ", titile="
				+ titile + ", reflibId=" + reflibId + "]";
	}
	
	

}
