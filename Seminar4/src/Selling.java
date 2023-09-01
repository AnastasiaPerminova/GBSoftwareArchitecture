public class Selling implements iCash{
    private CreditCard creditCard;
    private TicketProvider ticketProvider;

    public Selling(CreditCard creditCard, TicketProvider ticketProvider) {
        this.creditCard = creditCard;
        this.ticketProvider = ticketProvider;
    }

    @Override
    public void sell(Ticket ticket)  {


            if (ticket != null) {
                System.out.println("Вы планируете купить билет" + ticket);
                if (ticket.getPrice() < creditCard.getAccountBalance()){
                    creditCard.withdrawMoney(ticket.getPrice());
                    ticketProvider.deleteTicket(ticket.getDate(), ticket.getSeat());
                    System.out.println("Билет успешно куплен.");
                }
                else {
                    System.out.println(" Недостаточно средств для покупки.");
                }
            }
            else{
                System.out.println("К сожалению, такого билета нет в продаже.");

            }



    }

    @Override
    public void returnMoney(Ticket ticket) {
        creditCard.addMoney(ticket.getPrice());
        ticketProvider.returnTicket(ticket);
    }
}
