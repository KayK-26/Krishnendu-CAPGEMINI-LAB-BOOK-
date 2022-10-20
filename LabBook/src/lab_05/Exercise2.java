package lab_05;

import java.util.Scanner;
import java.util.regex.*;

@SuppressWarnings("serial")

public class Exercise2 extends Exception{
	 public Exercise2 (String str) {
	        super(str);
	    }
	    static public void valName(String fullName) throws Exercise2{


	        if(!(Pattern.matches("\\[a-zZ-A]", fullName))) {
	            throw new Exercise2("Full Name Can Not Be Blank");
	        }else {
	            System.out.println("Full Name Valid");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String fullName=sc.next();
	        try {
	            valName(fullName);
	        }catch(Exercise2 e) {
	            System.out.println(e);
	        }
	        sc.close();	    }
}
