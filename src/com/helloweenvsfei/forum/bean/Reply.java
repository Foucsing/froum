package com.helloweenvsfei.forum.bean;
import java.util.*;

import javax.persistence.*;


@Entity
@Table
public class Reply extends BaseBean {

	@ManyToOne
	@JoinColumn(name = "thread_id")
	private Thread thread;
	
	private String tittle;
	
	@Basic(fetch = FetchType.LAZY)
	@Column(columnDefinition = "longtext")
    private String content ;
	
	@ManyToOne
	@JoinColumn(name="author_id")
   
	  private Person author;
	 
	 private int floor;
	 private String ipCreated;
	public Thread getThread() {
		return thread;
	}
	public void setThread(Thread thread) {
		this.thread = thread;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Person getAuthor() {
		return author;
	}
	public void setAuthor(Person author) {
		this.author = author;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getIpCreated() {
		return ipCreated;
	}
	public void setIpCreated(String ipCreated) {
		this.ipCreated = ipCreated;
	}

}
