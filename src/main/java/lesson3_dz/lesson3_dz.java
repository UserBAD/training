package lesson3_dz;

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
        for (int i = 0; i < words.length; i++) {
            String answer = scanner.next();
            if (answer.equals(valueAI)){
                System.out.println("Угадал");
            } else System.out.println("не угадал");

            char[] answerArr = answer.toCharArray();
//            char[] valueArr = valueAI.toCharArray();
//
//            for (int j = 0; j < answerArr.length; j++) {
//                for (int k = 0; k < answerArr[j]; k++) {
//
//                    System.out.print(answerArr[k]+ "  ");
//                }
//
//                System.out.print(answerArr[j]+ "!");
//            }



            String [] arr = new String[15];
            for (int j = 0; j < arr.length; j++) {
                String str = valueAI;
                char a = str.charAt(j++);
                arr [j] = a;
                arr [j] = "#";



                System.out.print(arr[j] );
            }


//            System.out.println(a);
//break;
        }

    }
}
