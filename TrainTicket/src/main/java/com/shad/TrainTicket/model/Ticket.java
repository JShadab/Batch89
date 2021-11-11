package com.shad.TrainTicket.model;

import java.util.Date;
import java.util.TreeMap;

public class Ticket {

	private int counter;
	private String pnr;
	private Date travelDate;
	private Train train;

	private TreeMap<Passenger, Integer> passangers;

	public Ticket(Date travelDate, Train train) {
		this.train = train;
		this.travelDate = travelDate;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public Date getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(Date travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

	public TreeMap<Passenger, Integer> getPassangers() {
		return passangers;
	}

	public void setPassangers(TreeMap<Passenger, Integer> passangers) {
		this.passangers = passangers;
	}

	private String generatePNR() {
		return null;
	}

	private double calcPassengerFare() {
		return 0;
	}

	public void addPassenger(String s, int i, char ch) {

	}

	private double calculateTotalTicketPrice() {
		return 0;
	}

	private StringBuilder generateTicket() {
		return null;
	}

	public void writeTicket() {
	}

}
