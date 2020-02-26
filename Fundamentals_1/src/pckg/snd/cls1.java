package pckg.snd;

public class cls1 {

	public static void main(String[] args) {
		String str ="Uh što mi je zanimljivo kod baba Ante na predavanjima :)";
		char[] niz = str.toCharArray();
		
		for (char ch : niz) {
			System.out.println(ch);
		}
		System.out.println("\n**************************");
		for(int k=0; k<niz.length; k++) {
			System.out.println(niz[k]);
		}
	}

}
