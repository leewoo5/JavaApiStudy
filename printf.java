package study;

import java.util.Calendar;
import java.util.Locale;

public class printf {
	
	public static void main(String[] args) {
		
		//printf()과 system.out.format()은 같다. 
		
		/*
		 * %d   = 정수
		 * %.2f   = 실수(float) 소수점 둘째자리까지 표시
		 * %,d  = 정수에 ,로 단위표시
		 * %n   = 줄바꿈 
		 * %tB  = 월(ex: 10월)
		 * %td  = 월(ex: 10)
		 * %te  = 일(ex: 14)
		 * %ty  = 년(ex: 16)
		 * %tY  = 년(ex: 2016)
		 * %tl  = 시(ex: 1~12)
		 * %tM  = 분(ex: 1~59)
		 * %tp  = 오전/오후(ex: am)
		 * %tD  = 날짜(05/29/16)
		 * 
		 */
		
		
		 int a = 100;
		  
		  System.out.printf("%05d%n", a);
		 
		 long n = 461012;
		 
	      System.out.format("%d%n", n);      //  -->  "461012"
	      System.out.format("%08d%n", n);    //  -->  "00461012"
	      System.out.format("%+8d%n", n);    //  -->  " +461012"
	      System.out.format("%,8d%n", n);    // -->  " 461,012"
	      System.out.format("%+,8d%n%n", n); //  -->  "+461,012" 
	      System.out.format("%,d%n%n", n); //  -->  "+461,012" 
	      
	      double pi = Math.PI;
	
	      System.out.format("%f%n", pi);       // -->  "3.141593"
	      System.out.format("%.3f%n", pi);     // -->  "3.142"
	      System.out.format("%10.3f%n", pi);   // -->  "     3.142"
	      System.out.format("%-10.3f%n", pi);  // -->  "3.142"
	      System.out.format(Locale.FRANCE,
	                        "%-10.4f%n%n", pi); // -->  "3,1416"
	
	      Calendar c = Calendar.getInstance();
	      System.out.format("%tB %te, %tY%n", c, c, c); // -->  "May 29, 2006"
	      
	      System.out.format("%tB%n", c); // -->  "May"
	      System.out.format("%ty%n", c); // -->  "2016 -> 16"
	
	      System.out.format("%tl:%tM %tp%n", c, c, c);  // -->  "2:34 am"
	
	      System.out.format("%tD%n", c);    // -->  "05/29/06"
	    }
		
		
		
	}	






















