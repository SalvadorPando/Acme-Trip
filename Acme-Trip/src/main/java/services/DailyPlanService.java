package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.DailyPlanRepository;
import domain.DailyPlan;


@Service
@Transactional
public class DailyPlanService {

	@Autowired
	private DailyPlanRepository dailyPlanRepository;

	public DailyPlanService() {
		super();
	}
	
	public DailyPlan create(){
		return null;
	}
	

	public Collection<DailyPlan> findAll(){
		return dailyPlanRepository.findAll();
	}
	
	public DailyPlan findOne(int id_dailyPlan){
		return dailyPlanRepository.findOne(id_dailyPlan);
		
	}
	
	public void save(DailyPlan dailyPlan){
		dailyPlanRepository.save(dailyPlan);
	}
	
	public void delete(DailyPlan dailyPlan){
		dailyPlanRepository.delete(dailyPlan);
	}
	
}
