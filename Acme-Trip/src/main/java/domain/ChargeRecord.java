package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

@Entity
@Access(AccessType.PROPERTY)
public class ChargeRecord extends DomainEntity{
	
	private Date createMoment;
	private Double amount;
	private Double tax;
	
	@Past
	@NotNull
	public Date getCreateMoment() {
		return createMoment;
	}
	public void setCreateMoment(Date createMoment) {
		this.createMoment = createMoment;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getTax() {
		return tax;
	}
	public void setTax(Double tax) {
		this.tax = tax;
	}
	
	
	//RelationShip
	private Campaign campaign;
	
	@Valid
	@ManyToOne(optional=false)
	public Campaign getCampaing() {
		return campaign;
	}
	public void setCampaing(Campaign campaign) {
		this.campaign = campaign;
	}
	
	
	

}
