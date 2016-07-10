package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.DailyPlan;

@Repository
public interface DailyPlanRepository extends JpaRepository<DailyPlan,Integer>{

	@Query("select avg(t.dailyPlans.size) from Trip t")
	public Double averageOfDailyPlansPerTrip();
	
	@Query("select stddev(t.dailyPlans.size) from Trip t")
	public Double standardDeviationOfDailyPlansPerTrip();
}
