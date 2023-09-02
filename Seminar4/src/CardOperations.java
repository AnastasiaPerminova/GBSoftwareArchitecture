public interface CardOperations {
    void addMoney(double money);

    void withdrawMoney(double money);

    boolean authorization(long cardNumber, String pinCode);
}
