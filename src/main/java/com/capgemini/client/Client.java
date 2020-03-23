package com.capgemini.client;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.capgemini.bean.Movie;
import com.capgemini.bean.Screen;
import com.capgemini.bean.Show;
import com.capgemini.bean.Theatre;
import com.capgemini.service.AddTheatreException;
import com.capgemini.service.AdminService;
import com.capgemini.service.Validation;
public class Client
{
	public static void main(String args[])
	{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
AdminService service=new AdminService();

while(true) {
	System.out.println("==============MENU====================");
    System.out.println("1. Generate Admin Functions ");
    System.out.println("2.ADD THEATRE");
	System.out.println("3.ADD MOVIE");
	System.out.println("4.ADD SCREEN");
	System.out.println("5.ADD SHOW");
	System.out.println("6 REMOVE SHOW");
	System.out.println("7 REMOVE SCREEN");
	System.out.println("8 REMOVE MOVIE");
	System.out.println("9 REMOVE THEATRE");
    System.out.println("10. EXIT");
    System.out.println("Enter your choice\n");
    String choice;
	try {
		choice = br.readLine();
		switch (choice) {
		case "1":
			int p_c,qty;
			System.out.println("1.Enter admin id ");
			System.out.println("Enter the admin password: ");
			while(true)
			{
			String product_code=br.readLine();
			boolean b1 = Validation.validatedata(product_code,Validation.idpattern);
			if(b1 == true)
			{
				try 
				{
					p_c = Integer.parseInt(product_code);
					break;
				}
				catch(Exception e)
				{
					System.out.println("Enter Again!!!");
				}
			}
			else
			{
				System.out.println("Wrong details Enter Again!!!");
			}
			}
			
			while(true)
			{
			String password=br.readLine();
			boolean b1 = Validation.validatedata(password, Validation.passwordpattern);
			if(b1 == true)
			{
				try 
				{	
					qty = Integer.parseInt(password);
					break;
				}
				catch(Exception e)
				{
					System.out.println("Enter Again!!!");				}
			}
			else
			{
				System.out.println("Wrong input.Enter Valid characters/Numbers:");
			}
			
			
		  }
		case "2":
			
			System.out.println("enter the theatre details");
			
			Theatre t = service.addTheatre();
			System.out.println("added theatre is :" +t.getTheatreName());
			
		case "3":
			
			System.out.println("enter the movie details");
			Movie m = service.addMovie();
			System.out.println("added movie is " +m.getMovieName());
			break;
			
		case "4":
			
			System.out.println("enter the screen details");
			Screen c = service.addScreen();
			System.out.println("added screen is" + c.getScreenName());
			break;
	
		case "5":
			System.out.println("enter the show details");
			Show s = service.addShow();
			System.out.println("added show is :" +s.getShowName());
			break;
			
		case "6":
			
			System.out.println("enter the showid to remove");
			Show s1 = service.addShow();
			System.out.println(service.removeShow(1));
			break;
			
		case "7":
			
			
			System.out.println("enter the movieid to remove");
			Movie m1 = service.addMovie();
			System.out.println(service.removeMovie());
			break;
			
		case "8":
			
			System.out.println("enter the screenid to remove");
		   Screen c1 = service.addScreen();
			System.out.println(service.removeScreen());
			break;
		
		case "9":
			
			System.out.println("enter the theatreid to remove");
			Theatre t1 = service.addTheatre();
			System.out.println(service.removeTheatre());
			break;
			
		case "10":
			
			System.out.println("thank u have a nice day");
			break;
		default:
			System.out.println("ENTER VALID CHOICE");    
			
			
			
	} 
	}
		catch (Exception e) 
		{
		  System.out.println("PLEASE ENTER VALID INPUT");
	    }

}

}
}

