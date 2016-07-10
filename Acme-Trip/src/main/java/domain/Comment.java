package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Comment extends DomainEntity{
	
	//Attributes
	
	private String title;
	private Date momentWrite;
	private String text;
	private boolean inappropiate;
		
	//Constructor

	public Comment(){
		super();
	}
	
	//Getters && Setters
	
	@NotBlank
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	@NotNull
	@Past
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getMomentWrite() {
		return momentWrite;
	}

	public void setMomentWrite(Date momentWrite) {
		this.momentWrite = momentWrite;
	}
	
	@NotBlank
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean getInappropiate(){
		return inappropiate;
	}
	
	public void setInappropiate(boolean inappropiate){
		this.inappropiate = inappropiate;
	}

	//Relationships
	
	private Actor actor;
	private Trip trip;
	private Activity activity;
	
	@Valid
	@ManyToOne(optional = false)
	public Actor getActor() {
		return actor;
	}

	public void setActor(Actor actor) {
		this.actor = actor;
	}
	
	@Valid
	@ManyToOne(optional=true)
	public Trip getTrip(){
		return trip;
	}
	
	public void setTrip(Trip trip){
		this.trip = trip;
	}
	
	@Valid
	@ManyToOne(optional=true)
	public Activity getActivity(){
		return activity;
	}
	
	public void setActivity(Activity activity){
		this.activity = activity;
	}
		
}
