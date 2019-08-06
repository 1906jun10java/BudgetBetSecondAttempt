package com.revature.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.revature.beans.Credentials;
import com.revature.beans.User;

@Repository(value="credentialsDAO")
@Transactional
public class CredentialsDAOImpl implements CredentialsDAO {
	private SessionFactory sf;
	
	@Autowired
	public CredentialsDAOImpl(SessionFactory sf) {
		this.sf= sf;
	}

	@Override
	public List<Credentials> getAllUsers() {
		Session s = sf.getCurrentSession();
		return s.createQuery("from Credentials").getResultList();
		
	}

	@Override
	public Credentials getCredentialsByEmail(String email) {
		return sf.getCurrentSession().get(Credentials.class, email);
		
	}

	@Override
	public void createCredentials(Credentials c) {
		sf.getCurrentSession().persist(c);
		
	}

	@Override
	public void updateCredentials(Credentials c) {
		sf.getCurrentSession().update(c);
		
	}

	@Override
	public void removeCredentials(Credentials c) {
		sf.getCurrentSession().delete(c);
		
	}

}
