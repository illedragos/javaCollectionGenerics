package com.company;

import java.util.*;
import java.util.stream.Collectors;

/*
Collection is an interface
Collections is a class
*/
public class Main {

    public static void main(String[] args) {
        //---->Collection<----
        //can have different types
        //collection holds object type so you cand add strings and also integer, double, char
        Collection collection = new ArrayList();
        collection.add(2);
        collection.add(2.0);
        collection.add('a');
        collection.add("Dragoshell");
        collection.add("Delete");
        System.out.print("Collection contains: ");
        for(Object o:collection){
            System.out.print(o+",");
        }
        collection.remove("Delete");  //removing elements
        System.out.println("\n**********************************");
        Iterator i = collection.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+",");
        }
        System.out.println("\n**********************************");

        Collection<Integer> collectionOfInteger = new ArrayList<>();
        collectionOfInteger.add(12);
        collectionOfInteger.add(23);
        collectionOfInteger.add(45);
        collectionOfInteger.add(78);
        System.out.print("CollectionofInteger contains:");
            for(Object o:collectionOfInteger){
                System.out.print(o+",");
            }
        System.out.println("\n**********************************");

        //---->List<----
        // works with index numbers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(11);
        integerList.add(567);
        integerList.add(11);
        integerList.add(98);
        integerList.add(0,111111); //adding to certain index
        System.out.print("integerList contains:");
            for(Object o:integerList){
                System.out.print(o+",");
            }
        System.out.print("\nPrimul element din lista :"+integerList.get(0));
        System.out.println("\n**********************************");
        Collections.sort(integerList);   //sorting a list method 1
//      integerList.stream().sorted().collect(Collectors.toList());   ;  //sorting a list method 2
        System.out.println("Sorted list with collections.sort");
            integerList.forEach(System.out::println); //Stream API Lambda Expression (java 8)
        System.out.println("\n**********************************");


        //---->Vector<----
        //capacity increase by 100%
        //Vector is in java from 1.0 (outdated) in project use arraylist
        //Vector is Threadsafe ->slow
        Vector<Integer> vector = new Vector<Integer>();
        vector.add(1);
        vector.add(5);
        System.out.println("vector capacity"+vector.capacity());
        System.out.println("Vector :");
            vector.forEach(System.out::println);

         //---->ArrayList<----
        //ArrayList capacity increase by 50%
        //Arraylist is time consuming when adding elements in between array
        //is fast when you want to search for an element
        //ArrayList is not threadsafe -> fast
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(74);
        integerArrayList.add(68);
        integerArrayList.add(32);
        integerArrayList.add(74);
        System.out.println("IntegerArrayList contains:");
            for(Object o:integerArrayList){
                System.out.print(o+",");
            }
        System.out.print("\nPrimul element din arraylist :"+integerArrayList.get(0));
        System.out.println("\n**********************************");

        //---->LinkList
        //are more efficeint when adding elements in between
        //are slow when you search for element
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(22);
        linkedList.add(15);
        linkedList.add(17);
        System.out.println("Linked list elements");
        linkedList.forEach(System.out::println);

        //---->Set<----
        // Set has unique values
        //A HashSet is a set where the elements are not sorted or ordered.
        //It is faster than a TreeSet. The HashSet is an implementation of a Set
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(1);
        integerSet.add(1);
        integerSet.add(5);
        integerSet.add(3);
        integerSet.add(2);
        System.out.println("integerSet contains :");
                for(Object o :integerSet){
                    System.out.print(o+",");
                }
        System.out.println("\n**********************************");

        //A TreeSet is a set where the elements are sorted
        Set<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(1);
        integerTreeSet.add(1);
        integerTreeSet.add(5);
        integerTreeSet.add(3);
        integerTreeSet.add(2);
        System.out.println("integerTreeSet contains :");
            for (Object o: integerTreeSet){
                System.out.print(o+",");
            }
        System.out.println("\n**********************************");

        //---->Map<----
        //Map is a key value pair
        //HashMap is non synchronized, allow one null key
        //HashTable is syncronized, does not allow null key
        //Map implements HashMap HashTable TreeHashMap LinkedHashMap
        //keys are unique you can't have repeted keys
        //key-value pair is one entry
        Map<String,String> map = new HashMap<>();
            map.put("Dragos","0711111111");
            map.put("Elena","072222222");
            map.put("Flavia","07333333");

        Set<String> keys = map.keySet();
        for(String key :keys){
            System.out.println(key+" "+map.get(key));
        }

        Set<Map.Entry<String,String>> values = map.entrySet();

        System.out.println("\n-------------------------------");

        for(Map.Entry<String,String> entry : values){
            System.out.println(entry.getKey()+","+entry.getValue());
        }

        //System.out.println(map);
        //System.out.println(map.get("name"));


        /*<-------BOUNUS------>
        ArrayList initialization using double brace
         */
        List<Integer> listA = Arrays.asList(22,32,42,42);
        List<Integer> listB = new ArrayList<Integer>(){
            {
                add(21);
                add(31);
                add(43);
                add(34);
            }
        };



    }
}
