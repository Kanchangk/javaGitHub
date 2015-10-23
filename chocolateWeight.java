/* chocolate task
supriya asked bunny to find a chocolate which weights X and bunny has to get a chocolate exact weight from the series 
of chocolate stores which are present in the university. If he succeeds in it, she will say "i like you" else "i hate you"
Note: X weights should be one or only 2 different weights of other chocolate.

sample input:
5 -- size of array
5 2 3 4 1 --weight of chocolates
4 -- number of quaeies 
10 -- integer X, 
4
2
12

out:
i hate you
i like you
i like you
i hate you
*/


import java.util.Scanner;
class pagal {
	public static void main(String ... args) {
		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		int arr[] = new int[testCase];
		for (int i =0; i< testCase; i++) {
			arr[i] = s.nextInt();
		}
		int query = s.nextInt();
		int arrQ[] = new int[query];
		for (int i =0; i< query; i++) {
			arrQ[i] = s.nextInt();
		}
		for (int i = 0; i< query; i++) {
			int res = 0;
			for (int j =0; j< testCase; j++) {
				if(arrQ[i] == arr[j])
				{ res = 1;
				break; }
					for (int m = (j+1); m< testCase; m++) {
						if (arrQ[i] == (arr[j] + arr[m])) {
						res = 1; }
					}
			}
				if (res == 1) System.out.println("I Like You");
				else System.out.println("I Hate You");
		}
	}
}