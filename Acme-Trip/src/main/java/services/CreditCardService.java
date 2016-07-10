package services;

import java.util.Collection;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import repositories.CreditCardRepository;
import domain.CreditCard;


@Service
@Transactional
public class CreditCardService {

	@Autowired
	private CreditCardRepository creditCardRepository;

	public CreditCardService() {
		super();
	}
	
	public CreditCard create(){
		return null;
	}
	

	public Collection<CreditCard> findAll(){
		return creditCardRepository.findAll();
	}
	
	public CreditCard findOne(int id_creditCard){
		return creditCardRepository.findOne(id_creditCard);
		
	}
	
	public void save(CreditCard creditCard){
		creditCardRepository.save(creditCard);
	}
	
	public void delete(CreditCard creditCard){
		creditCardRepository.delete(creditCard);
	}
	
}
