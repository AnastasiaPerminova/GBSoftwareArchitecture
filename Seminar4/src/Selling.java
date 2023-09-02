public class Selling implements iCash{
    private CreditCard creditCard;
    private TicketProvider ticketProvider;
    private CreditCardRepository creditCardRepository;

    public Selling(long cardNumber, TicketProvider ticketProvider, CreditCardRepository creditCardRepository) {
        this.creditCard = new CreditCard(cardNumber);
        this.ticketProvider = ticketProvider;
        this.creditCardRepository = creditCardRepository;
    }

    @Override
    public boolean sell(Ticket ticket)  {
            boolean isBought = false;
            try{
                CreditCard creditCard1= creditCardRepository.findCreditCard(creditCard);
                if (ticket != null) {
                    System.out.println("Вы планируете купить билет" + ticket);
                    if (ticket.getPrice() <= creditCard1.getAccountBalance()){
                        creditCard1.withdrawMoney(ticket.getPrice());
                        ticketProvider.deleteTicket(ticket.getDate(), ticket.getSeat());
                        isBought = true;
                        System.out.println("Билет успешно куплен.");
                    }
                    else {
                        System.out.println(" Недостаточно средств для покупки.");
                    }
                }
                else{
                    System.out.println("К сожалению, такого билета нет в продаже.");

                }
            }catch (NullPointerException e){
                System.out.println("Такой кредитной карты не существует.");
            }
            return isBought;

   }

    @Override
    public void returnMoney(Ticket ticket) {
        creditCard.addMoney(ticket.getPrice());
        ticketProvider.returnTicket(ticket);
    }
}
