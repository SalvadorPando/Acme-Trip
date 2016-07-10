package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.CampaingRepository;
import domain.Campaing;


@Service
@Transactional
public class CampaingService {

	@Autowired
	private CampaingRepository campaingRepository;

	public CampaingService() {
		super();
	}
	
	public Campaing create(){
		return null;
	}
	

	public Collection<Campaing> findAll(){
		return campaingRepository.findAll();
	}
	
	public Campaing findOne(int id_campaing){
		return campaingRepository.findOne(id_campaing);
		
	}
	
	public void save(Campaing campaing){
		campaingRepository.save(campaing);
	}
	
	public void delete(Campaing campaing){
		campaingRepository.delete(campaing);
	}
	
}
