package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Access(AccessType.PROPERTY)
@Table(name="\"Group\"")
public class Group extends DomainEntity{

	//Attributes
	private String name;
	
	//Constructor
	public Group(){
		super();
	}
	
	//Getter & setter
	@NotBlank
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	//RelationShips
	private Trip trip;
	private User boss;
	private Collection<User> groupsMembers;
	
	@Valid
	@ManyToOne(optional=false)
	public Trip getTrip(){
		return trip;
	}
	
	public void setTrip(Trip trip){
		this.trip = trip;
	}
	
	@Valid
	@ManyToOne(optional=false)
	public User getBoss(){
		return boss;
	}
	
	public void setBoss(User boss){
		this.boss = boss;
	}
	
	@Valid
	@ManyToMany
	@JoinTable(name="Group_User")
	public Collection<User> getGroupsMember(){
		return groupsMembers;
	}
	
	public void setGroupsMember(Collection<User> groupsMembers){
		this.groupsMembers = groupsMembers;
	}
}
