package com.capgemini.bean;


public class Screen {
	private Integer screenId;
	private Integer theatreId;
	private String screenName;
	private Show[] showList;
	private Integer rows;
	private Integer columns;
	
	public Screen() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Screen(Integer screenId, Integer theatreId, String screenName, 
			Integer rows, Integer columns) {
		super();
		this.screenId = screenId;
		this.theatreId = theatreId;
		this.screenName = screenName;
		this.rows = rows;
		this.columns = columns;
	}


	public Show searchShow(String s)
	{
		return null;
	}
	public Show[] showShows()
	{
		return null;
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

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public Show[] getShowList() {
		return showList;
	}

	public void setShowList(Show[] showList) {
		this.showList = showList;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getColumns() {
		return columns;
	}

	public void setColumns(Integer columns) {
		this.columns = columns;
	}


}
