package com.project;
import java.util.Arrays;
public class anagram {
	
	    public static boolean areAnagrams(String str1, String str2) {
	        if (str1 == null || str2 == null || str1.length() != str2.length()) {
	            return false;
	        }

	        char[] charArray1 = str1.toLowerCase().toCharArray();
	        char[] charArray2 = str2.toLowerCase().toCharArray();

	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        return Arrays.equals(charArray1, charArray2);
	    }

	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";
	        System.out.println("Input: \"" + str1 + "\", \"" + str2 + "\"");
	        System.out.println("Output: " + areAnagrams(str1, str2));

	        String str3 = "hello";
	        String str4 = "world";
	        System.out.println("Input: \"" + str3 + "\", \"" + str4 + "\"");
	        System.out.println("Output: " + areAnagrams(str3, str4));

	        String str5 = "Racecar";
	        String str6 = "racecar";
	        System.out.println("Input: \"" + str5 + "\", \"" + str6 + "\"");
	        System.out.println("Output: " + areAnagrams(str5, str6));

	        String str7 = "abc";
	        String str8 = "abcd";
	        System.out.println("Input: \"" + str7 + "\", \"" + str8 + "\"");
	        System.out.println("Output: " + areAnagrams(str7, str8));

	        String str9 = null;
	        String str10 = "test";
	        System.out.println("Input: \"" + str9 + "\", \"" + str10 + "\"");
	        System.out.println("Output: " + areAnagrams(str9, str10));

	    }
	}



