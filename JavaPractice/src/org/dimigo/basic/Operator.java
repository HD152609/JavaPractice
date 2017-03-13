/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |_ Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 13.
 * </pre>
 *
 * @author  		: kimjuchan
 * @version 			: 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long salary =1700000;
		long people =3;
		long shop = 1500;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d", salary)+"원");
		System.out.println("점포 내 직원 수 : "+String.format("%,d", people)+"명");
		System.out.println("점포 수 : "+String.format("%,d", shop)+"개");
		System.out.println("");
		System.out.println("");
		System.out.println("연간 건비 : "+String.format("%,d", salary*people*shop*12)+"원");
	}

}
