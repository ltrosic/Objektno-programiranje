package pckg.snd;

import java.util.Arrays;

public class App {

	public static void main(String[] args) {
		int[]ar1 = new int[5];
		String[]st1 = {"prvi","drugi","treci","cetvrti","peti"};

		for(int k=0; k < ar1.length; k++) {
		ar1[k] = k+1;
		}
		int up=0;
		while(up < st1.length) {
			System.out.println("str[ " + up +" ] --> " + st1[up]);
			
			up++;
		}
		System.out.println(Arrays.toString(ar1));
		System.out.println(ar1);
	
}
}

