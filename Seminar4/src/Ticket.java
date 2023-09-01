import java.util.Date;
import java.util.Objects;

public class Ticket {
    private long rootNumber;
    private double price;

    private int seat;
    private Date date;
    private boolean isValid;

    public Ticket( double price, int seat, Date date) {
        this.rootNumber = hashCode();
        this.price = price;
        this.seat = seat;
        this.date = date;
        this.isValid = true;
    }

       public int hashCode() {
        return Objects.hash(price,seat,date);
    }

    public long getRootNumber() {
        return rootNumber;
    }

    public double getPrice() {
        return price;
    }

    public int getSeat() {
        return seat;
    }

    public Date getDate() {
        return date;
    }

    public boolean isValid() {
        return isValid;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                ", seat=" + seat +
                ", date=" + date +
                '}';
    }
}
