package basic.Collections3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

public class Lists2 {

    private static void sepereator() {
        System.out.println("========================================");
    }

    public static void lists2Run() {
        arrayLists();
        sepereator();

        linkedLists();
        sepereator();

    }

    private static void arrayLists() {
        System.out.println("-------arrayLists-------");

        List<String> list = new ArrayList<>();
        list.add("null");
        list.add("hello1");
        list.add("hello2");
        System.out.println("list: " + list);
        System.out.println("size: " + list.size());
        list.remove(1);
        System.out.println("list: " + list);
        System.out.println("size: " + list.size());

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("list2: " + list2);
        list2.retainAll(Arrays.asList(2, 4));
        System.out.println("list2: " + list2);

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("list3: " + list3);
        list3.removeAll(Arrays.asList(2, 4));
        System.out.println(list3);
        System.out.println("list3.contains(2): " + list3.contains(2));
        System.out.println("list3.indexOf(5): " + list3.indexOf(5));

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("list4: " + list4);
        list4.removeIf(i -> i % 2 == 0);
        System.out.println("list4: " + list4);
        list4.replaceAll(i -> i * 2);
        System.out.println("list4: " + list4);
    }

    private static void linkedLists() {
        System.out.println("-------linkedLists-------");

        List<String> list = new LinkedList<>();
        list.add("bbbb");
        list.add("aaaa");
        list.add("cccc");
        System.out.println("list: " + list);

        List<String> orderedList = new LinkedList<>();
        list.stream().sorted().forEach(s -> orderedList.add(s));
        System.out.println("orderedList: " + orderedList);

        Collections.sort(list);
        System.out.println("list: " + list);

    }
}
