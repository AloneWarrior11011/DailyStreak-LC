//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*
Input :
n = 5
arr[] = {10, 11, 1, 2, 3}
Output :
11 11 3 3 3
Explanation:
At index 0, arr[0] or arr[1] = 11
At index 1, arr[1] or arr[2] = 11
At index 2, arr[2] or arr[3] = 3
...
At index 4, No element is left So, it will remain as it is.
New Array will be {11, 11, 3, 3, 3}.
*/

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Solution obj = new Solution();
		    arr = obj.game_with_number(arr, sizeOfArray);
		    for(int i=0; i< sizeOfArray;i++){
		        System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		}
	}
}



// } Driver Code Ends


// This what the code is...for play with bitwise or

class Solution{
    
   
    // Function for finding maximum and value pair
    public static int[] game_with_number (int arr[], int n) {
        // Complete the function
        if(n == 1){
            return new int[]{1};
        }
        int[] ans = new int[n];
        for(int i = 0; i < n; i++){
            if(i != n-1){
                ans[i] = (arr[i] | arr[i+1]);
            }
            else{
                ans[i] = arr[i];
            }
        }
        return ans;
    }
    
}



