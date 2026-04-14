package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Process {
    // フィールド変数の定義
    private String greeting;
    private String location;
    private String food;
    private String impression;
    private String category;

    // コンストラクタ（thisを使用）
    public Process() {
        this.greeting = "こんにちは！";
        this.location = "日本";
        this.food = "寿司";
        this.impression = "うまい";
        this.category = "和食";
    }

    // 出力用メソッド
    public void displayInformation() {
        System.out.println(this.greeting + "ここは" + this.location + "です！");
        System.out.println("この" + this.food + "は" + this.impression);
        System.out.println(this.food + "は" + this.category + "です");

        // 現在日時の取得とフォーマット
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("今の現在日時は" + now.format(dtf) + "です");
    }
}