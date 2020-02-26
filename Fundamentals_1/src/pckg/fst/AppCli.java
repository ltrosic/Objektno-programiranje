package pckg.fst;

import java.util.Scanner;

public class AppCli {

	public static void main(String[] args) {
	
		System.out.println("Unesi prvi broj");
		Scanner n = new Scanner(System.in);
				
		int a=n.nextInt();
		int suma=0;
		int i=0;
		
		//for (int i=0; i<a; i++) {
		//	suma=suma+i;
			
		while (i<a) {
			suma=suma+i;
			i++;
			
		}
			System.out.println("suma je" +suma);
	}

}

