package ch03;
/*
 * if : 분기문 : branch statement
 * - 조건에 따라 수행하거나 수행하지 않는 코드 블럭을 만든다.
 * 
 * - if(수행 조건) {수행 코드} 
 * - (수행 조건)이 true이면, {수행 코드}를 수행 
 * - (수행 조건)이 false이면, {수행 코드}를 수행하지 않는다.
 * if ~ else
 * - if(수행 조건) {if 수행 코드} ~ else {else 수행 코드} 
 * - (수행 조건)이 true이면, {if 수행 코드}를 수행
 * - (수행 조건)이 false이면, {else 수행 코드}를 수행 
 */
public class Ch03Ex18 {

	public static void main(String[] args) {
		
		//놀이동산
		int ticket = 1; // 0: 없음, 1: 종일권
		
		if(ticket == 1) {//티켓이 있다면 환영해라.
			System.out.println("놀이동산에 오신 것을 환영합니다.");
		} else {
			System.out.println("매표소를 안내한다.");
		}
		
	}//main

}//class
