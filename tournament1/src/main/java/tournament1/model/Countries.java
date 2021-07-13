package tournament1.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Countries {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int cid;
private String countryName;

@OneToMany
private List<Player> player;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCountryName() {
	return countryName;
}
public void setCountryName(String countryName) {
	this.countryName = countryName;
}
public Countries(int cid, String countryName) {
	super();
	this.cid = cid;
	this.countryName = countryName;
}
public Countries() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Countries [cid=" + cid + ", countryName=" + countryName + "]";
}


}
