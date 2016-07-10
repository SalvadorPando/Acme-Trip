package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Campaing extends DomainEntity{

	private Date startMoment;
	private Date endMoment;
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getStartMoment() {
		return startMoment;
	}
	public void setStartMoment(Date startMoment) {
		this.startMoment = startMoment;
	}
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getEndMoment() {
		return endMoment;
	}
	public void setEndMoment(Date endMoment) {
		this.endMoment = endMoment;
	}
	
	//RelationShip
	
	private Manager manager;
	private CreditCard creditCard;
	private Collection<Banner> banners;
	private Collection<ChargeRecord> chargeRecords;

	@Valid
	@ManyToOne(optional=true)
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	
	@Valid
	@ManyToOne(optional=true)
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	
	@NotNull
	@OneToMany(mappedBy="campaing")
	public Collection<Banner> getBanners() {
		return banners;
	}
	public void setBanners(Collection<Banner> banners) {
		this.banners = banners;
	}
	
	@NotNull
	@OneToMany(mappedBy="campaing")
	public Collection<ChargeRecord> getChargeRecords() {
		return chargeRecords;
	}
	public void setChargeRecords(Collection<ChargeRecord> chargeRecords) {
		this.chargeRecords = chargeRecords;
	}
	

	
}
