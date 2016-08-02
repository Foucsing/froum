package com.helloweenvsfei.forum.dao;
import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.helloweenvsfei.forum.dao.IDao;
public class DaoImpl<T> extends HibernateDaoSupport implements IDao<T> {
	@SuppressWarnings("unchecked")

	public T find (Class<T> clazz,int id){
		return (T) getHibernateTemplate().get(clazz,id);
	}


	@Override
	public void create(T baceBean) {
      getHibernateTemplate().persist(baceBean);		
	}

	@Override
	public void save(T baceBean) {
	      getHibernateTemplate().save(baceBean);		
		
	}

	@Override
	public void delete(T baseBean) {
	      getHibernateTemplate().delete(baseBean);		
		
	}

	@SuppressWarnings("unchecked")
	public List<T> list(String hql) {
    return 	getHibernateTemplate().find(hql);
	}

	@Override
	public int getTotalCount(String hql, Object... params) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<T> list(String hql, int firstResult, int maxSize,
			Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Query createQuery(String hql) {
	    return 	getSession().createQuery(hql);
	}
}
