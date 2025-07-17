package com.xworkz.springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.*;

@Configuration
public class CollectionConfiguration {

    public CollectionConfiguration()
    {
        System.out.println("CollectionConfiguration constructor");
    }

    @Bean
    public ArrayList<String> arrayList1() {
        System.out.println("arrayList1 method");
        return new ArrayList<>(Arrays.asList("A", "B", "C"));
    }

    @Bean
    public ArrayList<String> arrayList2() {
        System.out.println("arrayList2 method");
        return new ArrayList<>(Arrays.asList("D", "E", "F"));
    }

    @Bean
    public ArrayList<String> arrayList3() {
        System.out.println("arrayList3 method");
        return new ArrayList<>(Arrays.asList("G", "H", "I"));
    }

    @Bean
    public ArrayList<String> arrayList4() {
        System.out.println("arrayList4 method");
        return new ArrayList<>(Arrays.asList("J", "K", "L"));
    }

    @Bean
    public ArrayList<String> arrayList5() {
        System.out.println("arrayList5 method");
        return new ArrayList<>(Arrays.asList("M", "N", "O"));
    }

    @Bean
    public LinkedList<String> linkedList1() {
        System.out.println("linkedList1 method");
        return new LinkedList<>(Arrays.asList("X", "Y", "Z"));
    }

    @Bean
    public LinkedList<String> linkedList2() {
        System.out.println("linkedList2 method");
        return new LinkedList<>(Arrays.asList("P", "Q", "R"));
    }

    @Bean
    public LinkedList<String> linkedList3() {
        System.out.println("linkedList3 method");
        return new LinkedList<>(Arrays.asList("S", "T", "U"));
    }

    @Bean
    public LinkedList<String> linkedList4() {
        System.out.println("linkedList4 method");
        return new LinkedList<>(Arrays.asList("V", "W", "X"));
    }

    @Bean
    public LinkedList<String> linkedList5() {
        System.out.println("linkedList5 method");
        return new LinkedList<>(Arrays.asList("Y", "Z", "A"));
    }

    @Bean
    public HashSet<String> hashSet1() {
        System.out.println("hashSet1 method");
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("Two");
        return set;
    }

    @Bean
    public HashSet<String> hashSet2() {
        System.out.println("hashSet2 method");
        HashSet<String> set = new HashSet<>();
        set.add("Three");
        set.add("Four");
        return set;
    }

    @Bean
    public HashSet<String> hashSet3() {
        System.out.println("hashSet3 method");
        HashSet<String> set = new HashSet<>();
        set.add("Five");
        set.add("Six");
        return set;
    }

    @Bean
    public HashSet<String> hashSet4() {
        System.out.println("hashSet4 method");
        HashSet<String> set = new HashSet<>();
        set.add("Seven");
        set.add("Eight");
        return set;
    }

    @Bean
    public HashSet<String> hashSet5() {
        System.out.println("hashSet5 method");
        HashSet<String> set = new HashSet<>();
        set.add("Nine");
        set.add("Ten");
        return set;
    }

    @Bean
    public LinkedHashSet<String> linkedHashSet1() {
        System.out.println("linkedHashSet1 method");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Alpha");
        set.add("Beta");
        return set;
    }

    @Bean
    public LinkedHashSet<String> linkedHashSet2() {
        System.out.println("linkedHashSet2 method");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Gamma");
        set.add("Delta");
        return set;
    }

    @Bean
    public LinkedHashSet<String> linkedHashSet3() {
        System.out.println("linkedHashSet3 method");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Epsilon");
        set.add("Zeta");
        return set;
    }

    @Bean
    public LinkedHashSet<String> linkedHashSet4() {
        System.out.println("linkedHashSet4 method");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Eta");
        set.add("Theta");
        return set;
    }

    @Bean
    public LinkedHashSet<String> linkedHashSet5() {
        System.out.println("linkedHashSet5 method");
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Iota");
        set.add("Kappa");
        return set;
    }

    @Bean
    public TreeSet<String> treeSet1() {
        System.out.println("treeSet1 method");
        TreeSet<String> set = new TreeSet<>();
        set.add("Java");
        set.add("Python");
        return set;
    }

    @Bean
    public TreeSet<String> treeSet2() {
        System.out.println("treeSet2 method");
        TreeSet<String> set = new TreeSet<>();
        set.add("C++");
        set.add("Rust");
        return set;
    }

    @Bean
    public TreeSet<String> treeSet3() {
        System.out.println("treeSet3 method");
        TreeSet<String> set = new TreeSet<>();
        set.add("Go");
        set.add("Ruby");
        return set;
    }

    @Bean
    public TreeSet<String> treeSet4() {
        System.out.println("treeSet4 method");
        TreeSet<String> set = new TreeSet<>();
        set.add("Perl");
        set.add("Scala");
        return set;
    }

    @Bean
    public TreeSet<String> treeSet5() {
        System.out.println("treeSet5 method");
        TreeSet<String> set = new TreeSet<>();
        set.add("Kotlin");
        set.add("Swift");
        return set;
    }

    @Bean
    public HashMap<String, String> hashMap1() {
        System.out.println("hashMap1 method");
        HashMap<String, String> map = new HashMap<>();
        map.put("1", "One");
        map.put("2", "Two");
        return map;
    }

    @Bean
    public HashMap<String, String> hashMap2() {
        System.out.println("hashMap2 method");
        HashMap<String, String> map = new HashMap<>();
        map.put("3", "Three");
        map.put("4", "Four");
        return map;
    }

    @Bean
    public HashMap<String, String> hashMap3() {
        System.out.println("hashMap3 method");
        HashMap<String, String> map = new HashMap<>();
        map.put("5", "Five");
        map.put("6", "Six");
        return map;
    }

    @Bean
    public HashMap<String, String> hashMap4() {
        System.out.println("hashMap4 method");
        HashMap<String, String> map = new HashMap<>();
        map.put("7", "Seven");
        map.put("8", "Eight");
        return map;
    }

    @Bean
    public HashMap<String, String> hashMap5() {
        System.out.println("hashMap5 method");
        HashMap<String, String> map = new HashMap<>();
        map.put("9", "Nine");
        map.put("10", "Ten");
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap1() {
        System.out.println("linkedHashMap1 method");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("A", "Apple");
        map.put("B", "Banana");
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap2() {
        System.out.println("linkedHashMap2 method");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("C", "Cherry");
        map.put("D", "Date");
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap3() {
        System.out.println("linkedHashMap3 method");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("E", "Elderberry");
        map.put("F", "Fig");
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap4() {
        System.out.println("linkedHashMap4 method");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("G", "Grape");
        map.put("H", "Honeydew");
        return map;
    }

    @Bean
    public LinkedHashMap<String, String> linkedHashMap5() {
        System.out.println("linkedHashMap5 method");
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("I", "Indian Fig");
        map.put("J", "Jackfruit");
        return map;
    }

    @Bean
    public TreeMap<String, String> treeMap1() {
        System.out.println("treeMap1 method");
        TreeMap<String, String> map = new TreeMap<>();
        map.put("X", "X-Ray");
        map.put("Y", "Yoyo");
        return map;
    }

    @Bean
    public TreeMap<String, String> treeMap2() {
        System.out.println("treeMap2 method");
        TreeMap<String, String> map = new TreeMap<>();
        map.put("A", "Ant");
        map.put("B", "Bat");
        return map;
    }

    @Bean
    public TreeMap<String, String> treeMap3() {
        System.out.println("treeMap3 method");
        TreeMap<String, String> map = new TreeMap<>();
        map.put("C", "Cat");
        map.put("D", "Dog");
        return map;
    }

    @Bean
    public TreeMap<String, String> treeMap4() {
        System.out.println("treeMap4 method");
        TreeMap<String, String> map = new TreeMap<>();
        map.put("E", "Elephant");
        map.put("F", "Fox");
        return map;
    }

    @Bean
    public TreeMap<String, String> treeMap5() {
        System.out.println("treeMap5 method");
        TreeMap<String, String> map = new TreeMap<>();
        map.put("G", "Goat");
        map.put("H", "Horse");
        return map;
    }

    @Bean
    public Properties properties1() {
        System.out.println("properties1 method");
        Properties p = new Properties();
        p.setProperty("name", "SpringApp");
        p.setProperty("version", "1.0");
        return p;
    }

    @Bean
    public Properties properties2() {
        System.out.println("properties2 method");
        Properties p = new Properties();
        p.setProperty("env", "dev");
        p.setProperty("debug", "true");
        return p;
    }

    @Bean
    public Properties properties3() {
        System.out.println("properties3 method");
        Properties p = new Properties();
        p.setProperty("author", "Admin");
        p.setProperty("year", "2025");
        return p;
    }

    @Bean
    public Properties properties4() {
        System.out.println("properties4 method");
        Properties p = new Properties();
        p.setProperty("email", "support@example.com");
        p.setProperty("phone", "1234567890");
        return p;
    }

    @Bean
    public Properties properties5() {
        System.out.println("properties5 method");
        Properties p = new Properties();
        p.setProperty("country", "India");
        p.setProperty("currency", "INR");
        return p;
    }

    @Bean
    public Hashtable<String, String> hashtable1() {
        System.out.println("hashtable1 method");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("U1", "User1");
        table.put("U2", "User2");
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtable2() {
        System.out.println("hashtable2 method");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("U3", "User3");
        table.put("U4", "User4");
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtable3() {
        System.out.println("hashtable3 method");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("U5", "User5");
        table.put("U6", "User6");
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtable4() {
        System.out.println("hashtable4 method");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("U7", "User7");
        table.put("U8", "User8");
        return table;
    }

    @Bean
    public Hashtable<String, String> hashtable5() {
        System.out.println("hashtable5 method");
        Hashtable<String, String> table = new Hashtable<>();
        table.put("U9", "User9");
        table.put("U10", "User10");
        return table;
    }

    @Bean
    public String[] namesArray1() {
        System.out.println("namesArray1 method");
        return new String[]{"Alice", "Bob", "Charlie"};
    }

    @Bean
    public String[] namesArray2() {
        System.out.println("namesArray2 method");
        return new String[]{"David", "Eva", "Frank"};
    }

    @Bean
    public String[] namesArray3() {
        System.out.println("namesArray3 method");
        return new String[]{"George", "Helen", "Ivy"};
    }

    @Bean
    public String[] namesArray4() {
        System.out.println("namesArray4 method");
        return new String[]{"Jack", "Kara", "Leo"};
    }

    @Bean
    public String[] namesArray5() {
        System.out.println("namesArray5 method");
        return new String[]{"Mia", "Noah", "Olivia"};
    }

}
