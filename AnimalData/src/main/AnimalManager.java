package main;

import java.util.Scanner;

import model.WildAnimal;

public class AnimalManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { // 正しい入力があるまで繰り返す
            System.out.println("コンソールに文字を入力してください");
            String input = sc.nextLine();

            try {
                // 入力が空でないかチェック
                if (input == null || input.isEmpty()) {
                    throw new Exception("入力が空です。");
                }

                String[] animalDataArray = input.split(",");

                for (String data : animalDataArray) {
                    String[] elements = data.split(":");
                    
                    // 要素数が足りない場合のチェック
                    if (elements.length < 3) {
                        throw new Exception("フォーマットが不正です。コロン(:)で区切られた3つの要素が必要です。");
                    }

                    String name = elements[0];
                    double length = Double.parseDouble(elements[1]);
                    int speed = Integer.parseInt(elements[2]);

                    // インスタンス生成と出力
                    WildAnimal animal = new WildAnimal(name, length, speed);
                    animal.printInfo();
                }

                // すべての処理が正常に終わればループを抜ける
                break;

            } catch (NumberFormatException e) {
                System.out.println("【エラー】体長または速度には数値を入力してください。");
                System.out.println("--------------------------------------------------");
            } catch (Exception e) {
                System.out.println("【エラー】" + e.getMessage());
                System.out.println("--------------------------------------------------");
            }
        }

        System.out.println("プログラムを終了します。");
        sc.close();
    }
}