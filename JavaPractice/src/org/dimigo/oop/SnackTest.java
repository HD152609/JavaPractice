/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_ SnackTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 6.
 * </pre>
 *
 * @author  		: kimjuchan
 * @version 			: 1.0
 */
public class SnackTest {

	   /**
	    * @param args
	    */
	   public static void main(String[] args) {
	      Snack[] snacks={new Snack("새우깡","농심",1100,2),new Snack("콘칲","크라운",1200,1),new Snack("허니버터칩","해태",1500,4)};
	      for(int i=0;i<3;i++){
	         System.out.println(snacks[i].toString());
	         System.out.println();
	      }
	      System.out.println("총 구매 금액 : "+String.format("%,d",(snacks[0].calcPrice()+snacks[1].calcPrice()+snacks[2].calcPrice()))+"원");
	   }

	}