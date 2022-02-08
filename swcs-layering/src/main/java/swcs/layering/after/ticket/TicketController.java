package swcs.layering.after.ticket;

import swcs.layering.before.service.TicketService;

class TicketController {

    private final TicketService ticketService;

    TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
}
