package curriculum_D;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Random ran = new Random();

		System.out.println("Playerの名前を入力:");
		String text = scanner.next();

		int hp = ran.nextInt(50) + 50;
		int at = ran.nextInt(5) + 10;
		int sp = ran.nextInt(5) + 5;
		Character crt = new Character(text, hp, at, sp);

		//ファイルの呼び出し
		Daemon daemon = Daemon.loadDaemon();

		String logPath = "src/curriculum_D/battle_log.txt";

		try (FileWriter fw = new FileWriter(logPath)) {
			fw.write("=== Player vs Daemon バトル開始 ===\n");
			fw.write("プレイヤー: " + crt.getPlayerName() +
					" (HP:" + crt.getHp() + ", AT:" + crt.getAt() + ", SP:" + crt.getSp() + ")\n");
			fw.write("敵: " + daemon.getPlayerName() +
					" (HP:" + daemon.getHp() + ", AT:" + daemon.getAt() + ", SP:" + daemon.getSp() + ")\n\n");

			// 先攻決定
			Character first, second;
			if (crt.getSp() > daemon.getSp()) {
				first = crt;
				second = daemon;
			} else if (crt.getSp() < daemon.getSp()) {
				first = daemon;
				second = crt;
			} else {
				if (ran.nextBoolean()) {
					first = crt;
					second = daemon;
				} else {
					first = daemon;
					second = crt;
				}
			}
			fw.write("先攻は " + first.getPlayerName() + " です！\n\n");

			// バトルループ
			while (crt.getHp() > 0 && daemon.getHp() > 0) {
				attack(fw, first, second);
				if (second.getHp() <= 0)
					break;
				attack(fw, second, first);
			}

			// 結果
			fw.write("\n=== バトル結果 ===\n");
			if (crt.getHp() > 0)
				fw.write(crt.getPlayerName() + " の勝利！\n");
			else
				fw.write(daemon.getPlayerName() + " の勝利！\n");

			System.out.println("バトル結果を " + logPath + " に出力しました。");

		} catch (IOException e) {
			System.out.println("ログ出力に失敗しました: " + e.getMessage());
		}

		scanner.close();
	}

	// 攻撃処理
	private static void attack(FileWriter fw, Character attacker, Character defender) throws IOException {
		fw.write(attacker.getPlayerName() + " の攻撃！ → " +
				defender.getPlayerName() + " に " + attacker.getAt() + " ダメージ！\n");
		defender.damage(attacker.getAt());
		fw.write(defender.getPlayerName() + " の残りHP: " + defender.getHp() + "\n\n");
	}
}
