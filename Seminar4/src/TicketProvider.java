import java.util.Date;
import java.util.Set;

public class TicketProvider implements iTicketRepo, iPrice{
    public TicketsRepository tickets;

    public TicketProvider( TicketsRepository tickets) {
        this.tickets = tickets;
    }


    @Override
    public Set<Integer> searchTicket(Date date) {
        return tickets.tickets.get(date);
    }

    @Override
    public boolean searchTicket(Date date, Integer seat) {
        if (tickets.tickets.containsKey(date) && tickets.tickets.get(date).contains(seat)){
            return true;
        }
        return false;
    }

    @Override
    public Ticket createTicket(Date date, Integer seat) {
        if(searchTicket(date, seat)){
            double price = setPrice(seat);
            Ticket ticket = new Ticket(price,seat,date);
            return ticket;
        }
        return null;
    }

    @Override
    public void returnTicket(Ticket ticket) {
        tickets.tickets.get(ticket.getDate()).add(ticket.getSeat());
    }

    @Override

    public void deleteTicket(Date date, Integer seat) {
        tickets.tickets.get(date).remove(seat);
    }

    @Override
    public double setPrice(Integer seat) {
        if (seat <= 3){
            return  1000 ;
        }
        if (seat > 3 && seat < 6){
            return 600 ;
        }
        return 400;
    }
}
