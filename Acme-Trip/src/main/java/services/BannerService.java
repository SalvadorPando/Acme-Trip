package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.BannerRepository;
import domain.Banner;


@Service
@Transactional
public class BannerService {

	@Autowired
	private BannerRepository bannerRepository;

	public BannerService() {
		super();
	}
	
	public Banner create(){
		return null;
	}
	

	public Collection<Banner> findAll(){
		return bannerRepository.findAll();
	}
	
	public Banner findOne(int id_banner){
		return bannerRepository.findOne(id_banner);
		
	}
	
	public void save(Banner banner){
		bannerRepository.save(banner);
	}
	
	public void delete(Banner banner){
		bannerRepository.delete(banner);
	}
	
}
