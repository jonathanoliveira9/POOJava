import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Seller seller = new Seller(0.0);
        Customer customer = new Customer();
        System.out.println(customer.canBuyTickets());
        customer.setAddress("O'Connell Street");
        System.out.println(customer.getAddress());
        customer.setAddress("O'Connell ");
        System.out.println(customer.getAddress());

        System.out.println("Giving money to seller 50.0 dollars");
        seller.setMoney(50.0);
        System.out.println("Seller has " + seller.showsSalary() + "dollars");
        System.out.println("Giving money to seller 1456.1 dollars");
        seller.setMoney(1456.1);
        System.out.println("Seller has " + seller.showsSalary() + "dollars");

        /*
        To practice the concepts presented so far, consider the following problem.
        You need to develop an academic system to manage student grades at an educational institution.
        The system must register the courses offered by the institution.
        Each course has a set of disciplines, and each discipline belongs to a single course. Students are enrolled in a course.
        Each student must also have a list of disciplines in which they are enrolled.
        Identify the necessary attributes for the classes.
        Create the getters, setters, and constructors as you see fit.
        The Course class must have a method called addDiscipline that adds a discipline to the course's list.
        The Student class should also have a similar method.
        These methods should only add the given discipline if it is not already present in the course's or student's discipline list.
        */
        Course course = new Course();
        Student student = new Student();
        Subject subject = new Subject();

        System.out.println("Please give the name of course");



    }
}


