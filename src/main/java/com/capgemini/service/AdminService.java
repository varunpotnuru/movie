package com.capgemini.service;

import java.util.Date;
import java.util.Scanner;

import com.capgemini.CollectionUtil.CollectionUtil;
import com.capgemini.bean.Movie;
import com.capgemini.bean.Screen;
import com.capgemini.bean.Show;
import com.capgemini.bean.Theatre;
import com.capgemini.dao.MovieDao;
import com.capgemini.dao.ScreenDao;
import com.capgemini.dao.ShowDao;
import com.capgemini.dao.TheatreDao;

public class AdminService {
	Scanner sc = new Scanner(System.in);
	TheatreDao theatredao=new TheatreDao();
	public Theatre addTheatre()
	{
		Theatre t=new Theatre();
	
		System.out.println("Enter theatre name");
		t.setTheatreName(sc.next());
		System.out.println("Enter theatre city");
		t.setTheatreCity(sc.next());
		System.out.println("enter manager name");
		t.setManagerName(sc.next());
		System.out.println("enter manager contact");
		t.setManagerContact(sc.next());
		return theatredao.addTheatre(t);
	}
	public Boolean removeTheatre()
	{
		System.out.println("Enter a theatreId to remove");
		return theatredao.deleteTheatre(sc.nextInt());
	}
	
	MovieDao moviedao = new MovieDao();
	public Movie addMovie()
	{
		Movie m=new Movie();
		System.out.println("Movie name");
		m.setMovieName(sc.next());
		System.out.println("Genre");
		m.setMovieGenre(sc.next());
		System.out.println("Enter movie Director");
		m.setMovieDirector(sc.next());
		System.out.println("Enter movie Length");
		m.setMovieLength(sc.nextInt());
		System.out.println("Movie release date");
		m.setMovieReleaseDate(new Date(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        return moviedao.addMovie(m);
	}
	public boolean removeMovie()
	{
		System.out.println("Enter a movie id to remove  ");
		return moviedao.deleteMovie(sc.nextInt());
		
	}
	ShowDao showdao = new ShowDao();
	public Show addShow( )
	{
		Show s =new Show();
		System.out.println("enter a show start time yyyy:mm:DD:HH:MM");
		s.setShowStartTime(new Date(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
        System.out.println("Enter a show end time yyyy:mm:DD:HH:MM");
		s.setShowEndTime(new Date(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
		System.out.println("enter a show name");
		s.setShowName(sc.next());
		System.out.println("enter a movie name");
		s.setMovieName(sc.next());
		System.out.println("Enter a screen id");
		s.setScreenId(sc.nextInt());
//		if(!screendao.checkScreen(s.getScreenId()))
//		{
//			return null;
//		}
        return showdao.addShow(s);
	}
	
	public boolean removeShow(Integer showId)
	{
		System.out.println("Enter a show id to remove  ");
		return showdao.deleteShow(showId);
		
	}
	ScreenDao screendao = new ScreenDao();
	public Screen addScreen()
	{
		Screen c =new Screen();
		System.out.println("enter a theatre id");
		c.setTheatreId(sc.nextInt());
        System.out.println("Enter a screen name");
		c.setScreenName(sc.next());
        System.out.println("Enter no. of rows");
		c.setRows(sc.nextInt());
        System.out.println("Enter no. of columns");
		c.setColumns(sc.nextInt());
        return c;
	}
	public Screen addScreen(Integer theatreid)
	{
		if(!theatredao.checkTheatre(theatreid))
		{
			System.out.println("Theatre Not exists please add theatre before adding screen");
			return null;
		}
		Screen c =new Screen();
		c.setTheatreId(theatreid);
        System.out.println("Enter a screen name");
		c.setScreenName(sc.next());
        System.out.println("Enter no. of rows");
		c.setRows(sc.nextInt());
        System.out.println("Enter no. of columns");
		c.setColumns(sc.nextInt());
		ScreenDao screendao=new ScreenDao();
		return screendao.addScreen(c);
	}
	public boolean checkTheatre(Integer id)
	{
		return theatredao.checkTheatre(id);
	}
	
	public boolean updateTheatre(Theatre t)
	{
		return theatredao.updateTheatre(t);
	}
	
	public Screen removeScreen()
	{
		System.out.println("Enter a screen id to remove  ");
		screendao.deleteScreen(sc.nextInt());
		return null;
	}
	public boolean UpdateScreen(Screen screen) {
		// TODO Auto-generated method stub
		CollectionUtil.screendetails.replace(screen.getScreenId(), screen);
		return true;
	}
    
	
	
}
