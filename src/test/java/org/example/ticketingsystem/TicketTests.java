package org.example.ticketingsystem;


import org.example.ticketingsystem.model.Status;
import org.example.ticketingsystem.model.Ticket;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicketTests {

    @Test
    void changeStatusTest() {
        Ticket ticket = new Ticket("test", "test", Status.OPEN, LocalDateTime.now());

        ticket.setStatus(Status.CANCELED);
        assertEquals(Status.CANCELED, ticket.getStatus());

    }
}
