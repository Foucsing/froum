package com.helloweenvsfei.forum.bean;
import java.util.Date;

import javax.persistence.*;

@MappedSuperclass 
public class BaseBean {  //实体类父类
	
	@Id                   //id配置
	@GeneratedValue(strategy = GenerationType.AUTO)  //id配置规则 
	private Integer id;
	
	@Version
	private Integer version;   //版本列
	private boolean deleted;
	
	@Temporal(value =TemporalType.TIMESTAMP)
    private Date dateCreated;
}
