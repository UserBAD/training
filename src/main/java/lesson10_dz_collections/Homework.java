package lesson10_dz_collections;


import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class Homework {
    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "apple", "orange", "garlic", "orange", "apricot", "apricot", "broccoli", "apricot", "carrot", "carrot",};
        System.out.println(getWords(words));
        System.out.println(getWords2(words));

        Phonebook phonebook = new Phonebook();
        phonebook.add("Petrov", "555654");
        phonebook.add("Ivanov", "123456");
        phonebook.add("Ivanov", "456789");
        phonebook.add("Petrov", "444444");
        phonebook.add("Petrov", "321456");

        System.out.println("Телефон Иванова: " + phonebook.get("Ivanov"));
        System.out.println("Телефон Петрова: " + phonebook.get("Petrov"));

    }
    private static TreeSet<String> getWords(String [] arr){
        return new TreeSet<>(Arrays.asList(arr));

    }
    private static HashMap <String,Integer> getWords2 (String[] arr){
        HashMap<String,Integer> map = new HashMap<>();
        for (String s : arr) {
            map.merge(s, 1,Integer::sum );
            }
        return map;
    }

}
