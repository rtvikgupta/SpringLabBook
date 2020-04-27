package com.capgemini.spring.dao;

import java.util.List;

import com.capgemini.spring.entities.Trainee;

public interface ITraineeDao {

	public void addTrainee(Trainee trainee);
	public Trainee getTrainee(int tid);
	public void deleteTraniee(int tid);
	public void updateTrainee(Trainee trainee);
	public List<Trainee> getAllTrainees();
}
