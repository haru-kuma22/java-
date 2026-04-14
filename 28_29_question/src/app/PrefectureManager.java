package app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import data.Prefecture;

public class PrefectureManager {
    public static void main(String[] args) {
        // マスターデータの準備（配列）
        String[] rawData = {
            "北海道:札幌市:83424", "青森県:青森市:9646", "岩手県:盛岡市:15275",
            "宮城県:仙台市:7282", "秋田県:秋田市:11638", "山形県:山形市:9323",
            "福島県:福島市:13784", "茨城県:水戸市:6097", "栃木県:宇都宮市:6408",
            "群馬県:前橋市:6362", "埼玉県:さいたま市:3798"
        };

        Scanner sc = new Scanner(System.in);

        try {
            // 1. 数字の入力
            System.out.println("表示したい番号をカンマ区切りで入力してください（例: 8,5,9）");
            String[] targetIndexes = sc.nextLine().split(",");

            // 2. 昇順・降順の入力
            System.out.println("ソート順を入力してください（1:昇順 / 2:降順）");
            int sortOrder = Integer.parseInt(sc.nextLine());

            // 3. 該当データの抽出
            List<Prefecture> selectedList = new ArrayList<>();
            for (String idxStr : targetIndexes) {
                int index = Integer.parseInt(idxStr.trim());
                if (index >= 0 && index < rawData.length) {
                    String[] parts = rawData[index].split(":");
                    selectedList.add(new Prefecture(parts[0], parts[1], Double.parseDouble(parts[2])));
                }
            }

            // 4. ソート処理（面積でソート）
            if (sortOrder == 1) {
                // 昇順（面積が小さい順）
                selectedList.sort(Comparator.comparingDouble(Prefecture::getArea));
            } else if (sortOrder == 2) {
                // 降順（面積が大きい順）
                selectedList.sort(Comparator.comparingDouble(Prefecture::getArea).reversed());
            }

            // 5. 結果出力
            System.out.println("\n--- 出力結果 ---");
            for (Prefecture pref : selectedList) {
                pref.printInfo();
            }

        } catch (Exception e) {
            System.out.println("エラーが発生しました。入力形式を確認してください。");
        } finally {
            sc.close();
        }
    }
}