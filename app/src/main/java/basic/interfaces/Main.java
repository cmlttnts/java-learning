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
        
        // can also reference methods
        printStuff(Main::someStaticMethod);

        // non-static, instance method
        Main someObj = new Main();
        printStuff(someObj::nonStaticMethod);

    }

    public static void printStuff(Printable item) {
        item.print();
    }

    public static void someStaticMethod(){
        System.out.println("someStaticMethod");
    }

    public void nonStaticMethod(){
        System.out.println("nonStaticMethod");
    }
}