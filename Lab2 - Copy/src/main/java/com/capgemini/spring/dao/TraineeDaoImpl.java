package com.capgemini.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.capgemini.spring.entities.Trainee;

@Repository
public class TraineeDaoImpl implements ITraineeDao {

	private EntityManager em;
	
	public EntityManager getEm() {
		return em;
	}

	@PersistenceContext
	public void setEm(EntityManager em) {
		this.em = em;
	}

	public void addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		em.persist(trainee);
	}

	public Trainee getTrainee(int tid) {
		// TODO Auto-generated method stub
		Trainee trainee = em.find(Trainee.class, tid);
		return trainee;
	}

	public void deleteTraniee(int tid) {
		// TODO Auto-generated method stub
		em.remove(em.getReference(Trainee.class, tid));
	}
	
	public void updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		em.merge(trainee);
	}

	public List<Trainee> getAllTrainees() {
		// TODO Auto-generated method stub
		List<Trainee> trainees = em.createQuery("FROM Trainee", Trainee.class).getResultList();
		return trainees;
	}

}
