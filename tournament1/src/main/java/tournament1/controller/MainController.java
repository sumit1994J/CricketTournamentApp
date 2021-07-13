package tournament1.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import tournament1.dao.CricketDao;
import tournament1.model.Countries;
import tournament1.model.Player;
import tournament1.model.Result;
import tournament1.model.Team;
import tournament1.model.Venue;

@Controller
public class MainController {
	@Autowired
	private CricketDao cricketDao;
	
	@RequestMapping("/")
	public String home() 
	{
		return "index";
	}
	
	
	@RequestMapping("/playersHome")
	public String playerHome(Model m) 
	{
		m.addAttribute("title","Add Players");
		List<Player> players = cricketDao.getAllPlayers();
		m.addAttribute("players", players);
		return "players_Home";
	}
	
@RequestMapping("/addplayer")
public String addPlayer(Model m)
{
	m.addAttribute("title","Add Players");
	return "add_players_form";
}

@RequestMapping(value="handle-players",method = RequestMethod.POST)
public RedirectView hadndlePlayer(@ModelAttribute Player player,HttpServletRequest request)
{ 
	System.out.println(player);
	this.cricketDao.creatplayer(player);
	RedirectView redirectView = new RedirectView();
	redirectView.setUrl(request.getContextPath()+"/playersHome");
	return redirectView;
	
}

@RequestMapping("/playersHome/delete/{pid}")
public RedirectView deletePlayer(@PathVariable("pid") int  pid,HttpServletRequest request)
{
	this.cricketDao.deletePlayer(pid);
	RedirectView redirectView = new RedirectView();
	redirectView.setUrl(request.getContextPath()+"/playersHome");
	return redirectView;
	
	
}

//this is team relational methods
@RequestMapping("/teamHome")

public String teamHome(Model m)
{
	m.addAttribute("title","team info");
	List<Team> team = cricketDao.getAllTeam();
	m.addAttribute("allTeam",team);
	return "team_home";
}

	


@RequestMapping("/addTeam")
public String addTeam(Model m)
{
	m.addAttribute("title","Add teams");
	return "add_Team";
}

@RequestMapping(value="handle-teams",method = RequestMethod.POST)
public RedirectView hadndleTeam(@ModelAttribute Team team,HttpServletRequest request)
{ 
	System.out.println(team);
   this.cricketDao.createTeam(team);
	RedirectView redirectView = new RedirectView();
	redirectView.setUrl(request.getContextPath()+"/teamHome");
	return redirectView;
	
}

@RequestMapping("/teamHome/delete/{id}")
public RedirectView deleteTeam(@PathVariable("id") int id,HttpServletRequest request)
{ 
	 this.cricketDao.deleteTeam(id);
	RedirectView redirectView = new RedirectView();
	redirectView.setUrl(request.getContextPath()+"/teamHome");
	return redirectView;
	
}


/* this is Countries relational methods */

@RequestMapping("/CountriesHome")
public String countriesPage(Model m)
{
	m.addAttribute("title","countries info");
	List<Countries> allCountries = cricketDao.getAllCountries();
	m.addAttribute("allCountries",allCountries);
	return "countries_info";
}

@RequestMapping("/addCountries")
public String addCountries(Model m)
{
	m.addAttribute("title","Add countries");
	return "add_countries";
}



@RequestMapping(value="handle-countries",method = RequestMethod.POST)
public RedirectView hadndleCountries(@ModelAttribute Countries countries,HttpServletRequest request)
{ 
	System.out.println(countries);
   this.cricketDao.addCountries(countries);
	RedirectView redirectView = new RedirectView();
	redirectView.setUrl(request.getContextPath()+"/CountriesHome");
	return redirectView;
	
}
 @RequestMapping("/CountriesHome/delete/{id}")
public RedirectView deleteCountry(@PathVariable("id") int id,HttpServletRequest request)
{ 
	 this.cricketDao.deleteCountry(id);
	RedirectView redirectView = new RedirectView();
	redirectView.setUrl(request.getContextPath()+"/CountriesHome");
	return redirectView;
	
}

 @RequestMapping("/venue")
 public String Venuepage(Model m)
 {
 	m.addAttribute("title","venue");
 	String str="venue";
 	m.addAttribute("page",str);
 	 List<Venue> allVenue = cricketDao.getAllVenue();
 	m.addAttribute("allVenue",allVenue);
 	return "venue";
 }
 
 @RequestMapping("/addvenue")
 public String addVenue(Model m)
 {
	 m.addAttribute("page","addvenue");
	 return "venue";
 }
 
 @RequestMapping(value="handle-venue",method = RequestMethod.POST)
 public RedirectView hadndleCountries(@ModelAttribute Venue venue,HttpServletRequest request)
 { 
 	System.out.println(venue);
    this.cricketDao.addVenue(venue);
 	RedirectView redirectView = new RedirectView();
 	redirectView.setUrl(request.getContextPath()+"/venue");
 	return redirectView;
 }

 @RequestMapping("/venue/delete/{id}")
 public RedirectView deleteVenue(@PathVariable("id") int id,HttpServletRequest request)
 { 
 	 this.cricketDao.deleteVenue(id);
 	RedirectView redirectView = new RedirectView();
 	redirectView.setUrl(request.getContextPath()+"/venue");
 	return redirectView;
 	
 }

 @RequestMapping("/rslt")
 public String getResult(Model m)
 {
	 m.addAttribute("title","resultview");
	 String str="result";
	 m.addAttribute("page",str);
	 List<Result> allResult = this.cricketDao.getAllResult();
	 m.addAttribute("allResult",allResult);
	 return "result";
 }
 
 @RequestMapping("/addresult")
 public String addResult(Model m)
 {
	 m.addAttribute("page","addresult");
	 return "result";
 }
 
 @RequestMapping(value="handle-result", method = RequestMethod.POST)
 public RedirectView handleResult(@ModelAttribute Result result,HttpServletRequest request)
 {
	 System.out.println(result);
	 this.cricketDao.addResult(result);
	 RedirectView redirectView = new RedirectView();
	 redirectView.setUrl(request.getContextPath()+"/rslt");
	 return redirectView;
	 
 }
 
 @RequestMapping("/rslt/delete/{id}")
 public RedirectView deleteResult(@PathVariable("id") int id,HttpServletRequest request)
 { 
 	 this.cricketDao.deleteResult(id);
 	RedirectView redirectView = new RedirectView();
 	redirectView.setUrl(request.getContextPath()+"/rslt");
 	return redirectView;
 	
 }



 	
 


}
