package curriculum_7_22_4;

public class Main {
	public static void main(String[] args) {

		String id = null;
		String name = null;
		FullTimeEmployee ye = new FullTimeEmployee(id, name);
		PartTimeEmployee ye1 = new PartTimeEmployee(id, name);

		System.out.println("正社員の給与: " + ye.calculateDailyWage(9) + "円");
		System.out.println("パート社員の給与: " + ye1.calculateDailyWage(9) + "円");

	}
}
