package lesson3_dz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lesson3_dz {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();


    public static void main (String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Угадай слово >>>");
        int wordAI = random.nextInt(words.length);
        String valueAI = words[wordAI];
        System.out.println("Загаданое слово: " + valueAI);

        while (true){
            String answerUser = scanner.next();
            if (answerUser.equals(valueAI)){
                System.out.println("Угадал");
                break;
            }
                char[] arr = new char[15];
                Arrays.fill(arr, '#');

                for (int i = 0; i < answerUser.length() && i < valueAI.length(); i++) {
                    if (answerUser.charAt(i) == valueAI.charAt(i))
                        arr[i] = valueAI.charAt(i);
                }
                System.out.println(new String(arr));
                System.out.println("Не угадал, попробуй еще" );


        }
    }
}
