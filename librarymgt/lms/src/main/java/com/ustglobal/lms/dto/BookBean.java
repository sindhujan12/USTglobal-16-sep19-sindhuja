package com.ustglobal.lms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import net.bytebuddy.build.ToStringPlugin.Exclude;

@Entity
@Table(name = "book")
public class BookBean {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bid;
	@Column
	private String name;
	@Column
	private String author;
	@Column
	private String publication;
	@Column
	private String status;
	
	@JsonIgnore
	@Exclude
	@OneToMany(mappedBy = "book")
	private List<BookIssueBean> bookIssues;
	public List<BookIssueBean> getBookIssues() {
		return bookIssues;
	}
	public void setBookIssues(List<BookIssueBean> bookIssues) {
		this.bookIssues = bookIssues;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}	
}
