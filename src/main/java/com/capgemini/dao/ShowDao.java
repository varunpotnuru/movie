package com.capgemini.dao;

import com.capgemini.CollectionUtil.CollectionUtil;
import com.capgemini.bean.Show;

public class ShowDao {
	CollectionUtil col = new CollectionUtil();
	
	public Boolean deleteShow(Integer showId)
	{
		if(CollectionUtil.showdetails.containsKey(showId))
        {
	         CollectionUtil.showdetails.remove(showId);
	         System.out.println(showId+" Successfully created");
	         return true;
        }
		
	   else
		   
		{
		   System.out.println("you have entered wrong showid");
			  
		}
		return null;
	}
	public Show addShow(Show s)
	{
		return CollectionUtil.addShow(s);
	}

}
