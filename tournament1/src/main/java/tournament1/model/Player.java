package tournament1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Player {
@Id	
@GeneratedValue(strategy = GenerationType.AUTO)
 private  int pid;
 private String playername;
 private String playerType;
 
 @ManyToOne
 private Countries countries;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPlayername() {
	return playername;
}
public void setPlayername(String playername) {
	this.playername = playername;
}
public String getPlayerType() {
	return playerType;
}
public void setPlayerType(String playerType) {
	this.playerType = playerType;
}
public Player(int pid, String playername, String playerType) {
	super();
	this.pid = pid;
	this.playername = playername;
	this.playerType = playerType;
}
public Player() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Player [pid=" + pid + ", playername=" + playername + ", playerType=" + playerType + "]";
}
 
 
}
