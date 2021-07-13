package tournament1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Result {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String result;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
public Result(int id, String result) {
	super();
	this.id = id;
	this.result = result;
}
public Result() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Result [id=" + id + ", result=" + result + "]";
}

}
