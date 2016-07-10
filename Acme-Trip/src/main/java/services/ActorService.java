package services;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import repositories.ActorRepository;
import domain.Actor;

@Service
@Transactional
public class ActorService {
	
	@Autowired
	private ActorRepository actorRepository;

	public ActorService() {
		super();
	}
	
	public Actor create(){
		return null;
	}
	

	public Collection<Actor> findAll(){
		return actorRepository.findAll();
	}
	
	public Actor findOne(int id_actor){
		return actorRepository.findOne(id_actor);
		
	}
	
	public void save(Actor actor){
		actorRepository.save(actor);
	}
	
	public void delete(Actor actor){
		actorRepository.delete(actor);
	}
	

}
