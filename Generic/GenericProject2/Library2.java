package Java.Generic.GenericProject2;

import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    boolean issued;
    int issueDays;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.issued = false;
        this.issueDays = 0;
    }

    public String toString() {
        return title + " by " + author +
                (issued ? " [Issued]" : " [Available]");
    }
}

class Library<T extends Book> {
    ArrayList<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
        System.out.println("Book added successfully.");
    }

    void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Invalid index.");
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

    void searchItem(String keyword) {
        boolean found = false;

        for (T item : items) {
            if (item.title.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(item);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    void issueBook(int index, int days) {
        if (index >= 0 && index < items.size()) {
            if (!items.get(index).issued) {
                items.get(index).issued = true;
                items.get(index).issueDays = days;
                System.out.println("Book issued successfully.");
            } else {
                System.out.println("Book already issued.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    void returnBook(int index, int returnDays) {
        if (index >= 0 && index < items.size()) {
            if (items.get(index).issued) {
                int fine = 0;

                if (returnDays > items.get(index).issueDays) {
                    fine = (returnDays - items.get(index).issueDays) * 5;
                }

                items.get(index).issued = false;
                items.get(index).issueDays = 0;

                System.out.println("Book returned successfully.");
                System.out.println("Fine: ₹" + fine);
            } else {
                System.out.println("Book was not issued.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }
}

public class Library2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library<Book> library = new Library<>();

        int choice;

        do {
            System.out.println("\n===== Library Management =====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display Books");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter author: ");
                    String author = sc.nextLine();

                    library.addItem(new Book(title, author));
                    break;

                case 2:
                    library.displayItems();
                    System.out.print("Enter index: ");
                    int removeIndex = sc.nextInt();
                    library.removeItem(removeIndex);
                    break;

                case 3:
                    System.out.print("Enter keyword: ");
                    String keyword = sc.nextLine();
                    library.searchItem(keyword);
                    break;

                case 4:
                    library.displayItems();
                    break;

                case 5:
                    library.displayItems();
                    System.out.print("Enter book index: ");
                    int issueIndex = sc.nextInt();

                    System.out.print("Issue for how many days: ");
                    int days = sc.nextInt();

                    library.issueBook(issueIndex, days);
                    break;

                case 6:
                    library.displayItems();
                    System.out.print("Enter book index: ");
                    int returnIndex = sc.nextInt();

                    System.out.print("Returned after how many days: ");
                    int returnDays = sc.nextInt();

                    library.returnBook(returnIndex, returnDays);
                    break;

                case 7:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 7);

        sc.close();
    }
}