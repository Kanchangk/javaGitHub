/*
archith loves to solve the problem of numerical conversions and he is very good at. His friend chaitanya wanted him to pull in into the conversion of decimals into roman numerals. Now archith got little it confused and wanted his other friend aravind to him for this as he is good in programming. Now, you as aravind solve archith's problem.

INPUT: first line consists of t test cases. Next t lines contains a decimal number N.

OUTPUT: Display the roman number for every decimal number.

0<t<=100 0<N<=100

Sample Input
 3
10
20
59
Sample Output
 X
XX
LIX
*/

import java.util.Scanner;
class deciToRom {
	public static void main(String ... args) {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		int arr[] = new int[testCase];

		String rom[] = { "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int dec[] = {100,90,50,40,10,9,5,4,1};
		for (int i =0; i< testCase; i++) {
			arr[i] = s.nextInt();
		}
		
		for(int i=0; i<testCase;i++) {
			String str = "";
			int temp = arr[i];
			for(int j = 0; j< 9; j++) {
				while(temp >= dec[j]) {
					temp = temp-dec[j];
					str = str+ rom[j];
				}
			}
			System.out.println(str);
		}
	}
}