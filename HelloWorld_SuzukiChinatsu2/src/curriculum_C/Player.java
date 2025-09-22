package curriculum_C;

import java.util.Scanner;

public class Player {

	//Playerメソッド
	public int player() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("グー(0), チョキ(1), パー(2) を入力:");
		
		//Playerの手を入力
		int hand = scanner.nextInt();
		
		return hand;
	}

}
