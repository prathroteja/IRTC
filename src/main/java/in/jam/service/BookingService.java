package in.jam.service;

import in.jam.request.Passenger;
import in.jam.response.Ticket;

public interface BookingService {

	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicket(Integer ticketNumber);
}
