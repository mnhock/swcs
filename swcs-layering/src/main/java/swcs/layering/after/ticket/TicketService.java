package swcs.layering.after.ticket;

import swcs.layering.before.repository.TicketRepository;

class TicketService {

    private final TicketRepository ticketRepository;

    TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
}
