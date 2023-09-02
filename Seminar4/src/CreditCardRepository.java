import java.util.ArrayList;

public class CreditCardRepository {
    private ArrayList<CreditCard> creditCards;

    public CreditCardRepository() {
        creditCards = new ArrayList<CreditCard>();
    }

    private ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }

    public void  addCreditCard(CreditCard creditCard){
        this.creditCards.add(creditCard);
    }

    public CreditCard findCreditCard(CreditCard creditCard0){
        ArrayList<CreditCard> theseCreditCards = getCreditCards();
        for (int i = 0; i < theseCreditCards.size(); i++) {
            if (theseCreditCards.get(i).equals(creditCard0)){
                return theseCreditCards.get(i);
            }
        }
        return null;
    }
}
