package com.helloweenvsfei.forum.bean;

import java.util.*;
import javax.persistence.*;


@Entity
@Table

public class Board extends BaseBean {

@ManyToOne
@JoinColumn(name = "category_id")
private Category category;
private String name;
private String description;
private int theadCount;
private int replyCount;

@ManyToOne
@JoinColumn(name = "last_thread_id")
private Thread lastThread; 
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name ="board_administrator",joinColumns = { @JoinColumn(name ="board_id")},inverseJoinColumns = {@JoinColumn(name = "person_id")})
private Set<Person> administrators = new HashSet<Person>();
public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getTheadCount() {
	return theadCount;
}
public void setTheadCount(int theadCount) {
	this.theadCount = theadCount;
}
public int getReplyCount() {
	return replyCount;
}
public void setReplyCount(int replyCount) {
	this.replyCount = replyCount;
}
public Thread getLastThread() {
	return lastThread;
}
public void setLastThread(Thread lastThread) {
	this.lastThread = lastThread;
}
public Set<Person> getAdministrators() {
	return administrators;
}
public void setAdministrators(Set<Person> administrators) {
	this.administrators = administrators;
}


}
