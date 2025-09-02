import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String [] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

     

        System.out.println("Give a name to product");
        String name = sc.nextLine();

        System.out.println("Set a quantity to product");
        int quantity = sc.nextInt();

        System.out.println("Set a value to product");
        double price = sc.nextDouble();

        Product product = new Product(name, price, quantity);

        System.out.println("Product: data " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added to stock");
        product.addProducts(sc.nextInt());
        System.out.println("Product: data " + product);

        System.out.println("Enter the number of products to be removed from stock: ");
        product.removeProducts(sc.nextInt());
        System.out.println("Product: data " + product);
        sc.close();
    }
}