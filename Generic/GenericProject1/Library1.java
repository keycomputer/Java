import java.util.ArrayList;
import java.util.Scanner;

// Book Class
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return title + " by " + author;
    }
}

// Generic Library Class
class Library<T> {
    ArrayList<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
        System.out.println("Item added successfully.");
    }

    void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            System.out.println("Item removed successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    void searchItem(String keyword) {
        boolean found = false;
        for (T item : items) {
            if (item.toString().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(item);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Item not found.");
        }
    }

    void displayItems() {
        if (items.isEmpty()) {
            System.out.println("Library is empty.");
            return;
        }

        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + ". " + items.get(i));
        }
    }
}

// Main Class
public class Library1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library<Book> library = new Library<>();

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author name: ");
                    String author = sc.nextLine();

                    library.addItem(new Book(title, author));
                    break;

                case 2:
                    library.displayItems();
                    System.out.print("Enter book index to remove: ");
                    int index = sc.nextInt();
                    library.removeItem(index);
                    break;

                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = sc.nextLine();
                    library.searchItem(keyword);
                    break;

                case 4:
                    library.displayItems();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}