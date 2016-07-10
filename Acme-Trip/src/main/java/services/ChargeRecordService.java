package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.ChargeRecordRepository;
import domain.ChargeRecord;


@Service
@Transactional
public class ChargeRecordService {

	@Autowired
	private ChargeRecordRepository chargeRecordRepository;

	public ChargeRecordService() {
		super();
	}
	
	public ChargeRecord create(){
		return null;
	}
	

	public Collection<ChargeRecord> findAll(){
		return chargeRecordRepository.findAll();
	}
	
	public ChargeRecord findOne(int id_chargeRecord){
		return chargeRecordRepository.findOne(id_chargeRecord);
		
	}
	
	public void save(ChargeRecord chargeRecord){
		chargeRecordRepository.save(chargeRecord);
	}
	
	public void delete(ChargeRecord chargeRecord){
		chargeRecordRepository.delete(chargeRecord);
	}
	
}
