package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

@Entity
@Access(AccessType.PROPERTY)
public class Trip extends DomainEntity implements Comentable{

	private String title;
	private Date organisedDate;
	private String description;
	private String photo;
	
	@NotBlank
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Past
	public Date getOrganisedDate() {
		return organisedDate;
	}
	public void setOrganisedDate(Date organisedDate) {
		this.organisedDate = organisedDate;
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
	
	
	private Collection <DailyPlan> dailyPlans;
	private Collection <Group> groups;
	private Collection <Comment> comments;
	private User user;

	@NotNull
	@OneToMany(mappedBy="trip",cascade= CascadeType.ALL)
	public Collection<DailyPlan> getDailyPlans() {
		return dailyPlans;
	}

	public void setDailyPlans(Collection<DailyPlan> dailyPlans) {
		this.dailyPlans = dailyPlans;
	}

	@NotNull
	@OneToMany(mappedBy="trip")
	public Collection<Group> getGroups() {
		return groups;
	}

	public void setGroups(Collection<Group> groups) {
		this.groups = groups;
	}

	@NotNull
	@OneToMany(mappedBy="trip")
	public Collection<Comment> getComments() {
		return comments;
	}

	public void setComments(Collection<Comment> comments) {
		this.comments = comments;
	}

	@Valid
	@ManyToOne(optional=false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
