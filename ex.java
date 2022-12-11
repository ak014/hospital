
import java.util.*;
import java.io.*;

public class ex {
    public static void BookShop(String title, String author_n, String pub_n, String edition, int year, int cost)
            throws NegativeCostException, InvaildYearException, InvaildCostException {

        if (year >= 2022) {

            throw new InvaildYearException("year is invalid ");

        }
        if (cost < 0) {
            throw new NegativeCostException("cost cannot be negative");
        }
        if (cost > 10000) {
            throw new InvaildCostException("cost is invaild ");

        }

        System.out.println(title);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String title, author_n, pub_n, edition;
        int year, cost;
        System.out.println("book title");
        title = in.nextLine();
        System.out.println("author name:");
        author_n = in.nextLine();
        System.out.println("published name");
        pub_n = in.nextLine();
        System.out.println("edition ");
        edition = in.nextLine();
        System.out.println("year");
        year = in.nextInt();
        System.out.println("cost of the book");
        cost = in.nextInt();
        try {
            BookShop(title, author_n, pub_n, edition, year, cost);
        } catch (InvaildYearException e) {
            System.out.println(e);
        } catch (NegativeCostException e) {
            System.out.println(e);
        } catch (InvaildCostException e) {
            System.out.println(e);
        } finally {
            System.out.println("process done ");
        }
    }
}

class InvaildCostException extends Exception {
    InvaildCostException(String a) {
        super(a);
    }
}

class NegativeCostException extends Exception {
    NegativeCostException(String a) {
        super(a);
    }
}

class InvaildYearException extends Exception {
    InvaildYearException(String a) {
        super(a);
    }
}