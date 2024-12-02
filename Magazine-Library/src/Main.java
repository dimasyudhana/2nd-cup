import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        String title = promptForTitle(scan);
        String publisher = promptForPublisher(scan);
        int issueNumber = promptForIssueNumber(scan);
        int publicationYear = promptForPublicationYear(scan);

        Magazine magazine = new Magazine(title, publisher, issueNumber, publicationYear);

        MagazineLibrary library = new MagazineLibrary();
        library.addMagazine(magazine);

        System.out.println("Magazine added to the library: " + magazine.getTitle());

    }

    public static boolean isNullOrBlank(String input) {
        return false;
    }

    public static boolean incorrectIssueNumber(int issueNumber) {
        return false;
    }

    public static boolean incorrectPublicationYear(int publicationYear) {
        return false;
    }

    public static String promptForTitle(Scanner scan) {
        while (true) {
            System.out.println("\nenter title:");
            String title = scan.nextLine();
            if (!isNullOrBlank(title)) {
                return title;        
            }
        }
    }

    public static String promptForPublisher(Scanner scan) {
        while (true) {
            System.out.println("\nenter publisher:");
            String publisher = scan.nextLine();
            if (!isNullOrBlank(publisher)) {
                return publisher;                
            }
        }
    }

    public static int promptForIssueNumber(Scanner scan) {
        while (true) {
            System.out.println("\nenter issue number (gt0):");
            if (!scan.hasNextInt()) {
                scan.next();
                continue;
            }
            int issueNumber = scan.nextInt();
            if (!incorrectIssueNumber(issueNumber)) {
                return issueNumber;
            }
        }
    }

    public static int promptForPublicationYear(Scanner scan) {
        while (true) {
            System.out.println("\nenter publication year (gt0):");
            if (!scan.hasNextInt()) {
                scan.next();
                continue;
            }
            int publicationYear = scan.nextInt();
            if (!incorrectPublicationYear(publicationYear)) {
                return publicationYear;
            }
        }
    }

}
