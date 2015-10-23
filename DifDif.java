/*
You are given a string S. Find the number of different substrings in S.

Input
One line containing a string S consisting of lowercase Latin letters.

Output
Output one integer - answer to the question.

Constraints
1 <= length of S <= 1200

sample input: abc
sample output: 6
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



class TestClass {
    public static void main(String args[] ) throws Exception {
        
      //   * Read input from stdin and provide input before running

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
    char[] arr = line.toCharArray();
     //  char[] arr= new char[1200];

HashMap hm = new HashMap();

int length = arr.length;

for(int i=1;i<=length;i++)

{

for(int j=0;j<=length-i;j++)

{

hm.put(String.valueOf(arr, j, i), 1);

}

}

Set keys = hm.keySet();

int count=0;

for(Object i: keys)

{

    count++;

}


        System.out.println(count);
    }
}
