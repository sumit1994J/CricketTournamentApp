package tournament1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Venue {
		
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private String addVenue;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddVenue() {
	return addVenue;
}
public void setAddVenue(String addVenue) {
	this.addVenue = addVenue;
}
public Venue(int id, String addVenue) {
	super();
	this.id = id;
	this.addVenue = addVenue;
}
public Venue() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Venue [id=" + id + ", addVenue=" + addVenue + "]";
}
 

}
