/* XOR set
There are N numbers A1,A2,A3.....An. There are consequtive subsequence A[i].....A[j], where 1<= i <= j <=N
For example N=3, the subsequence may be: 
A[1] 
A[2]
A[1], A[2]
A[2],A[3]
A[1], A[2], A[3]
For every subsequence apply XOR operation on all the subsequent and find the "most frequent number".

INPUT: 
First line contains integer N, followed by N lines, each line contains an integer
OUTPUT:
Output one line contains the most frequent number and how many times it appears. If there is multiple numbers that
has the most frequency, choose the minimum number.

CONSTRAINTS:
1<= N <= 100000
1<= A[i] <= 100000000

Sample input: 
4
2
1
1
3
 output: 1 3
 
EXPLAINATION:
Finding the XOR in all sub-sequences
2=2
2^1=3
2^1^1=2
2^1^1^3=1
1=1
1^1=0
1^1^3=3
1=1
1^3=2
3=3

1,2,3 are all repeated three times.Since we are looking fpr minimum number 1 is the answer.
*/

import java.util.*;
class xor {
	public static void main(String ... args) {
	Scanner s = new Scanner (System.in);
//	System.out.println("tell me how many integers you want to enter : ");
	int test = s.nextInt();
	int res[] = new int[test]; 
	int arr[] = new int[test+1];	// create an array to hold the test cases integers
	int total = 0;
//	System.out.println("enter the numbers : ");
	for (int i =0; i<test; i++) {
		arr[i] = s.nextInt();
		total = total+test -i;
		}
		int array [] = new int[100010];
		int k = 1;
		// calculate the xor of every possible combinations
		for (int i= 0; i<test; i++) {
			array[k] = arr[i];
			for (int j=i+1; j<test; j++) {
			array[k+1] = array[k] ^ arr[j];
			k++;
			}
			k++;
		}
		// count how many times each resulted integer has occurred and store it in res[] array 
		for (int i= 0; i< test; i++)  {
			int count = 0;
			for (int j =1; j<=total; j++ ) {
			if (arr[i] ==  array[j])
				count++;
			}
		res[i] = count;
	}
	int key = res[0]; int d = 0;
	for (int i =0; i<test-1; i++) {
		if (key<= res[i+1]) {
			if (key < res[i+1]){
				key = res[i+1];
			}
			if ((key == res[i+1]) && (arr[i] < arr[i+1]) )
				d = i;
			else d = i+1;
		}
	}
	System.out.println(arr[d]+" "+key);
}
}