package curriculum_7_23;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	public static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}

	//bmiメソッドの定義BMIを返す
	public double bmi() {
		return Math.floor(weight / (height * height));
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + this.bmi() + "です");
	}

	public void getCount() {
		System.out.println("合計" + count + "人です");

	}
}
