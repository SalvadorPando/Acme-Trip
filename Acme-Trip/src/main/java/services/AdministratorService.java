package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.AdministratorRepository;
import domain.Administrator;


@Service
@Transactional
public class AdministratorService {

	@Autowired
	private AdministratorRepository administratorRepository;

	public AdministratorService() {
		super();
	}
	
	public Administrator create(){
		return null;
	}
	

	public Collection<Administrator> findAll(){
		return administratorRepository.findAll();
	}
	
	public Administrator findOne(int id_administrator){
		return administratorRepository.findOne(id_administrator);
		
	}
	
	public void save(Administrator administrator){
		administratorRepository.save(administrator);
	}
	
	public void delete(Administrator administrator){
		administratorRepository.delete(administrator);
	}
}
