package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
@Access(AccessType.PROPERTY)
public class CreditCard extends DomainEntity{
	
	private String holderName;
	private String brandName;
	private String number;
	private Integer expirationMonth;
	private Integer expirationYear;
	private Integer cvv;
		
		
	@NotBlank
	public String getHolderName() {
		return holderName;
	}
	
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
		
	@NotBlank
	public String getBrandName() {
		return brandName;
	}
	
	public void setBrandName(String brandName) {
			this.brandName = brandName;
		}
		
	@NotBlank
	@CreditCardNumber
	public String getNumber() {
		return number;
	}
		
	public void setNumber(String number) {
		this.number = number;
	}
	
	@Range(min=1, max=12)
	public Integer getExpirationMonth() {
		return expirationMonth;
	}
		
	public void setExpirationMonth(Integer expirationMonth) {
		this.expirationMonth = expirationMonth;
	}
		
	public Integer getExpirationYear() {
		return expirationYear;
	}
	
	public void setExpirationYear(Integer expirationYear) {
		this.expirationYear = expirationYear;
	}
		
	@Range(min=100, max = 999)
	public Integer getCvv() {
		return cvv;
	}
	
	public void setCvv(Integer cvv) {
		this.cvv = cvv;
	}
	
	//RelationShip
	private Manager manager;

	@Valid
	@ManyToOne(optional=true)
	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	


}
