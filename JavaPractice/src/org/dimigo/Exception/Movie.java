/**
 * 
 */
package org.dimigo.Exception;

/**
 * <pre>
 * org.dimigo.Exception
 *    |_ Movie
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 6. 2.
 * </pre>
 *
 * @author  		: kimjuchan
 * @version 			: 1.0
 */
public class Movie {

	private String title;
	private int limitAge;
	
	public Movie(String title, int age) {
		this.title= title;
		this.limitAge=age;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}
	
public void buyTicket(int age) throws Exception{
	try {
	if(age<limitAge){
			throw new Exception(title +"은/는" +limitAge+"세 이상 관람가입니다.    "
					+ "");
		} 
	else System.out.println(title+"즐감하세요");
	
	}
	catch(Exception e){
		throw e;
	}
}

}
