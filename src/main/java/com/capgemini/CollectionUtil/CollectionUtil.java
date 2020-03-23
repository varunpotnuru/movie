package com.capgemini.CollectionUtil;

import java.util.HashMap;
import java.util.Map;

import com.capgemini.bean.Movie;
import com.capgemini.bean.Screen;
import com.capgemini.bean.Show;
import com.capgemini.bean.Theatre;
import com.capgemini.dao.TheatreDao;
import com.capgemini.service.AdminService;


public class CollectionUtil 
{
	public static Map<Integer,Movie> moviedetails = new HashMap<Integer,Movie>();
	public static Map<Integer,Theatre> theatredetails = new HashMap<Integer,Theatre>();
	public static Map<Integer,Show> showdetails  = new HashMap<Integer,Show>();
	public static Map<Integer,Screen> screendetails =new HashMap<Integer,Screen>();
	
	
	static Integer theatreid_generator = 2000;
	static Integer Movieid_generator = 3000;
	static Integer Showid_generator = 1;
	static Integer Screenid_generator = 1;
	
  
   public static Map<Integer, Theatre> details()
	{
		return theatredetails;
	}
   public void TheatreCollection()
   {
	   
   }
   public static Theatre addTheatre(Theatre t )
   {
	   t.setTheatreId(theatreid_generator);
	   AdminService adminservice=new AdminService();
	   Screen[] screenlist=new Screen[1];
	   screenlist[0]=adminservice.addScreen(theatreid_generator);
	   t.setListOfScreens(screenlist);
	   theatredetails.put(theatreid_generator,t);
	   if(theatredetails.get(theatreid_generator)==null)
	   {
		   System.out.println(theatreid_generator);
		   System.out.println(t.getTheatreName()+"theatre is not added");
		   return null;
	   }
	   theatreid_generator = theatreid_generator+1;
	   return theatredetails.get(theatreid_generator-1);
   }
    
   static
   {

   }
   
   public static Map<Integer,Movie> detailsMovie()
   {
	return moviedetails;
	   
   }
   public static Movie addMovie(Movie m )
   {
	   m.setMovieId(Movieid_generator);
	   moviedetails.put(Movieid_generator,m);
	   if(moviedetails.get(Movieid_generator)==null)
	   {
		   System.out.println(Movieid_generator);
		   System.out.println(m.getMovieName()+"movie is not added");
		   return null;
	   }
	   Movieid_generator = Movieid_generator+1;
	   return moviedetails.get(Movieid_generator-1);
   }
   
   public static Map<Integer,Show> detailsShow()
   {
	return showdetails;
	   
   }
   public static Show addShow(Show s)
   {
	   s.setShowId(Showid_generator);
	   showdetails.put(Showid_generator,s);
	   if(showdetails.get(Showid_generator)==null)
	   {
		   System.out.println(theatreid_generator);
		   System.out.println(s.getShowName()+"show is not added");
		   return null;
	   }
	   Showid_generator = Showid_generator+1;
	   return showdetails.get(Showid_generator-1);
   }
   

   public static Screen addScreen(Screen s)
   {
	   
	   
	   s.setScreenId(Screenid_generator);
	   screendetails.put(Screenid_generator,s);
	   if(screendetails.get(Screenid_generator)==null)
	   {
		   System.out.println(Showid_generator);
		   System.out.println(s.getScreenName()+"screen is not added");
		   return null;
	   }
	   TheatreDao tdao=new TheatreDao();
	   tdao.addScreenToTheatre(s);
	   Screenid_generator = Screenid_generator+1;
	   return screendetails.get(Screenid_generator-1);
   }

	
	
	
	

}
