/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *    |_ FamilyMember
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author  		: kimjuchan
 * @version 			: 1.0
 */
public class FamilyMember {
		private  static int memberCnt;
		private String memberName;
		
		/**
		 * @return the memberName
		 */
		public String getMemberName() {
			return memberName;
		}

		public FamilyMember(String memberName) {
			this.memberName = memberName;
			memberCnt++;
		}
		public static void printMemberCnt(){
			System.out.println("가족 총 인원수 : "+ memberCnt + "명");
		}
}
