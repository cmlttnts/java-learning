package basic.Collections;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Hashtable;
import java.util.Map;

public class Maps1 {

    public static void maps1Run(){
        Map<String, String> map = new HashMap<>();
        // thread safe versions
        Map<String, String> map2 = new Hashtable<>();
        Map<String, String> map3 = new ConcurrentHashMap<>();


        map.put("null", "null".toUpperCase());
        map.put("hello", "hello".toUpperCase());

        System.out.println(map);

        map.values().stream().forEach( s -> System.out.println("values foreach: " + s));
        map.keySet().stream().forEach( s -> System.out.println("keySet forEach: " + s));
        map.forEach((s1, s2) -> System.out.println("map.forEach s1 + s2 : " +  s1 + " + " + s2));
        
        System.out.println(map.get("hello"));
        System.out.println(map.containsKey("hollo"));
        System.out.println(map.containsKey("hello"));
        map.remove("HELLO");
        System.out.println(map.size());
        map.remove("hello");
        System.out.println(map.size());

        map.put("actualNull", null);
        System.out.println(map.getOrDefault("actualNull", "defaultValue"));
    }
    
}
