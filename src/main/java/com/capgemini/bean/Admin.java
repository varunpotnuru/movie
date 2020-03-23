package com.capgemini.bean;

public class Admin 
{
	private String adminId;
	private String adminName;
	private String adminPassword;
	   private String adminContact;
	
	 	public Admin(String adminId, String adminName, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}


		public String getAdminId()
	 	{
		return adminId;
     	}


       public void setAdminId(String adminId) 
       {
		this.adminId = adminId;
	   }


       public String getAdminName() 
      {
		return adminName;
	  }

      public void setAdminName(String adminName) 
      {
		this.adminName = adminName;
	  }

     public String getAdminPassword() 
    {
		return adminPassword;
	}
     public void setAdminPassword(String adminPassword) 
     {
		this.adminPassword = adminPassword;
	 }
    
     public Screen addScreen(Screen screen)
     {
    	return null; 
     }
     public Boolean deleteScreen(Integer screenid)
     {
		return null;
    	 
     }
     public Show addShow(String show)
     {
		return null;
    	 
     }
     public Show deleteShow(Integer showid)
     {
		return null;
    	 
     }
     public Theatre addTheatre(Theatre theatre)
     {
    	 return null;
     }
     public Boolean deleteTheatre(Integer theatreId)
     {
    	 return null;
     }
     
     public Movie addMovie(Movie movie)
     {
    	 return null;
     }
     public Boolean deleteMovie(Integer movieid)
     {
    	 return null;
     }
     
     
     
     
     


}
