package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import domain.DailyPlan;

@Repository
public interface DailyPlanRepository extends JpaRepository<DailyPlan,Integer>{

	@Query("select count(dp)/(select count(t) from Trip t)*1.0 from DailyPlan dp")
	public double numDailyPlanPerTrip();
}
