package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Activity extends DomainEntity implements Comentable{

	//Attributes

	private String title;
	private String description;
	private String photo;
	private boolean inappropiate;
	
	//Constructor
	
	public Activity(){
		super();
	}
	
	//Getters & setters
	
	@NotBlank
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@NotBlank
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@URL
	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public boolean getInappropiate(){
		return inappropiate;
	}
	
	public void setInappropiate(boolean inapporpiate){
		this.inappropiate = inapporpiate;
	}

	//Relationships
	private Collection<Comment> comments;
	private DailyPlan dailyPlan;
	private User user;
	private Type type;
	private Collection<Slot> slots;
	
	@Valid
	@OneToMany(mappedBy="activity")
	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
		
	}
	
	@Valid
	@ManyToOne(optional=false)
	public DailyPlan getDailyPlan(){
		return dailyPlan;
	}
	
	public void setDailyPlan(DailyPlan dailyPlan){
		this.dailyPlan = dailyPlan;
	}
	
	@Valid
	@ManyToOne(optional=true)
	public User getUser(){
		return user;
	}
	
	public void setUser(User user){
		this.user = user;
	}
	
	@Valid
	@ManyToOne(optional = false)
	public Type getType(){
		return type;
	}
	
	public void setType(Type type){
		this.type = type;
	}
	
	@Valid
	@OneToMany(mappedBy="activity", cascade=CascadeType.ALL)
	public Collection<Slot> getSlots(){
		return slots;
	}
	
	public void setSlots(Collection<Slot> slots){
		this.slots = slots;
	}

	
}
