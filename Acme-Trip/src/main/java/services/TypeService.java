package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import domain.Type;


@Service
@Transactional
public class TypeService {

	@Autowired
	private TypeService typeService;

	public TypeService() {
		super();
	}
	
	public Type create(){
		return null;
	}
	

	public Collection<Type> findAll(){
		return typeService.findAll();
	}
	
	public Type findOne(int id_type){
		return typeService.findOne(id_type);
		
	}
	
	public void save(Type type){
		typeService.save(type);
	}
	
	public void delete(Type type){
		typeService.delete(type);
	}
	
}
