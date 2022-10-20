package lab_05;

import java.util.*;

@SuppressWarnings("serial")

public class Exercise1 extends Exception{
	public Exercise1(String str) {
	        super(str);
	    }

	    static public void valAge(int age) throws Exercise1 {
	        if (age <= 15) {
	            throw new Exercise1("Age should be above 15");
	        } else {
	            System.out.println("Valid age");
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int ag = sc.nextInt();
	        try {
	            valAge(ag);
	        } catch (Exercise1 e) {
	            System.out.println(e);
	        }
	    sc.close();
	    }
	    
	}

	