package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String name = "";
        
        // ユーザー名入力の再入力ループ
        while (true) {
            System.out.print("ユーザー名を入力してください: ");
            name = sc.nextLine();

            if (name == null || name.isEmpty()) {
                System.out.println("名前を入力してください");
            } else if (name.length() > 10) {
                System.out.println("名前を10文字以内にしてください");
            } else if (!name.matches("^[a-zA-Z0-9]+$")) {
                System.out.println("半角英数字のみで名前を入力してください");
            } else {
                // すべての条件を満たした場合のみループを抜ける
                System.out.println("ユーザー名「 " + name + " 」を登録しました");
                break;
            }
        }

        // じゃんけんシステム
        int count = 0;
        boolean win = false;
        String[] hands = {"グー", "チョキ", "パー"};

        while (!win) {
            System.out.print("0はグー、1：チョキ、2：パー ＞ ");
            int myHand = sc.nextInt();

            if (myHand < 0 || myHand > 2) {
                System.out.println("0〜2の数字を入力してください。");
                continue; 
            }

            count++;
            int comHand = rand.nextInt(3);

            System.out.println("自分：" + hands[myHand] + " / 相手：" + hands[comHand]);

            if (myHand == comHand) {
                System.out.println("あいこです。");
            } else if ((myHand == 0 && comHand == 1) || (myHand == 1 && comHand == 2) || (myHand == 2 && comHand == 0)) {
                System.out.println("じゃんけんに勝ちました！");
                win = true;
            } else {
                System.out.println("自分がじゃんけんで" + hands[comHand] + "に負けました。");
            }
        }
        System.out.println("じゃんけんを行った回数：" + count + "回");
        sc.close();
    }
}