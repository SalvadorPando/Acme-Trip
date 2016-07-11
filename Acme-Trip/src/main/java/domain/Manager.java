package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
@Access(AccessType.PROPERTY)
public class Manager extends Actor{

	//RelationShip
	private Collection<CreditCard> creditCards;
    private Collection<Campaign> campaigns;

	@NotNull
	@OneToMany(mappedBy="manager")
	public Collection<CreditCard> getCreditCards() {
		return creditCards;
	}

	public void setCreditCards(Collection<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}

	@NotNull
	@OneToMany(mappedBy="manager")
	public Collection<Campaign> getCampaigns() {
		return campaigns;
	}

	public void setCampaigns(Collection<Campaign> campaigns) {
		this.campaigns = campaigns;
	}

}
