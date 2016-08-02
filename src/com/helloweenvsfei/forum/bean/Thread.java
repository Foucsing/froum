package com.helloweenvsfei.forum.bean;

import java.util.*;
import javax.persistence.*;


@Entity
@Table

public class Thread extends BaseBean {

	@ManyToOne
	@JoinColumn(name = "board_id")
	private Board board;
	private String title;
	
	@Basic(fetch = FetchType.LAZY)
	@Column (columnDefinition = "longtext")
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "author_id")
	
	private Person author;
	 private String ipCreated;
	 private int hit;
	 
	 @ManyToOne
	 @JoinColumn(name = "author_last_replied_id")
	 private Person authorLastReplied;
	 
	 @Temporal(TemporalType.TIMESTAMP)
    private Date dateLastReplied;
	  
	 private boolean readonly;
	 private boolean topped;
	 private int replyCount;
	 
	public Board getBoard() {
		return board;
	}
	public void setBoard(Board board) {
		this.board = board;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
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
	public String getIpCreated() {
		return ipCreated;
	}
	public void setIpCreated(String ipCreated) {
		this.ipCreated = ipCreated;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public Person getAuthorLastReplied() {
		return authorLastReplied;
	}
	public void setAuthorLastReplied(Person authorLastReplied) {
		this.authorLastReplied = authorLastReplied;
	}
	public Date getDateLastReplied() {
		return dateLastReplied;
	}
	public void setDateLastReplied(Date dateLastReplied) {
		this.dateLastReplied = dateLastReplied;
	}
	public boolean isReadonly() {
		return readonly;
	}
	public void setReadonly(boolean readonly) {
		this.readonly = readonly;
	}
	public boolean isTopped() {
		return topped;
	}
	public void setTopped(boolean topped) {
		this.topped = topped;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	 
}
