//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Seller seller = new Seller();
        Customer customer = new Customer();
        System.out.println(customer.canBuyTickets());
        customer.setAddress("O'Connell Street");
        System.out.println(customer.getAddress());
        customer.setAddress("O'Connell ");
        System.out.println(customer.getAddress());

        System.out.println("Giving money to seller 50.0 dollars");
        seller.receiveMoney(50.0);
        System.out.println("Seller has " + seller.showsSalary() + "dollars");
        System.out.println("Giving money to seller 1456.1 dollars");
        seller.receiveMoney(1456.1);
        System.out.println("Seller has " + seller.showsSalary() + "dollars");
    }
}


