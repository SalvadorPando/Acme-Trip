package domain;

import java.util.Collection;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.Valid;

@Entity
@Access(AccessType.PROPERTY)
public class User extends Actor{

	//Attributes
	
		//Constructor
		public User(){
			super();
		}
		
		//Getter & setter
		
		//Relationships
		private Collection<Activity> activities;
		private Collection<Group> groupBoss;
		private Collection<Group> userGroup;
		
		@Valid
		@OneToMany(mappedBy="user")
		public Collection<Activity> getActivities(){
			return activities;
		}
		
		public void setActivities(Collection<Activity> activities){
			this.activities = activities;
		}
		
		@Valid
		@OneToMany(mappedBy="boss")
		public Collection<Group> getGroupsBoss(){
			return groupBoss;
		}
		public void setGroupsBoss(Collection<Group> groupBoss){
			this.groupBoss = groupBoss;
		}
		
		@Valid
		@ManyToMany
		@JoinTable(name="Group_User")
		public Collection<Group> getGroupsMembers(){
			return userGroup;
		}
		
		public void setGroupsMembers(Collection<Group> userGroup){
			this.userGroup = userGroup;
		}

}
