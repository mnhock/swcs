package swcs.layering.after.ticket;

class TicketService {

    private final TicketRepository ticketRepository;

    TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }
}
