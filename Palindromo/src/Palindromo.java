import java.util.Scanner;

public class Palindromo {
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	     
	       
do {
	System.out.print("Inserire una parola: "); 

String  parola = scanner.nextLine();
parola = parola.replaceAll("\\s", "");
if(parolaPalindroma(parola)) {
System.out.println("la parola " + parola + " è palindroma");
}
else {
System.out.println("la parola " + parola + " non è palindroma");
	
} 
System.out.println("vuoi inserire un'altra frase? si, no" );
}
while (scanner.nextLine().equals("si"));{
	        


	scanner.close();
	    }
	   }
	   
	    public static boolean parolaPalindroma(String s) {
	    	
	        if (s.length() < 2)
	            return true;
	        if (s.charAt(0) == s.charAt(s.length() - 1))
	            return parolaPalindroma(s.substring(1, s.length() - 1));
	        else
	            return false;
	    }

	}


