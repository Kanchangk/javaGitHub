/* how many numbers from A to B with sum of digits from X to Y are divisible by K 
input: the first line contains 5 space separated  positive integers : A, B, X, Y, K
Output: count of how many such digits are there

constraints:
0 < A,B,K <= 100000000000000
0 < X,Y <= 100000000000000A <= B

example: 
input: 5 86 1 6 4
output: 6
there are 6 such numbers: 12,20,24,32,40,60

*/
import java.util.Scanner;
class digitFind {
	public static void main( String ... args) {
		Scanner s = new Scanner(System.in);
		int a,b,x,y,k;
		a = s.nextInt();
		b = s.nextInt();
		x = s.nextInt();
		y = s.nextInt();
		k = s.nextInt();
		int count = 0;
		for (int i = a; i<= b; i++) {
		int j = i; 
		int sum = 0;
		while (j != 0) {
			sum += j % 10;
			j /= 10;
			}
			if ( (sum >=x) && (sum <=y) && (i % k == 0)) {
			count ++;
				}
		}
		System.out.println("there are" +count+" such numbers");
	}
}