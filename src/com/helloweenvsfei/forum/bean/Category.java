package com.helloweenvsfei.forum.bean;
import java.util.*;
import javax.persistence.*;


@Entity
@Table
public class Category extends BaseBean {

	  private String name ;
	  
	  @OneToMany(mappedBy = "category")
	  private List<Board> boards = new ArrayList<Board>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Board> getBoards() {
		return boards;
	}

	public void setBoards(List<Board> boards) {
		this.boards = boards;
	}
	  
	
}
