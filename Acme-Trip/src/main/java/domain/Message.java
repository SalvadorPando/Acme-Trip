package domain;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Message extends DomainEntity{
	
	private String subject;
	private String body;
	private Date momentSent;
	private Boolean starred;
	private Priority priority;
	
	@NotBlank
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@NotBlank
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	@NotNull
	@Past
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getMomentSent() {
		return momentSent;
	}
	public void setMomentSent(Date momentSent) {
		this.momentSent = momentSent;
	}
	
	public Boolean getStarred() {
		return starred;
	}
	public void setStarred(Boolean starred) {
		this.starred = starred;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	private Actor send;
	private Collection<Actor> recipients;
	private Collection<Folder> folders;

	@Valid
	@ManyToOne(optional=false)
	public Actor getSend() {
		return send;
	}
	public void setSend(Actor send) {
		this.send = send;
	}
	
	@NotNull
	@ManyToMany
	public Collection<Actor> getRecipients() {
		return recipients;
	}
	public void setRecipients(Collection<Actor> recipients) {
		this.recipients = recipients;
	}
	
	@NotNull
	@ManyToMany
	public Collection<Folder> getFolders() {
		return folders;
	}
	public void setFolders(Collection<Folder> folders) {
		this.folders = folders;
	}
	
	
	

}
