import java.util.Objects;

public class CreditCard implements CardOperations, GenerateCard {
    private String ownerName;
    private String ownerSurname;
    private long cardNumber;
    private double accountBalance;
    private String pinCode;
    public CreditCard(String ownerName, String ownerSurname) {
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.cardNumber = generateCardNumber();
        this.pinCode = generatePinCode();
    }

    public CreditCard(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerSurname() {
        return ownerSurname;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public double getAccountBalance() {
        AuthorizationProcess authorizationProcess = new AuthorizationProcess();
       if (authorization(authorizationProcess.getCardNumber(), authorizationProcess.getPinCode()))
        {

            return accountBalance;
        }
       return -1000000000;
    }

    public void setPinCode(String pinCode) {
        AuthorizationProcess authorizationProcess = new AuthorizationProcess();
        if(authorization(authorizationProcess.getCardNumber(), authorizationProcess.getPinCode()))
        {
            this.pinCode = pinCode;
        }
        else {
            System.out.println("Ошибка авторизации.");
        }

    }

    @Override
    public void addMoney(double money) {
        this.accountBalance = accountBalance + money;
    }

    @Override
    public void withdrawMoney(double money) {
        AuthorizationProcess authorizationProcess = new AuthorizationProcess();
        if (authorization(authorizationProcess.getCardNumber(), authorizationProcess.getPinCode()))
        {this.accountBalance = accountBalance - money;}
        else {
            System.out.println("Ошибка авторизации.");
        }
    }

    @Override
    public boolean authorization(long cardNumber, String pinCode) {
        boolean authorized = false;
        if (cardNumber == this.cardNumber && pinCode.equals(this.pinCode)){
            authorized = true;
        }
       return authorized;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return cardNumber == that.cardNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNumber);
    }
}
