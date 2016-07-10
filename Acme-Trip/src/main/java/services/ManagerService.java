package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.ManagerRepository;
import domain.Manager;


@Service
@Transactional
public class ManagerService {

	@Autowired
	private ManagerRepository managerRepository;

	public ManagerService() {
		super();
	}
	
	public Manager create(){
		return null;
	}
	

	public Collection<Manager> findAll(){
		return managerRepository.findAll();
	}
	
	public Manager findOne(int id_manager){
		return managerRepository.findOne(id_manager);
		
	}
	
	public void save(Manager manager){
		managerRepository.save(manager);
	}
	
	public void delete(Manager manager){
		managerRepository.delete(manager);
	}
	
}
