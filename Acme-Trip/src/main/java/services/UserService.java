package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.UserRepository;
import domain.User;


@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserService() {
		super();
	}
	
	public User create(){
		return null;
	}
	

	public Collection<User> findAll(){
		return userRepository.findAll();
	}
	
	public User findOne(int id_user){
		return userRepository.findOne(id_user);
		
	}
	
	public void save(User user){
		userRepository.save(user);
	}
	
	public void delete(User user){
		userRepository.delete(user);
	}
	
}
