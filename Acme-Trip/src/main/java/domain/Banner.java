package domain;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Banner extends DomainEntity{
	
	private String photo;
	private String keyWord;
	private int numberDisplayed;
	private int nTimes;
	
	@NotBlank
	@URL
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	@NotBlank
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	
	@Min(1)
	public int getNumberDisplayed() {
		return numberDisplayed;
	}
	public void setNumberDisplayed(int numberDisplayed) {
		this.numberDisplayed = numberDisplayed;
	}
	
	@Min(1)
	public int getnTimes() {
		return nTimes;
	}
	public void setnTimes(int nTimes) {
		this.nTimes = nTimes;
	}
	
	//RelationShips
	private Campaign campaign;

	@Valid
	@ManyToOne(optional=false)
	public Campaign getCampaign() {
		return campaign;
	}
	
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	
	
	
	

}
