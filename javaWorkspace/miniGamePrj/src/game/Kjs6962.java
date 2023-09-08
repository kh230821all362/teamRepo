package game;

import java.util.Scanner;

public class Kjs6962 {
	
	public void gameStart() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kjs의 게임");
		System.out.println("====업다운 게임====");
		int comNum = (int)(Math.random() * 100 + 1);
		
		while(true) {
			System.out.println("1~100까지 의 숫자입니다."); 
			System.out.println("숫자를 입력하세요"); 
			int userNum = scanner.nextInt();
			if(userNum < comNum) {
				System.out.println("UP!");
			}else if(userNum > comNum) {
				System.out.println("DOWN!");
			}else if(userNum == comNum) {
				System.out.println("정답!");
				System.out.println("컴퓨터 번호 : " + comNum);
				break;
			}
		}
	}

}
