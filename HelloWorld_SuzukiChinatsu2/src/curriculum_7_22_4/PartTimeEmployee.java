package curriculum_7_22_4;

public class PartTimeEmployee extends Employee {
	public PartTimeEmployee(String id, String name) {
		super(id, name);
		
	}

	private static final int HOURLY_RATE = 1000;

	public int calculateDailyWage(int hoursWorked) {
		return hoursWorked * HOURLY_RATE;
	}
}

