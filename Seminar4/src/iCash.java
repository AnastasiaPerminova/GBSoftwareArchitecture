public interface iCash {



    boolean sell(Ticket ticket) throws FailedAuthorizationException;

    void returnMoney(Ticket ticket);
}
