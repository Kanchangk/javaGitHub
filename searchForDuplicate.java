/*
There are N people in a group. The personality of each person is denoted by A[i] from the set A, where A[i] denotes the personality of the ith person.

Your task is to find the total persons of different personalities.

INPUT:

First line contains the total number of test cases T, for each test cases, first line denotes the total number of persons N and second line contains list of N space separated integers denoting the personality of the person.

OUTPUT:

For each test case, print the result in a single line.

Constraints:

1 <= T <= 100

1 <= N <= 100000

1 <= A[i] <= 1000000000

Sample Input(Plaintext Link)
 1
5
1 2 3 4 5

sample output: 5
*/

import java.util.*;
class uniqueNo {
	public static void main(String ... args) {
	long start = System.currentTimeMillis();
		int testCase;
		Scanner s = new Scanner(System.in);
		testCase = s.nextInt();
		int [][] arr = new int [testCase][100010];
		for (int i = 0; i<testCase; i++) {
			int f = s.nextInt();
			arr[i][0] = f;
			for (int j = 1; j<=f; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		//Arrays.sort(arr);
		for (int i =0; i< testCase; i++) {
			for (int j = 1; j< arr[i][0]; j++) {
				int key = arr[i][j+1];
				int k = j;
				while (k>0 && arr[i][k] > key) {
					arr[i][k+1] = arr[i][k];
					k= k-1;
				}
				arr[i][k+1] = key;
			}
		}
		for (int i = 0; i< testCase; i ++) {
			int count = 0;
			for (int j = 1; j<= arr[i][0]; j++) {
				if (arr[i][j+1] != arr[i][j]) 
					count++;
			}
//			System.out.print("	");
			System.out.println(count);
		}
/*		for (int i = 0; i< testCase; i ++) {
			for (int j = 1; j<= arr[i][0]; j++) {
				System.out.println(" ");
			System.out.print(arr[i][j]);
			System.out.print("	");
			}
			System.out.println(" ");
		}
		*/
//long end = System.currentTimeMillis();
//System.out.println((end - start)/1000);
	}
}
