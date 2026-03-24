package person;

public class Person {

	// インスタンスフィールドを定義

	public String name;
	public int age;
	public double height;
	public double weight;
	public double bmi;
	public int print;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String string, int i, double d,double weight){
		this.name =string;
		this.age =i;
		this.height =d;
		this.weight =weight;
		print += 1;
	}
	
	// インスタンスメソッドを定義
	public double Bmi() {
	bmi=weight/(height*height);	
		return Math.floor(bmi);
	}
	
	public void Print() {
		System.out.println("名前は"+this.name+"です" );
	    System.out.println("年は"+this.age+"才です");
	    System.out.println("BMIは"+this.Bmi()+"です");
	    System.out.println("合計人数は"+print+"人です");
	}
}