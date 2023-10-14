package javadsa.String;
import java.io.*;
public class strword {
 
	// Function to return shortest distance
	    public static int shortestDistance(String[] input ,String word1 ,String word2)
	{
	    int distance1 = -1, distance2 = -1;
	    int answer = Integer.MAX_VALUE;

	    // Traverse the string
	    for (int i = 0; i < input.length; i++) {
	        if (input[i] == word1)
	            distance1 = i;
	        if (input[i] == word2)
	            distance2 = i;
	        if (distance1 != -1 && distance2 != -1)
	            answer = Math.min(answer , Math.abs(distance1 - distance2));
	    }

	    // Return the answer
	    return answer;
	}

	 // Driver Code
	    public static void main (String[] args) {
	        String[] S
	        = { "the", "quick", "brown", "fox", "quick" };

	    String word1 = "the", word2 = "fox";

	    // Function Call
	    System.out.println(shortestDistance(S, word1, word2));
	    }
	}


