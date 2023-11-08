package basic.strings;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    private static void seperate(){
        System.out.println("------------------------------------");
    }

    public static void stringsMain(){
        concating();
        seperate();
        
        multiLine();
        seperate();
        
        joining();
        seperate();

        stringBufferAndBuilder();
        seperate();
    }

    private static void concating(){
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

        String multi2 ="""
            Hello World!2
            Next Line
        """;
        System.out.println(multi2);

        String multi3 = """
            Hello World!3
            Next Line""";

        System.out.println(multi3);
    }
    
    private static void joining(){
        System.out.println(String.join("-", "1", "2", "3"));
        String[] strings = { "one", "two", "three"};
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


    private static void stringBufferAndBuilder(){
        StringBuffer sb = new StringBuffer("String");
        sb.append(" ");
        sb.append("Buffer!");

        System.out.println(sb.toString());

        StringBuilder sb2 = new StringBuilder("String");
        sb2.append(" ");
        sb2.append("Builder");
        System.out.println(sb2);
    }
}
