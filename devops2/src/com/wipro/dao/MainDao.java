package com.wipro.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.model.MainModel;

@Repository("mainDao")
public class MainDao {
	@Autowired 
	SessionFactory sessionFactory;
	@Transactional
	public String toStore(MainModel mainModel)
	{
		sessionFactory.getCurrentSession().save(mainModel);
		return "hello";
	}
	@Transactional
	public List<MainModel> toshow()
	{
		List users =sessionFactory.getCurrentSession().createCriteria(MainModel.class).list();
		return users;
	}
	

}
