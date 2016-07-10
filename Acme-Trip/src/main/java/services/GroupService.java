package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.GroupRepository;
import domain.Group;


@Service
@Transactional
public class GroupService {

	@Autowired
	private GroupRepository groupRepository;

	public GroupService() {
		super();
	}
	
	public Group create(){
		return null;
	}
	

	public Collection<Group> findAll(){
		return groupRepository.findAll();
	}
	
	public Group findOne(int id_group){
		return groupRepository.findOne(id_group);
		
	}
	
	public void save(Group group){
		groupRepository.save(group);
	}
	
	public void delete(Group group){
		groupRepository.delete(group);
	}
	
}
