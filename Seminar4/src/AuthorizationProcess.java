import java.util.Scanner;

public class AuthorizationProcess {
    private long cardNumber;
    private String pinCode;

    Scanner in = new Scanner(System.in);

    public AuthorizationProcess() {
        setCardNumber();
        setPinCode();
    }

    public void setCardNumber( ) {
        System.out.println("Введите номер кредитной карты.");
        Long cardNumber = in.nextLong();
        this.cardNumber = cardNumber;
    }

    public void setPinCode() {
        System.out.println("Введите пинкод.");
        String pinCode = in.next();
        this.pinCode = pinCode;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getPinCode() {
        return pinCode;
    }
}
