package com.capgemini.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.spring.dao.ITraineeDao;
import com.capgemini.spring.entities.Trainee;

@Service
@Transactional
public class TraineeServiceImpl implements ITraineeService {

	private ITraineeDao traineeDao;
	
	public ITraineeDao getTraineeDao() {
		return traineeDao;
	}

	@Autowired
	public void setTraineeDao(ITraineeDao traineeDao) {
		this.traineeDao = traineeDao;
	}

	public void addTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		traineeDao.addTrainee(trainee);
	}

	public Trainee getTrainee(int tid) {
		// TODO Auto-generated method stub
		return traineeDao.getTrainee(tid);
	}
	
	public void deleteTraniee(int tid) {
		// TODO Auto-generated method stub
		traineeDao.deleteTraniee(tid);
	}

	public void updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		traineeDao.updateTrainee(trainee);
	}

	public List<Trainee> getAllTrainees() {
		// TODO Auto-generated method stub
		return traineeDao.getAllTrainees();
	}

}
