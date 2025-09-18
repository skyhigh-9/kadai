package curriculum_7_22_4;

abstract class Employee {
	//フィールドの生成
	String employeeId;
	String name;

	//コンストラクタ
	 Employee(String id, String name) {
		this.employeeId = id;
		this.name = name;

	}
	//getメソッド
	public String getEmployeeId() {
		return employeeId;
	}
	
	public String getName() {
		return name;
	}
	
	public  abstract  int calculateDailyWage(int hoursWorked);
}

