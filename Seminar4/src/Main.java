import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Date, Set<Integer>> cinemaTickets = new HashMap<>();
        Set<Integer> seats = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            seats.add(i);
        }
        cinemaTickets.put(new Date(2023, 9, 01), seats);
        cinemaTickets.put(new Date(2023, 10, 02), seats);
        cinemaTickets.put(new Date(2023, 10, 03), seats);
        cinemaTickets.put(new Date(2023, 10, 04), seats);
        for (Date date: cinemaTickets.keySet()){
            System.out.println(date);
            System.out.println(cinemaTickets.get(date));
        }
        TicketsRepository cinemaTicketsRepo = new TicketsRepository(cinemaTickets);
        TicketProvider cinemaTicketProvider = new TicketProvider(cinemaTicketsRepo);
        Ticket ticket = cinemaTicketProvider.createTicket(new Date(2023, 9 ,01), 7);
        System.out.println(ticket);

        cinemaTicketProvider.deleteTicket(ticket.getDate(),ticket.getSeat());
        System.out.println(cinemaTicketProvider.searchTicket(new Date(2023, 9,01)));

        cinemaTicketProvider.returnTicket(ticket);
        System.out.println(cinemaTicketProvider.searchTicket(new Date(2023, 9,01)));
    }
}
