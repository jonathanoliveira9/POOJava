public class Seller {

    String name;
    double salary;
    String document;

    void setMoney(double money) { this.salary += money; }

    double showsSalary() { return salary; }
    Seller(double salary) {
        this.salary = salary;
    }

}
