package curriculum_7_22_4;

public class Main {
	public static void main(String[] args) {

		FullTimeEmployee ye = new FullTimeEmployee(null, null);
		PartTimeEmployee ye1 = new PartTimeEmployee(null, null);

		System.out.println("正社員の給与: " + ye.calculateDailyWage(9) + "円");
		System.out.println("パート社員の給与: " + ye1.calculateDailyWage(9) + "円");

	}
}
