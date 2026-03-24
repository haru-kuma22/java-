package curriculum_A;


public class Qes1_13java {


    public static void runAllAssignments() {
        
        // --- 1. 初期課題（基本データ型の宣言・計算・出力） ---
        
        // ローカル変数の宣言のみ
        byte byteVar;
        short shortVar;
        int intVar;
        long longVar;
        float floatVar;
        double doubleVar;
        char charVar;
        String stringVar;
        boolean booleanVar;
        
        // ローカル変数の初期化（初期値の代入）
        byteVar = 0;
        shortVar = 0;
        intVar = 0;
        longVar = 0L; 
        floatVar = 0.0f;
        doubleVar = 0.0;
        charVar = '\u0000'; // char型の初期値（ヌル文字）
        stringVar = null;   // String型の初期値
        booleanVar = false;
        
        // 課題で指定された値の代入
        byteVar = 10;
        shortVar = 100;
        intVar = 1000;
        longVar = 10000L; 
        floatVar = 9.5f;
        doubleVar = 10.5;
        charVar = 'a';
        stringVar = "ハロー";
        booleanVar = true;
        
        // 変数を使った計算結果の準備
        long sumOfIntegers = (long)byteVar + shortVar + intVar + longVar;
        // 数字を全て足す (11110 + 9.5 + 10.5 = 11130)
        long sumAll = (long)Math.round(byteVar + shortVar + intVar + longVar + floatVar + doubleVar);
        // 小数点以外の数字を全てかける
        long product = (long)byteVar * shortVar * intVar * longVar;
        // 10.5割る100をする
        double divisionResult = doubleVar / 100.0;
        // 10引く100をする
        int subtractionResult = byteVar - shortVar;

        String output = 
            // 1行目: 11110
            sumOfIntegers + "\n" +
            // 2行目: 20
            (byteVar * 2) + "\n" +
            // 3行目: a ハロー true
            charVar + " " + stringVar + " " + booleanVar + "\n" +
            // 4行目: 11130
            sumAll + "\n" +
            // 5行目: 10000000000
            product + "\n" +
            // 6行目: 0.105
            divisionResult + "\n" +
            // 7行目: -90
            subtractionResult;

        System.out.println(output);

        System.out.println(); 
        
        
        // 変数の宣言と初期化
        int numInt = 20;
        int num1 = 23;
        
        // "ハローJAVA43"と表示させる
        System.out.println("ハローJAVA" + (numInt + num1));

        System.out.println(); // 改行

        // --- 3. 山田太郎の自己紹介とBMI計算 ---
        
        // 変数の宣言と初期化
        String name = "山田太郎";
        int age = 18;
        double height = 170.5;
        double weight = 62.2;
        String favoriteFood = "寿司";

        // 自己紹介を出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長は" + height + "cmです");
        System.out.println("体重は" + weight + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");

        // BMIの計算と出力
        double heightM = height / 100.0; 
        double bmi = weight / (heightM * heightM);
        System.out.println("BMIは" + String.format("%.2f", bmi) + "です");

        System.out.println(); // 改行

        // --- 4. 鈴木一郎への変数更新（自己代入） ---
        
        // 変数【年齢・身長・体重】の数値を和算で自己代入し、更新
        age += 30;
        height += 166.5;
        weight += 66.2;
        
        // 他の変数を更新
        name = "鈴木一郎";
        favoriteFood = "オムライス";

        // 更新された情報に基づいてBMIを再計算
        heightM = height / 100.0;
        double newBmi = weight / (heightM * heightM);
        
        // 更新された自己紹介を出力
        System.out.println("初めまして" + name + "です");
        System.out.println("年齢は" + age + "歳です");
        System.out.println("身長" + String.format("%.1f", height) + "cmです");
        System.out.println("体重は" + String.format("%.1f", weight) + "kgです");
        System.out.println("好きな食べ物は" + favoriteFood + "です");
        System.out.println("BMIは" + String.format("%.2f", newBmi) + "です");

        System.out.println(); // 改行

        // --- 5. 年齢が25歳以上か判定（if文不使用） ---
        
        // age (48) が25歳以上か判定し、結果のbooleanを直接出力
        System.out.println(age >= 25);

        System.out.println(); // 改行

        // --- 6. 型変換（キャスト） ---
        
        // 年齢・身長を整数型に変換して出力
        int ageInt = (int)age;
        int heightInt = (int)height;
        
        System.out.println(ageInt);
        System.out.println(heightInt);

        System.out.println(); // 改行

        // --- 7. 論理和（OR）による条件判定 ---
        
        // 条件：年齢が25 もしくは 身長が160以上
        boolean resultOR = (ageInt == 25) || (heightInt >= 160); 
        
        System.out.println(resultOR);
    }
}