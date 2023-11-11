package basic.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    private static void seperate() {
        System.out.println("------------------------------------");
    }

    public static void stringsMain() {
        concating();
        seperate();

        multiLine();
        seperate();

        joining();
        seperate();

        stringBufferAndBuilder();
        seperate();

        emptyStrings();
        seperate();

        stringSplit();
        seperate();

        comparing();
        seperate();
    }

    private static void concating() {
        String str1 = "Hello";
        String str2 = "World!1";

        System.out.println(str1 + " " + str2);

        System.out.println("Hello ".concat("World!2"));
    }

    private static void multiLine() {
        String multi1 = """
                Hello World!1
                    Next Line
                """;

        System.out.println(multi1);

        String multi2 = """
                    Hello World!2
                    Next Line
                """;
        System.out.println(multi2);

        String multi3 = """
                Hello World!3
                Next Line""";

        System.out.println(multi3);
    }

    private static void joining() {
        System.out.println(String.join("-", "1", "2", "3"));
        String[] strings = { "one", "two", "three" };
        System.out.println(String.join("-", strings));
        ArrayList<String> strings2 = new ArrayList<>();
        strings2.add("111");
        strings2.add("222");
        System.out.println(String.join("-", strings2));

        LinkedList<String> linkedStrs = new LinkedList<>();
        linkedStrs.add("aaa");
        linkedStrs.add("bbb");
        System.out.println(String.join("-", linkedStrs));
    }

    private static void stringBufferAndBuilder() {
        StringBuffer sb = new StringBuffer("String");
        sb.append(" ");
        sb.append("Buffer!");

        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder("String");
        sb2.append(" ");
        sb2.append("Builder");
        System.out.println(sb2);
    }

    private static void emptyStrings() {
        String empty = "";
        System.out.println(empty.isEmpty());
        System.out.println(empty.isBlank());

        String empty2 = " \t\n";
        System.out.println(empty2.isEmpty());
        System.out.println(empty2.isBlank());

        String trimmed = empty2.trim();
        System.out.println(trimmed.isEmpty());
        System.out.println(trimmed.isBlank());
    }

    private static void stringSplit() {
        String commaSeperated = "1,2,3,4,5";
        String[] splittedArray = commaSeperated.split(",");

        for (String str : splittedArray) {
            System.out.println(str);
        }

        // default split
        String str2 = "Hello World 1 2 3   extraSpaces";
        String[] splitted = str2.split(" ");
        System.out.println(Arrays.toString(splitted));

        for (String str : splitted) {
            System.out.println(str);
        }

    }

    private static void comparing(){
        System.out.println("hello\".equals(\"hello\"");
        System.out.println("hello".equals("hello"));

        System.out.println("\"hello\" == \"hello\"");
        System.out.println("hello" == "hello");

        String str1 = "hello";
        String str2 = "hello";

        System.out.println("str1 == str2");
        System.out.println(str1 == str2);

        System.out.println("str1.equals(str2)");
        System.out.println(str1.equals(str2));

        String str3 = new String("hello");
        String str4 = new String("hello");
        
        System.out.println("str3 == str4");
        System.out.println(str3 == str4);

        System.out.println("str3.equals(str4)");
        System.out.println(str3.equals(str4));

        // equals ignore case

        System.out.println("\"hello\".equalsIgnoreCase(\"HELLO\")");
        System.out.println("hello".equalsIgnoreCase("HELLO"));

        // comparing lexographically with compareTo, returns 0 if equal, negative if less, positive if greater
        System.out.println("\"hello\".compareTo(\"hello\")");
        System.out.println("hello".compareTo("hello"));

        System.out.println("\"hello\".compareTo(\"Hello\")");
        System.out.println("hello".compareTo("Hello"));

        System.out.println("\"hello\".compareTo(\"helloo\")");
        System.out.println("hello".compareTo("helloo"));

    }
}
