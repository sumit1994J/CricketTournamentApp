package tournament1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private String teamName;
 private String teamCountry;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTeamName() {
	return teamName;
}
public void setTeamName(String teamName) {
	this.teamName = teamName;
}
public String getTeamCountry() {
	return teamCountry;
}
public void setTeamCountry(String teamCountry) {
	this.teamCountry = teamCountry;
}
public Team(int id, String teamName, String teamCountry) {
	super();
	this.id = id;
	this.teamName = teamName;
	this.teamCountry = teamCountry;
}
public Team() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Team [id=" + id + ", teamName=" + teamName + ", teamCountry=" + teamCountry + "]";
}
 
 
}
