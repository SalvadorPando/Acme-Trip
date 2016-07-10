package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
public class Type extends DomainEntity{

	//Attributes
	private String name;
	
	//Constructor
	public Type(){
		super();
	}
	
	@NotBlank
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	//RelationShips
	private Collection<Activity> activities;
	
	@Valid
	@OneToMany(mappedBy="type")
	public Collection<Activity> getActivities(){
		return activities;
	}
	
	public void setActivities(Collection<Activity> activities){
		this.activities = activities;
	}
}
