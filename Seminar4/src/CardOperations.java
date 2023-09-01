public interface CardOperations {
    void addMoney(double money) throws FailedAuthorizationException;

    void withdrawMoney(double money) throws FailedAuthorizationException;

    void authorization(long cardNumber, String pinCode) throws FailedAuthorizationException;
}
