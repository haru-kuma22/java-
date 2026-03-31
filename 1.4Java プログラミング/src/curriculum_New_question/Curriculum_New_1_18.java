package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {

	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッド
	public static void printGreeting(String text, int version) {
		System.out.println("文字列と整数の結合出力");
		System.out.println(text + " " + version);
		System.out.println();
	}

	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッド
	public static void multiply(int num1, int num2) {
		System.out.println("整数の乗算結果");
		System.out.println(num1 + " × " + num2 + " = " + (num1 * num2));
		System.out.println();
	}

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッド
	public static void printArray(int[] array) {
		System.out.println("配列要素の順次出力");
		for (int i = 0; i < array.length; i++) {
			System.out.println("要素[" + i + "]: " + array[i]);
		}
		System.out.println();
	}

	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力
	public static void multiply(double num1, double num2) {
		System.out.println("小数の和算結果（オーバーロード）");
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println();
	}

	// Q5：1～100までのランダムな数字を引数の回数分格納・出力し、その配列を返すメソッド
	public static int[] createRandomArray(int count) {
		System.out.println("ランダム数値(1-100)の生成と格納");
		Random rand = new Random();
		int[] numbers = new int[count];
		
		for (int i = 0; i < count; i++) {
			int randomNum = rand.nextInt(100) + 1;
			numbers[i] = randomNum;
			System.out.println((i + 1) + "個目: " + numbers[i]);
		}
		System.out.println();
		return numbers;
	}

	// Q6：配列の要素の平均値をコンソールに出力するメソッド
	public static double printAverage(int[] array) {
		System.out.println("生成された配列の平均値算出");
		double sum = 0;
		for (int num : array) {
			sum += num;
		}
		double average = sum / array.length;
		System.out.println("平均値: " + average);
		System.out.println();
		return average;
	}

	// Q7：値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力するメソッド
	public static boolean checkResult(double value) {
		System.out.println("平均値が50以上かどうかの判定");
		boolean isOverFifty = value >= 50;
		System.out.println("判定結果: " + isOverFifty);
		System.out.println();
		return isOverFifty;
	}

	public static void main(String[] args) {
		// Q1 呼び出し
		printGreeting("Hello JavaSE", 11);

		// Q2 呼び出し
		multiply(5, 8);

		// Q3 呼び出し
		int[] sampleData = {10, 20, 30, 40};
		printArray(sampleData);

		// Q4 呼び出し
		multiply(10.5, 20.2);

		// Q5 呼び出し（10回分）
		int[] randomArray = createRandomArray(10);

		// Q6 呼び出し（Q5の結果を利用）
		double averageValue = printAverage(randomArray);

		// Q7 呼び出し（Q6の結果を利用）
		checkResult(averageValue);
	}
}