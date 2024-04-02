import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the title:");
        String bookTitle= scanner.nextLine();

        System.out.println("Enter the author:");
        String bookAuthor= scanner.nextLine();

        System.out.println("Enter the publish year:");
        Integer bookPublishYear = scanner.nextInt();

        Book myAccount = new Book(bookTitle,bookAuthor,bookPublishYear);
        System.out.println("Book Title: "+myAccount.getTitle());
        System.out.println("Book Author: "+myAccount.getAuthor());
        System.out.println("Book publish year: "+myAccount.getPublishYear());
        scanner.close();
    }
}