package javaprogramsforinterview;

import java.util.Scanner;

public class OccurrencesofWordinaString {

	public static void main(String args[]) 
	{
	    String str = "GeeksforGeeks A computer science portal for geeks ";
	    String word = "for";
	    System.out.println(countOccurences(str, word));
	}

	static int countOccurences(String str, String word) {
		
		 String a[] = str.split(" ");
		 
		    // search for pattern in a
		    int count = 0;
		    for (int i = 0; i < a.length; i++) 
		    {
		    // if match found increase count
		    if (word.equals(a[i]))
		        count++;
		    }
		 
		    return count;
		}


}