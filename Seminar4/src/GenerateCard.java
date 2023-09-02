public interface GenerateCard {
    default long generateCardNumber() {

        long i = 10001000;
        return i;
    }

    default String generatePinCode() {
        return "0000";
    }

}
