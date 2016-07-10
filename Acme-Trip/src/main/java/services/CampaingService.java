package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.CampaignRepository;
import domain.Campaign;


@Service
@Transactional
public class CampaingService {

	@Autowired
	private CampaignRepository campaignRepository;

	public CampaingService() {
		super();
	}
	
	public Campaign create(){
		return null;
	}
	

	public Collection<Campaign> findAll(){
		return campaignRepository.findAll();
	}
	
	public Campaign findOne(int id_campaing){
		return campaignRepository.findOne(id_campaing);
		
	}
	
	public void save(Campaign campaign){
		campaignRepository.save(campaign);
	}
	
	public void delete(Campaign campaign){
		campaignRepository.delete(campaign);
	}
	
}
