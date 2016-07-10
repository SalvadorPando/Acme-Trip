package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.ActivityRepository;
import domain.Activity;


@Service
@Transactional
public class ActivityService {

	@Autowired
	private ActivityRepository activityRepository;

	public ActivityService() {
		super();
	}
	
	public Activity create(){
		return null;
	}
	

	public Collection<Activity> findAll(){
		return activityRepository.findAll();
	}
	
	public Activity findOne(int id_activity){
		return activityRepository.findOne(id_activity);
		
	}
	
	public void save(Activity activity){
		activityRepository.save(activity);
	}
	
	public void delete(Activity activity){
		activityRepository.delete(activity);
	}
	
}
