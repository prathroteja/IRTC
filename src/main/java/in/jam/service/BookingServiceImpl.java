package in.jam.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import in.jam.request.Passenger;
import in.jam.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService{

	private Map<Integer,Ticket> ticketMap= new HashMap<>();
	private Integer ticketNum =1;

	public Ticket bookTicket(Passenger passenger) {
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(550.00);
		t.setStatus("CONFIRMED");
		t.setTicketNum(ticketNum);
		ticketMap.put(ticketNum,t);

		ticketNum++;
		//ticketMap.put(ticketNum,t);
		return t;
	}

	public Ticket getTicket(Integer ticketNumber) {
		if(ticketMap.containsKey(ticketNumber)) {
			return ticketMap.get(ticketNumber);
		}
		
		return null;
	}

}