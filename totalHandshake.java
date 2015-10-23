/*
A meeting between SHIELD and Avengers took place to stop Ultron. All the Avengers are present in the meeting. Everyone is shaking hands with others but exactly once.

Tony Stark asked from Captain America that total how many handshakes took place in the meeting. Help Captain to calculate total handshakes.

INPUT:

The first line contains the number of test cases T, The next T lines follows.

Each line then contains an integer N, the total number of members attend the meeting.

OUTPUT:

Print the number of handshakes for each test-case.

Constraints:

1 <= T <= 1000

1 <= N <= 1000000

Sample Input(Plaintext Link)
 2
1
2
Sample Output(Plaintext Link)
 0
1
*/

import java.util.*;
public class handshake {
	public static void main( String ... args ) {
		int testCase;
		Scanner s = new Scanner(System.in);
		testCase = s.nextInt();
		int [] arr = new int [testCase];
		for (int i = 0; i<testCase; i++) {
			arr[i] = s.nextInt();
		}
		int result [] = new int [testCase];
		for (int i = 0; i<testCase; i++) {
			result[i] = ((arr[i]-1) * arr[i] )/2;
		}
		for (int i= 0; i<testCase; i++) {
			System.out.println(result[i]);
		}
	}
}