package com.capgemini.dao;

import com.capgemini.CollectionUtil.CollectionUtil;
import com.capgemini.bean.Movie;

public class MovieDao {
	
	CollectionUtil col = new CollectionUtil();
	
	public Boolean deleteMovie(Integer movieId)
	{
		if(CollectionUtil.moviedetails.containsKey(movieId))
        {
	         CollectionUtil.moviedetails.remove(movieId);
	         System.out.println(movieId+" Successfully created");
	         return true;
        }
		
	   else
		   
		{
		   System.out.println("you have entered wrong movieid");
			  
		}
		return false;
	}
	public Movie addMovie(Movie m)
	{
		return CollectionUtil.addMovie(m);
    
}
}
