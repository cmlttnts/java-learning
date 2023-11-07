package basic.interfaces;

/**
 * Main
 */
public class Main {

    public static void interfacesMain() {

        Book book = new Book();
        printStuff(book);

        // can be lambda when one method interface
        printStuff(() -> {
            System.out.println("Hello");
        });
        
    }

    public static void printStuff(Printable item) {
        item.print();
    }
}