package com.first.app.dao;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.first.app.entity.User;

@Repository
@Transactional
public class FirstAppDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean addUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		session.save(user);
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUsers(){
		String queryString = "from User a";
		Query query = sessionFactory.getCurrentSession().createQuery(queryString, User.class);
		return query.getResultList();
	}
}
