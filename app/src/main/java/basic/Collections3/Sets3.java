package basic.Collections3;

import java.util.HashSet;
import java.util.Set;

public class Sets3 {
    private static void seperate() {
        System.out.println("====================================");
    }

    public static void setsMain() {
        System.out.println("-----------Sets-----------");
        hashSets();
        seperate();
    }

    private static void hashSets() {
        System.out.println("-----------HashSets-----------");

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");

        System.out.println("set: " + set);
        System.out.println("set.size(): " + set.size());
        set.add("A");
        System.out.println("set: " + set);

        System.out.println("set.contains(\"A\"): " + set.contains("A"));
        System.out.println("set.contains(\"D\"): " + set.contains("D"));

        System.out.println("set.remove(\"A\"): " + set.remove("A"));
        System.out.println("set.remove(\"D\"): " + set.remove("D"));
        System.out.println("set: " + set);
        System.out.println("set.remove(\"A\"): " + set.remove("A"));

    }
}
