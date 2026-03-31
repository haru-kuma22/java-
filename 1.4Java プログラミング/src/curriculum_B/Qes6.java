package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // テレビとディスプレイの共通基準となるランダム値をあらかじめ生成（0〜11）
        int baseStock = rand.nextInt(12);

        System.out.println("商品名を「、」区切りで入力してください：");
        String input = sc.nextLine();
        
        // 「、」で分割して配列に格納
        String[] items = input.split("、");

        // 拡張for文を使用
        for (String item : items) {
            // その他の商品用のランダム値
            int r = rand.nextInt(12); 
            
            // Switch文を使用（if文は使用不可）
            switch (item) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    System.out.println(item + "の残り台数は" + r + "台です");
                    System.out.println();
                    break;

                // テレビとディスプレイは続けて書く（フォールスルー）
                case "テレビ":
                case "ディスプレイ":
                    // 条件演算子（三項演算子）を使用
                    // ディスプレイの場合は 11 - baseStock、それ以外（テレビ）は baseStock
                    int stock = item.equals("ディスプレイ") ? (11 - baseStock) : baseStock;
                    
                    System.out.println(item + "の残り台数は" + stock + "台です");
                    System.out.println();
                    break;

                default:
                    System.out.println("『 " + item + " 』は指定の商品ではありません");
                    System.out.println();
                    break;
            }
        }
        sc.close();
    }
}