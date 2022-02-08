package swcs.layering.before.service;

import swcs.layering.before.repository.TicketRepository;

public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
}
