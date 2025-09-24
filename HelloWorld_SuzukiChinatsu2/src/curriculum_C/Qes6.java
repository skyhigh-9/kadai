package curriculum_C;

import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		
		
		//各クラスからメソッドの呼び出し
		Systems systems = new Systems();
		Player player = new Player();
		Cpu cpu = new Cpu();

		//Playerが勝つまでの繰り返しwhile文
		while (true) {
			
			Scanner scanner = new Scanner(System.in);

			System.out.println("グー(0), チョキ(1), パー(2) を入力:");
			int hand = scanner.nextInt(3);

			int cpuHand = cpu.getCpu();
			int playerHand = player.player();
			

			
			if (playerHand == 0 || playerHand == 1 || playerHand == 2) {


			System.out.println("あなたの手:" + Systems.systemsHands(playerHand));
			System.out.println("CPUの手:" + Systems.systemsHands(cpuHand));


				//条件ごとに判定するためのif文
				if ((playerHand == 0 && cpuHand == 0) || (playerHand == 1 && cpuHand == 1)
						|| (playerHand == 2 && cpuHand == 2)) {
					System.out.println("あいこです！もう一度！");
				} else if ((playerHand == 0 && cpuHand == 1) || (playerHand == 1 && cpuHand == 2)
						|| (playerHand == 2 && cpuHand == 0)) {
					System.out.println("あなたの負け！もう一度！");
				} else {
					System.out.println("あなたの勝ち！");
					break;
				}
			} else {
				System.out.println("無効な入力です。0～2の数字を入力してください"); 
			}
		}
	}
}
