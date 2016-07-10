package repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Campaing;

@Repository
public interface CampaingRepository extends JpaRepository<Campaing,Integer>{

}
