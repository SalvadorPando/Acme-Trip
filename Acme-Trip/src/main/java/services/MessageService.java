package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.MessageRepository;
import domain.Message;


@Service
@Transactional
public class MessageService {

	@Autowired
	private MessageRepository messageRepository;

	public MessageService() {
		super();
	}
	
	public Message create(){
		return null;
	}
	

	public Collection<Message> findAll(){
		return messageRepository.findAll();
	}
	
	public Message findOne(int id_message){
		return messageRepository.findOne(id_message);
		
	}
	
	public void save(Message message){
		messageRepository.save(message);
	}
	
	public void delete(Message message){
		messageRepository.delete(message);
	}
	
}
