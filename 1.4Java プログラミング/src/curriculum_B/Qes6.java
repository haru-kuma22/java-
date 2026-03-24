package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("商品名を「、」区切りで入力してください：");
        // 入力例：パソコン、冷蔵庫、テレビ、ディスプレイ、その他商品
        String input = sc.nextLine();
        
        // 「、」で分割して配列に格納
        String[] items = input.split("、");

        // 条件1：拡張for文を使用
        for (String item : items) {
            // 条件：残り台数は0〜11までのランダムな値
            int r = rand.nextInt(12); 
            
            // 条件2：Switch文を使用
            switch (item) {
                case "パソコン":
                case "冷蔵庫":
                case "扇風機":
                case "洗濯機":
                case "加湿器":
                    System.out.println(item + "の残り台数は" + r + "台です");
                    System.out.println(); // 出力例に合わせた空行
                    break;

                // 条件3：テレビとディスプレイは続けて書く（フォールスルー）
                case "テレビ":
                case "ディスプレイ":
                    // 条件4：条件演算子（三項演算子）を使用
                    // ディスプレイの場合は 11 - r、テレビの場合は r
                    int stock = item.equals("ディスプレイ") ? (11 - r) : r;
                    
                    System.out.println(item + "の残り台数は" + stock + "台です");
                    System.out.println();
                    break;

                default:
                    // 指定の商品以外の場合
                    System.out.println("『 " + item + " 』は指定の商品ではありません");
                    System.out.println();
                    break;
            }
        }
        sc.close();
    }
}