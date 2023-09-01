public interface iCash {
    void sell(Ticket ticket) throws FailedAuthorizationException;
    void returnMoney(Ticket ticket);
}
