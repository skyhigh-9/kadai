package curriculum_C;

import java.util.Scanner;

public class Player {
	 
	private Scanner scanner;

    public Player(Scanner scanner) {
        this.scanner = scanner;
    }


	// プレイヤーの手を入力
    public int getHand() {
        while (true) {
     
            if (scanner.hasNextInt()) {
                int hand = scanner.nextInt();
                if (hand >= 0 && hand <= 2) {
                    return hand;
                }
            } else {
                scanner.next(); // 数字以外の入力をスキップ
            }
            System.out.println("無効な入力です。0〜2の数字を入力してください。");
        }
    }

	
}
