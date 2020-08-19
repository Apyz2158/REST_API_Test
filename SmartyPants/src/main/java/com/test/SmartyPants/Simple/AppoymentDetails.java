package com.test.SmartyPants.Simple;

import java.util.ArrayList;

public class AppoymentDetails {

	private String businessName;
	private String address;
	private int maximumOccupancyAtATime;
	private String openTime;
	private String closeTime;
	private int appointmentDurationInMinutes;
	private ArrayList<String> category;

	public AppoymentDetails() {

	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMaximumOccupancyAtATime() {
		return maximumOccupancyAtATime;
	}

	public void setMaximumOccupancyAtATime(int maximumOccupancyAtATime) {
		this.maximumOccupancyAtATime = maximumOccupancyAtATime;
	}

	public String getOpenTime() {
		return openTime;
	}

	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}

	public String getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}

	public int getAppointmentDurationInMinutes() {
		return appointmentDurationInMinutes;
	}

	public void setAppointmentDurationInMinutes(int appointmentDurationInMinutes) {
		this.appointmentDurationInMinutes = appointmentDurationInMinutes;
	}

	public ArrayList<String> getCategory() {
		return category;
	}

	public void setCategory(ArrayList<String> category) {
		this.category = category;
	}

}
