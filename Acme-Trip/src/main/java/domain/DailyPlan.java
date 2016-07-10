package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class DailyPlan extends DomainEntity{

	//Attributes
	private int weekDay;
	private String title;
	private String description;
	private String photo;
	
	//Constructor
	public DailyPlan(){
		super();
	}
	
	@Min(1)
	@Max(7)
	public int getWeekDay(){
		return weekDay;
	}
	
	public void setWeekDay(int weekDay){
		this.weekDay = weekDay;
	}
	
	@NotBlank
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	@NotBlank
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description){
		this.description = description;
	}
	
	@URL
	public String getPhoto(){
		return photo;
	}
	
	public void setPhoto(String photo){
		this.photo = photo;
	}
	
	//RelationShips
	
	private Trip trip;
	private Collection<Activity> activities;
	private Collection<Slot> slots;
	
	@Valid
	@ManyToOne(optional = false)
	public Trip getTrip(){
		return trip;
	}
	
	public void setTrip(Trip trip){
		this.trip = trip;
	}
	
	@Valid
	@OneToMany(mappedBy="dailyPlan")
	public Collection<Activity> getActivities(){
		return activities;
	}
	
	public void setActivities(Collection<Activity> activities){
		this.activities = activities;
	}

	@Valid
	@OneToMany(mappedBy="dailyPlan", cascade=CascadeType.ALL)
	public Collection<Slot> getSlots() {
		return slots;
	}

	public void setSlots(Collection<Slot> slots) {
		this.slots = slots;
	}
	
}


