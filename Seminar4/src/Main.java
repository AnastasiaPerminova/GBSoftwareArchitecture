import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FailedAuthorizationException, ParseException {
        HashMap<Date, Set<Integer>> cinemaTickets = new HashMap<>();
        Set<Integer> seats = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            seats.add(i);
        }
        cinemaTickets.put(new SimpleDateFormat("yyyy/MM/dd").parse("2023/09/01"), seats);
        cinemaTickets.put(new SimpleDateFormat("yyyy/MM/dd").parse("2023/10/01"), seats);
        cinemaTickets.put(new SimpleDateFormat("yyyy/MM/dd").parse("2023/10/02"), seats);
        cinemaTickets.put(new SimpleDateFormat("yyyy/MM/dd").parse("2023/10/03"), seats);
        for (Date date: cinemaTickets.keySet()){
            System.out.println(date);
            System.out.println(cinemaTickets.get(date));
        }
        TicketsRepository cinemaTicketsRepo = new TicketsRepository(cinemaTickets);
        TicketProvider cinemaTicketProvider = new TicketProvider(cinemaTicketsRepo);
        CreditCardRepository creditCardRepository = new CreditCardRepository();
        CreditCard creditCard = new CreditCard("Anastasiia", "Vinogradova");
        creditCardRepository.addCreditCard(creditCard);
        System.out.println(creditCard.getCardNumber());
        creditCard.addMoney(1000);
        System.out.println("Баланс счета  " + creditCard.getAccountBalance());
        Customer customer = new Customer(creditCard.getCardNumber());
        customer.buyTicket(cinemaTicketProvider,creditCardRepository);
        customer.buyTicket(cinemaTicketProvider,creditCardRepository);
        System.out.println(customer.getTickets());

    }
}
