import java.util.Objects;

public class CreditCard implements CardOperations {
    private String ownerName;
    private String ownerSurname;
    private long cardNumber;
    private double accountBalance;
    private String pinCode;
    private boolean isAuthorized;

    public CreditCard(String ownerName, String ownerSurname) {
        this.ownerName = ownerName;
        this.ownerSurname = ownerSurname;
        this.cardNumber = hashCode();
        this.pinCode = "0000";
        this.isAuthorized = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreditCard that = (CreditCard) o;
        return ownerName.equals(that.ownerName) && ownerSurname.equals(that.ownerSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerName, ownerSurname);
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
        try {
            authorization(authorizationProcess.getCardNumber(), authorizationProcess.getPinCode());
            return accountBalance;
        }
        catch (FailedAuthorizationException e) {
            System.out.println("Ошибка авторизации");
        }
        return -10000000000000000000000000000000.00;
    }

    public void setPinCode(String pinCode) {
        AuthorizationProcess authorizationProcess = new AuthorizationProcess();
        try{
        authorization(authorizationProcess.getCardNumber(), authorizationProcess.getPinCode());
            this.pinCode = pinCode;}
        catch (FailedAuthorizationException e){
            System.out.println("Ошибка авторизации");
        };

    }

    @Override
    public void addMoney(double money) {
        this.accountBalance = accountBalance + money;
    }

    @Override
    public void withdrawMoney(double money) {
        AuthorizationProcess authorizationProcess = new AuthorizationProcess();
        try{
            authorization(authorizationProcess.getCardNumber(), authorizationProcess.getPinCode());
            this.accountBalance = accountBalance - money;}
        catch (FailedAuthorizationException e){
            System.out.println("Ошибка авторизации");
        };


    }

    @Override
    public void authorization(long cardNumber, String pinCode) throws FailedAuthorizationException {
        if (cardNumber == this.cardNumber && pinCode.equals(this.pinCode)){
            isAuthorized = true;
        }
        else {
            throw new FailedAuthorizationException();
        }
    }
}
