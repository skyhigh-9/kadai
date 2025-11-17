package curriculum_D;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Daemon extends Character {

	public Daemon(String name, int hp, int at, int sp) {
		super(name, hp, at, sp);
	}

	//Daemonのステータスをファイルから読み込み
	public static Daemon loadDaemon() {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\curriculum7\\daemon_status.txt"))) {
			String name = br.readLine();
			int hp = Integer.parseInt(br.readLine());
			int at = Integer.parseInt(br.readLine());
			int sp = Integer.parseInt(br.readLine());

			return new Daemon(name, hp, at, sp);

		} catch (IOException e) {
			System.out.println("ファイル読み込みに失敗しました: " + e.getMessage());
			return new Daemon("Daemon", 85, 12, 6); // デフォルト値
		}
	}
}
