package com.java.methods;

public class FlightBaseClass {
	
	private String AirLine="Ethiad";
	public String FlightNumber;
	public String Origin;
	public String Destination;
	
	public  FlightBaseClass(String Airline,String FlightNumber,String Origin,String Destination) 
	{
		this.AirLine=Airline;
		this.FlightNumber=FlightNumber;
		this.Origin=Origin;
		this.Destination=Destination;
		
	}
	
public String fnGetAirline() 
{
	return AirLine;
	
}
public String fnGetFlightNumber() 
{
	return FlightNumber;
	
}
public String fnGetOrigin() 
{
	return Origin;
	
}
public String fnGetDestination() 
{
	return Destination;
	
}

public void fnFlightDetails()
{
	System.out.println("You have booked tickets for Flight "+fnGetAirline()+" .The Flight Number is "+fnGetFlightNumber()+
			".The Origin of the flight is "+fnGetOrigin()+" and Destination is "+fnGetDestination());
	
}
}
