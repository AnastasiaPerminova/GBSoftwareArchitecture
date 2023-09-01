import java.util.*;

public class TicketsRepository  {
    int id;
    HashMap<Date, Set<Integer>> tickets;

    public TicketsRepository(HashMap<Date, Set<Integer>> tickets) {
        this.tickets = tickets;
    }
}
