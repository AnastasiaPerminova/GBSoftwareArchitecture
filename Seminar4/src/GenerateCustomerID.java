public interface GenerateCustomerID {
    default int generateCustomerId (){
        return 1;
    }
}
