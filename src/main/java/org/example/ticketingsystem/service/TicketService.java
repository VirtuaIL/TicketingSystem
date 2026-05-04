package org.example.ticketingsystem.service;

import org.example.ticketingsystem.model.Status;
import org.example.ticketingsystem.model.Ticket;
import org.example.ticketingsystem.repository.TicketRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }


    public List<Ticket> getAll() {
        return ticketRepository.findAll();
    }

    public Ticket createTicket(Ticket ticket) {
        ticket.setCreateTime(LocalDateTime.now());
        ticket.setStatus(Status.OPEN);
        return ticketRepository.save(ticket);
    }

    public Ticket updateTicketStatus(Long id, Status newStatus) {
        Ticket ticket = ticketRepository.findById(id).get();

        ticket.setStatus(newStatus);
        return ticketRepository.save(ticket);
    }


}
