package com.helloweenvsfei.forum.bean;
import java.util.Date;

import javax.persistence.*;

@MappedSuperclass 
public class BaseBean {  //ʵ���ุ��
	
	@Id                   //id����
	@GeneratedValue(strategy = GenerationType.AUTO)  //id���ù��� 
	private Integer id;
	
	@Version
	private Integer version;   //�汾��
	private boolean deleted;
	
	@Temporal(value =TemporalType.TIMESTAMP)
    private Date dateCreated;
}
