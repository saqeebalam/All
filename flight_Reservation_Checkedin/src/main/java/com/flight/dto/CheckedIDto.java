package com.flight.dto;

public class CheckedIDto {
	
	private long id;
	private int numberOfBags;
	private boolean checkedIn=true;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public int getNumberOfBags() {
		return numberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		this.numberOfBags = numberOfBags;
	}
	public boolean isCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	
	
}
