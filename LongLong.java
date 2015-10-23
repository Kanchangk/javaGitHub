/*You are given a string S. Find the length of its the longest substring which occurs at least two times. Occurences can intersect.

Input
One line containing a string S consisting of lowercase Latin letters.

Output
Output one integer - answer to the question.

Constraints
1 <= length of S <= 1000000 

sample input: abacaba
sample output: 3
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


		HashMap hm = new HashMap();

		int length = arr.length;

		for(int i=length;i>=1;i--)

		{

			for(int j=0;j<=length-i;j++)
			{
				
				if(hm.containsKey(String.valueOf(arr, j, i)))
					{
					System.out.println(i);
					return;
					}
				else
					hm.put(String.valueOf(arr, j, i), 1);

			}
		}
    }
}
