package Java.Generic.GenericProject3;

import java.util.ArrayList;
import java.util.Scanner;

// Product class
class Product {
    int id;
    String name;
    int quantity;

    Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public String toString() {
        return "ID: " + id +
                ", Name: " + name +
                ", Quantity: " + quantity;
    }
}

// Generic Inventory class
class Inventory<T extends Product> {
    ArrayList<T> items = new ArrayList<>();

    void addProduct(T product) {
        items.add(product);
        System.out.println("Product added successfully.");
    }

    void removeProduct(int id) {
        boolean found = false;

        for (T item : items) {
            if (item.id == id) {
                items.remove(item);
                System.out.println("Product removed.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }

    void searchProduct(String keyword) {
        boolean found = false;

        for (T item : items) {
            if (item.name.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(item);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }

    void updateQuantity(int id, int qty) {
        boolean found = false;

        for (T item : items) {
            if (item.id == id) {
                item.quantity = qty;
                System.out.println("Quantity updated.");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }

    void displayInventory() {
        if (items.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        for (T item : items) {
            System.out.println(item);
        }
    }
}

// Main class
public class Inventory1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory<Product> inventory = new Inventory<>();

        int choice;

        do {
            System.out.println("\n===== Inventory Management =====");
            System.out.println("1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. Search Product");
            System.out.println("4. Update Quantity");
            System.out.println("5. Display Inventory");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    inventory.addProduct(new Product(id, name, qty));
                    break;

                case 2:
                    System.out.print("Enter Product ID to remove: ");
                    int removeId = sc.nextInt();
                    inventory.removeProduct(removeId);
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter keyword: ");
                    String keyword = sc.nextLine();
                    inventory.searchProduct(keyword);
                    break;

                case 4:
                    System.out.print("Enter Product ID: ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter new quantity: ");
                    int newQty = sc.nextInt();

                    inventory.updateQuantity(updateId, newQty);
                    break;

                case 5:
                    inventory.displayInventory();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}