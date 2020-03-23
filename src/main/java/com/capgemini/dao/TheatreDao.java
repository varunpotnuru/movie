package com.capgemini.dao;

import java.util.Iterator;

import com.capgemini.CollectionUtil.CollectionUtil;
import com.capgemini.bean.Screen;
import com.capgemini.bean.Theatre;
import com.capgemini.service.AdminService;

public class TheatreDao {
	CollectionUtil colu = new CollectionUtil();
	
	public Theatre addTheatre(Theatre t)
	{
		return CollectionUtil.addTheatre(t);
	}
	
	public boolean deleteTheatre(Integer theatreid)
	{
		if(CollectionUtil.theatredetails.containsKey(theatreid))
        {
			 removeAllScreens(theatreid);
	         CollectionUtil.theatredetails.remove(theatreid);
	         return true;
        }
		
	   else
		   
		{
		   System.out.println("you have entered wrong Theatreid");	  
		}
		return false;
	}
	public boolean updateTheatre(Theatre t)
	{
		CollectionUtil.theatredetails.replace(t.getTheatreId(), t);
		return false;
	}
	public boolean addScreenToTheatre(Screen screen)
	{ 
		if( checkTheatre(screen.getTheatreId()))
		{
			Screen[] screenlist=CollectionUtil.theatredetails.get(screen.getTheatreId()).getListOfScreens();
			if(screenlist==null)
			{
				screenlist=new Screen[]{screen};
				return true;
			}
			Screen[] tempScreenList=new Screen[screenlist.length+1];
			for (int i = 0; i < screenlist.length; i++) {
				tempScreenList[i]=screenlist[i];
			}
			tempScreenList[screenlist.length]=screen;
			Theatre t=CollectionUtil.theatredetails.get(screen.getTheatreId());
			t.setListOfScreens(tempScreenList);
			CollectionUtil.theatredetails.replace(screen.getTheatreId(), t);
			return true;
		}
		return false;
	}
	
	
	public void deleteScreenFromTheatre(Screen screen)
	{
		Theatre t=CollectionUtil.theatredetails.get(screen.getTheatreId());
		Screen[] screenlist=new Screen[t.getListOfScreens().length];
		int itr=0;
		for (int i = 0; i < t.getListOfScreens().length; i++) {
			
			if(!t.getListOfScreens()[i].equals(screen))
			{
				screenlist[itr]=t.getListOfScreens()[i];
				itr++;
			}
		}
		t.setListOfScreens(screenlist);
		CollectionUtil.theatredetails.replace(screen.getTheatreId(), t);
	}
	
	public void removeAllScreens(Integer theatreid)
	{
		Theatre t=colu.theatredetails.get(theatreid);
		for (Screen screen : t.getListOfScreens()) {
			CollectionUtil.screendetails.remove(screen.getScreenId()); 
			
			
		}
	}
	
	public boolean checkTheatre(Integer id)
	{
		return CollectionUtil.theatredetails.get(id)==null?false:true;
	
	}

}
