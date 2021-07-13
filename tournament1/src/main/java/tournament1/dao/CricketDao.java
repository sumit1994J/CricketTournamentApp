package tournament1.dao;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import tournament1.model.Countries;
import tournament1.model.Player;
import tournament1.model.Result;
import tournament1.model.Team;
import tournament1.model.Venue;

@Component
public class CricketDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	
	@Transactional
	public void creatplayer(Player player)
	{
		this.hibernateTemplate.save(player);
	}
	
	public List<Player> getAllPlayers()
	{
		List<Player> allPlayers = this.hibernateTemplate.loadAll(Player.class);
		return allPlayers;
	}
	
	@Transactional
	public void deletePlayer(int pid)
	{
		Player p1 = this.hibernateTemplate.load(Player.class, pid);
		this.hibernateTemplate.delete(p1);
	}
	
	public Player getPlayer(int pid)
	{
		return this.hibernateTemplate.get(Player.class,pid);
	}
	
	@Transactional
	public void createTeam(Team team)
	{
		this.hibernateTemplate.save(team);
	}

	public List<Team> getAllTeam()
	{
		List<Team> all = this.hibernateTemplate.loadAll(Team.class);
		return all;
		
	}

	@Transactional
	public void deleteTeam(int tid)
	{
		Team jam = this.hibernateTemplate.load(Team.class, tid);
		this.hibernateTemplate.delete(jam);
		
	}

	public Team getTeam(int tid)
	{
		return this.hibernateTemplate.get(Team.class, tid);
	}

	/* Countries operation */
	
	@Transactional
	public void addCountries(Countries countries)
	{
		this.hibernateTemplate.save(countries);
	}
	
	public List<Countries> getAllCountries()
	{
		List<Countries> allCountries = this.hibernateTemplate.loadAll(Countries.class);
		return allCountries;
	}
	
	@Transactional
	public void deleteCountry(int cid)
	{
		Countries country = this.hibernateTemplate.load(Countries.class, cid);
		this.hibernateTemplate.delete(country);
	}
	
	public Countries getCountry(int cid)
	{
		return this.hibernateTemplate.get(Countries.class, cid);
	}
	

	/*  venue operation */
	
	@Transactional
	public void addVenue(Venue venue)
	{
		this.hibernateTemplate.save(venue);
	}
	
	public List<Venue> getAllVenue()
	{
		 List<Venue> max = this.hibernateTemplate.loadAll(Venue.class);
		return max;
	}
	
	@Transactional
	public void deleteVenue(int vid)
	{
		 Venue max = this.hibernateTemplate.load(Venue.class, vid);
		this.hibernateTemplate.delete(max);
	}
	
	public Countries getVenue(int vid)
	{
		return this.hibernateTemplate.get(Countries.class, vid);
	}
	
	
	/* result operation */
	@Transactional
	public void addResult(Result result)
	{
		this.hibernateTemplate.save(result);
	}
	
	public List<Result> getAllResult()
	{
		 List<Result> max = this.hibernateTemplate.loadAll(Result.class);
		return max;
	}
	
	@Transactional
	public void deleteResult(int id)
	{
		Result max = this.hibernateTemplate.load(Result.class, id);
		this.hibernateTemplate.delete(max);
	}
	
	public Result getResult(int id)
	{
		return this.hibernateTemplate.get(Result.class, id);
	}
	

	
}
