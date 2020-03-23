package com.capgemini.bean;

public class Theatre {
	private Integer theatreId;
	private String theatreName;
	private String theatreCity;
	private Movie[] listOfMovies;
	private Screen[] listOfScreens;
	private String managerName;
	private String managerContact;
	
	
	
	public Theatre() {
		
	}
	
	
	public Theatre(Integer theatreId, String theatreName, String theatreCity, 
			 String managerName, String managerContact) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
		this.managerName = managerName;
		this.managerContact = managerContact;
	
	}


	public Movie searchMovie(String movieName)
	{
		return null;
	}
	
	public Movie searchScreen(String movieName)
	{
		return null;
	}

	public Integer getTheatreId() {
		return theatreId;
	}


	public String getTheatreName() {
		return theatreName;
	}


	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}


	public String getTheatreCity() {
		return theatreCity;
	}


	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}


	public Movie[] getListOfMovies() {
		return listOfMovies;
	}


	public void setListOfMovies(Movie[] listOfMovies) {
		this.listOfMovies = listOfMovies;
	}


	public Screen[] getListOfScreens() {
		return listOfScreens;
	}


	public void setListOfScreens(Screen[] listOfScreens) {
		this.listOfScreens = listOfScreens;
	}


	public String getManagerName() {
		return managerName;
	}


	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}


	public String getManagerContact() {
		return managerContact;
	}


	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}


	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}


}
