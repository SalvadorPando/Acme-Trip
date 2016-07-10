package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;
import org.springframework.format.annotation.DateTimeFormat;


@Entity
@Access(AccessType.PROPERTY)
public class Slot extends DomainEntity{

	//Attibutes
	private String title;
	private String description;
	private String photo;
	private Date startTime;
	private Date endTime;
	
	//Constructor
	public Slot(){
		super();
	}
	
	//Getter & setter
	
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
		this.photo =photo;
	}
	
	@NotNull
	@Past
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getStartTime(){
		return startTime;
	}
	
	public void setStartTime(Date startTime){
		this.startTime = startTime;
	}
	
	@NotNull
	@Future //Parece ser que @Future vale -> https://docs.oracle.com/cd/E19798-01/821-1841/gircz/index.html
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getEndTime(){
		return endTime;
	}
	
	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}
	
	//RelationShips
	
	private Activity activity;
	private DailyPlan dailyPlan;
	
	@Valid
	@ManyToOne(optional = false)
	public Activity getActivity(){
		return activity;
	}
	
	public void setActivity(Activity activity){
		this.activity = activity;
	}

	public DailyPlan getDailyPlan() {
		return dailyPlan;
	}

	public void setDailyPlan(DailyPlan dailyPlan) {
		this.dailyPlan = dailyPlan;
	}
}
