/*
You are given a string  that contains  characters. Your task is to determine the maximum possible size of the subsequence  of  such that no two adjacent characters in  are the same.
Note: The string contains only lowercase English alphabets.

Input format
First line: A single integer  denoting the number of test cases
For each test case:
First line: Single integer  denoting the size of the string
Second line:  denoting the string
Output format

For each test case, print a single line containing one integer that represents the maximum size of the subsequence that satisfies the provided condition.

Constraints
Note: The sum of  overall test cases do not exceed 10^6.

Sample Input   Sample Output
2               5
5               2
ababa
5
aaaac

*/
import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
       
        Scanner s = new Scanner(System.in);
        int testCase = Integer.valueOf(s.nextLine()); 
        

        for(int i=0; i<testCase; i++){
            int len = Integer.valueOf(s.nextLine());
            System.out.println(maxString(len, s.nextLine()));
        }
    }

    private static int maxString(int len, String s){
        if(len==1 || len==0) return len;
        int max = 0;
        int i=0, j=i+1;
        while (i!=j && j<len){
           if(s.charAt(j)==s.charAt(j-1))
            i++;
            max = Integer.max(max, j-i+1);
            j++;
        }
        return max;
    }
}
