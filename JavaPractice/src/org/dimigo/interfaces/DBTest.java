/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * interfaces
 *    |_ DBTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 25.
 * </pre>
 *
 * @author  		: kimjuchan
 * @version 			: 1.0
 */
public class DBTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception  {
		IDBManager i1= IDBManager.getDBObject(IDBManager.SYBASE_DATABASE);
		System.out.println("<< 변경 전 >>");
		crud(i1);
		System.out.println();
		i1=IDBManager.getDBObject(IDBManager.ORACLE_DATABASE);
		System.out.println("<< 변경 후 >>");
				crud(i1);

	}
	public static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}

}
