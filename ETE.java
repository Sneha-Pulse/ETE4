package CIA_Java;

import java.util.*;

public class Q1 {

//Thread1 to print the message
    public static void main(String[] args) {
        Object lock = new Object(); 

        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                System.out.println("Welcome to Java Programming Practical Test2");
            }
        });

//To check for anagrams
        Thread thread3 = new Thread(() -> {
            synchronized (lock) {
                String str1 = "christ";
                String str2 = "stirch";
                boolean areAnagrams = isAnagram(str1, str2);
                System.out.println( str1 + " and " + str2 + " are anagrams " + areAnagrams);
            }
        });

        thread1.start();
        thread3.start();
    }

    private static boolean isAnagram(String str1, String str2) {
        //to check if strings are anagrams
        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }
    }
