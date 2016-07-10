package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.SlotRepository;
import domain.Slot;


@Service
@Transactional
public class SlotService {

	@Autowired
	private SlotRepository slotRepository;

	public SlotService() {
		super();
	}
	
	public Slot create(){
		return null;
	}
	

	public Collection<Slot> findAll(){
		return slotRepository.findAll();
	}
	
	public Slot findOne(int id_slot){
		return slotRepository.findOne(id_slot);
		
	}
	
	public void save(Slot slot){
		slotRepository.save(slot);
	}
	
	public void delete(Slot slot){
		slotRepository.delete(slot);
	}
	
}
