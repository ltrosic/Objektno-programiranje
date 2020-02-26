package pckg.snd;

import java.util.Arrays;
import java.util.Scanner;

public class zadatak {

	public static void main(String[] args) {
		
		int [] niz = new int [5];
		Scanner sc = new Scanner (System.in);
		boolean flag;
		
		
		for (int k=0; k<niz.length; k++) {
			flag=true;
			while (flag) {
				System.out.println("Unesi cijeli broj na -> " + k +" poziciju ");
				if (sc.hasNextInt()) {
					niz[k] = sc.nextInt();
					System.out.println("In: " + k + " postion you have entered -> " + niz[k]);
					flag=false;
				} else {
					System.out.println("Niste unijeli cijeli broj - Integer!!!");
			}
				sc.hasNextLine();
		}
	
		
		}
		
	sc.close();
	System.out.println(Arrays.toString(niz));
	
	}
}
