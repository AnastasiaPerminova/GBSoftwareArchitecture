import java.util.Date;
import java.util.Set;

public interface iTicketRepo {
    Set<Integer> searchTicket(Date date);
    boolean searchTicket(Date date, Integer seat);

    Ticket createTicket(Date date, Integer seat);

    void returnTicket(Ticket ticket);

    void deleteTicket(Date date, Integer seat);

}
