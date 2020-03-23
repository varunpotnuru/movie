package sprint_1;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.bean.Movie;
import com.capgemini.bean.Screen;
import com.capgemini.bean.Show;
import com.capgemini.bean.Theatre;
import com.capgemini.service.AdminService;
import com.capgemini.service.Validation;

public class Testing {
	Validation v = new Validation();                                                                               
	AdminService s = new AdminService();
	

	@Test
	public void test() {
		assertEquals(true,v.validatedata("1saty", "1saty"));
		
	}
	//@Test
	public void test1()
	{
		assertEquals(true,v.validatedata("1023"));
	}
	
	//@Test
	public void test3()
	
	{
		Movie m = s.addMovie();
		assertEquals("bahubhali",m.getMovieName());
	}
//	//@Test
//	public void test4()
//	
//	{
//		Screen c = s.addScreen();
//		assertEquals("screen a",c.getScreenName());
//	}
	//@Test
//	public void test5()
//	{
//		Movie m = s.addMovie();
//		assertEquals(true,s.removeMovie());
//	}
	//@Test
//	public void test6()
//	{
//		Theatre t = s.addTheatre();
//		assertEquals("ramalaxman",t.getTheatreName());
//		
//	}
//	//@Test
//	public void test7()
//	{
//		Theatre t = s.addTheatre();
//		assertEquals(false,s.removeTheatre());
//	}
//	//@Test
//	public void test8()
//	{
//		Show h = s.addShow();
//		assertEquals("morning",h.getShowName());
//	}
	@Test
	public void test9()
	{
		Movie m = s.addMovie();
	    assertEquals(true,s.removeMovie());
		
	}
	

}
