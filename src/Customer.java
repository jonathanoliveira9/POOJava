public class Customer {
    private String name;
    private String document;
    private String email;
    private char sex;
    private String address;
    private String phone;
    private String city;

    boolean canBuyTickets() {
        return true;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getAddress() {
        return address;
    }
}
