/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * interfaces
 *    |_ SybaseDB
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author  		: kimjuchan
 * @version 			: 1.0
 */
public class SybaseDB implements IDBManager {

	@Override
	public void insert() {
		System.out.println("Sysbase DB 저장");
		
	}

	
	public void search() {
		// TODO Auto-generated method stub
		System.out.println("Sysbase DB 조회");
	}

	
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Sysbase DB 변경");
	}

	
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Sysbase DB 삭제");
	}

}
