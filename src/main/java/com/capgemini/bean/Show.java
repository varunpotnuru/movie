package com.capgemini.bean;

import java.util.Date;

public class Show {
	private Integer showId;
	private Date showStartTime;
	private Date showEndTime;
	private Seat[] seats;
	private String showName;
	private String movieName;
	private Integer screenId;
	private Integer theatreId;
	
	public Show()
	{
		
	}
	
	
	public Boolean updateSeatStatus(String[] list)
	{
		return null;
	}
	public Seat[] chooseSeats(String[] list)
	{
		return null;
	}
	public Boolean initiateBooking(Seat[] seatlist,Show show)
	{
		return null;
	}
	public Integer getShowId() {
		return showId;
	}
	public void setShowId(Integer showId) {
		this.showId = showId;
	}
	public Date getShowStartTime() {
		return showStartTime;
	}
	public void setShowStartTime(Date showStartTime) {
		this.showStartTime = showStartTime;
	}
	public Date getShowEndTime() {
		return showEndTime;
	}
	public void setShowEndTime(Date showEndTime) {
		this.showEndTime = showEndTime;
	}
	public Seat[] getSeats() {
		return seats;
	}
	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public Integer getScreenId() {
		return screenId;
	}
	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
	}
	public Integer getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}

}
