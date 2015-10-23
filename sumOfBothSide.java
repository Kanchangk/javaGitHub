/* V- number.
a number can be called V-number if the sum of the lower half of the array is equal to the sum of the
upper half of the array.

Example:
if num = 1221
sum of lower half = 3
sum of upper half = 3
that can be called as V-number

INPUT: first line consist of number of Test cases
OUTPUT: output should be YES if the number is a V-number, othewise NO.
*/

import java.util.*;
class sumOfBothSide {
	public static void main(String ... args) {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		int arr[] = new int[testCase+10];
		for (int i =0; i< testCase; i++) {
			arr[i] = s.nextInt();
		}
		for (int i = 0; i< testCase; i++) {
			int temp = arr[i];
		int sum = temp;
			int count = 0;
			int c = 0; 
			int b = 0;
			while (temp != 0) {
				temp /= 10;
				count++;	
			}
			for (int j = 0; j< (count/2); j++) {
				c = c + (sum % 10);
				sum /= 10;
			}
			if ((count%2) != 0) sum = sum/10;
			for (int j = 0; j< (count/2); j++ ){
				b = b + (sum % 10);
				sum /= 10;
			}
			if (c == b) {
			System.out.println("YES"); 
			}
			else { System.out.println("NO"); }
		}
	}
}