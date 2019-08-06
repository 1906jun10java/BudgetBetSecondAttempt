package com.revature.beans;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository(value="userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {
	private SessionFactory sf;
	
	@Autowired
	public UserDAOImpl(SessionFactory sf) {
		this.sf= sf;
	}

	@Override
	public List<User> getAllUsers() {
		Session s = sf.getCurrentSession();
		return s.createQuery("from User_Table").getResultList();
		
	}

	@Override
	public User getUserByEmail(String email) {
		return sf.getCurrentSession().get(User.class, email);
		
	}

	@Override
	public User getUserById(int id) {
		return sf.getCurrentSession().get(User.class, id);
		
	}

	@Override
	public void createUser(User u) {
		sf.getCurrentSession().persist(u);
		
	}

	@Override
	public void updateUser(User u) {
		sf.getCurrentSession().update(u);
		
	}

	@Override
	public void removeUser(User u) {
		sf.getCurrentSession().delete(u);
		
	}

}
