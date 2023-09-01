import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private ArrayList<Ticket> tickets;
    private CashProvider cash;

    public boolean buyTicket(Ticket ticket) {
        if(cash.buy(ticket.getPrice())){
        this.tickets.add(ticket);
        System.out.println("Билет куплен");
        return true;}

        return false;
    }

    public void search(LocalDate date, long rootNumber) {
        for (int i = 0; i < tickets.size(); i++) {
            Ticket ticket = tickets.get(i);
            if (date.equals(ticket.getDate()) && rootNumber == ticket.getRootNumber()) {
                System.out.println("Билет найден." + ticket);

            } else {
                System.out.println("Билет не найден");
            }
        }
    }
}

