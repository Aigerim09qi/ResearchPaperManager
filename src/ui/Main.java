package ui;

import model.*;
import service.PaperService;
import java.util.Scanner;
import java.util.InputMismatchException;
import utils.FileManager;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PaperService service = new PaperService();

        while (true) {
            try {
                System.out.println("\n1. Create Paper");
                System.out.println("2. Read Papers");
                System.out.println("3. Delete Paper");
                System.out.println("4. Update Paper");
                System.out.println("5. Export to CSV");
                System.out.println("6. Import from CSV");
                System.out.println("7. Exit");

                int choice = sc.nextInt();

                if (choice == 1) {
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (id < 0) {
                        System.out.println("ID cannot be negative");
                        continue;
                    }

                    System.out.print("Title: ");
                    String title = sc.nextLine();
                    if (title.isEmpty()) {
                        System.out.println("Title cannot be empty");
                        continue;
                    }

                    System.out.print("Author: ");
                    String author = sc.nextLine();

                    System.out.print("Year: ");
                    int year = sc.nextInt();
                    sc.nextLine();

                    if (year < 1900 || year > 2026) {
                        System.out.println("Invalid year");
                        continue;
                    }

                    System.out.println("1. Journal  2. Conference");
                    int type = sc.nextInt();
                    sc.nextLine();

                    if (type == 1) {
                        service.addPaper(new JournalArticle(id, title, author, year));
                    } else {
                        service.addPaper(new ConferencePaper(id, title, author, year));
                    }

                } else if (choice == 2) {
                    service.showAllPapers();

                } else if (choice == 3) {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    service.deletePaper(id);

                } else if (choice == 4) {
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New title: ");
                    String title = sc.nextLine();

                    service.updatePaper(id, title);

                } else if (choice == 5) {
                    service.exportCSV();

                } else if (choice == 6) {
                    service.importCSV();

                } else if (choice == 7) {
                    System.out.println("Saving data and exiting ... Goodbye!");
                    break;

                } else {
                    System.out.println("Invalid choice. Please select 1-7.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Please enter a number, not text.");
                sc.nextLine();
            }
        }
    }
}



