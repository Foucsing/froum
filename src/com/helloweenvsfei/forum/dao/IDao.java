package com.helloweenvsfei.forum.dao;
import org.hibernate.Query;

import java.util.List;


public interface IDao <T>{
	public T find (Class<T> clazz,int id);
	public void create(T baceBean);
    public void save (T baceBean);
    public void delete(T baseBean);
    public List <T> list(String hql);
    public int getTotalCount(String hql,Object... params);
    public List<T> list(String hql,int firstResult,int maxSize,Object... params);
    public Query  createQuery(String hql);
}
