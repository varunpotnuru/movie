package com.capgemini.dao;

import com.capgemini.CollectionUtil.CollectionUtil;
import com.capgemini.bean.Screen;
import com.capgemini.bean.Show;
import com.capgemini.service.AdminService;

public class ScreenDao {
CollectionUtil col = new CollectionUtil();
	
	public ScreenDao()
	{
		
	}
	public Boolean deleteScreen(Integer screenId)
	{
		if(CollectionUtil.screendetails.containsKey(screenId))
        {
			removeAllShows(screenId);

			TheatreDao tdao=new TheatreDao();
			tdao.deleteScreenFromTheatre(CollectionUtil.screendetails.get(screenId));
	         CollectionUtil.screendetails.remove(screenId);
	         return true;
        }
		
	   else
		   
		{
		   System.out.println("you have entered wrong showid");
			  
		}
		return null;

  }
	public void removeAllShows(Integer id)
	{
		for (Show show : CollectionUtil.screendetails.get(id).getShowList()) {
			CollectionUtil.showdetails.remove(show.getShowId());
		}
	}
	public void addShow(Screen screen,Show show)
	{
		Show[] showList=screen.getShowList();
		if(showList==null)
		{
			showList=new Show[]{show};
			return;
		}
		Show[] tempShowList=new Show[showList.length+1];
		for (int i = 0; i < showList.length; i++) {
			tempShowList[i]=showList[i];
		}
		tempShowList[showList.length]=show;
		AdminService adminservice=new AdminService();
		Screen updatedScreen=screen;
		updatedScreen.setShowList(tempShowList);
		if(adminservice.UpdateScreen(updatedScreen))
		{
			System.out.println("Show successfully updated");
		}
	}
	public Screen addScreen(Screen s)
	{
		return CollectionUtil.addScreen(s);
	}
	public boolean checkScreen(Integer id)
	{
		if(CollectionUtil.screendetails.get(id)==null)
		{
			return false;
		}
		return true;
	}
}
