package curriculum_B;
import java.util.Scanner;
import java.util.Random;

public class Qes1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("ユーザー名を入力してください: ");
        String name = sc.nextLine();

        // 1 & 2. 入力チェック
        if (name == null || name.isEmpty()) {
            System.out.println("名前を入力してください");
        } else if (name.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
        } else if (!name.matches("^[a-zA-Z0-9]+$")) {
            System.out.println("半角英数字のみで名前を入力してください");
        } else {
            System.out.println("ユーザー名「 " + name + " 」を登録しました");
            
            // 3. じゃんけんシステム起動
            int count = 0;
            boolean win = false;
            String[] hands = {"グー", "チョキ", "パー"};

            while (!win) {
                count++;
                System.out.print("0はグー、1：チョキ、2：パー ＞ ");
                int myHand = sc.nextInt();
                int comHand = rand.nextInt(3);

                System.out.println("自分：" + hands[myHand] + " / 相手：" + hands[comHand]);

                if (myHand == comHand) {
                    System.out.println("あいこです。");
                } else if ((myHand == 0 && comHand == 1) || (myHand == 1 && comHand == 2) || (myHand == 2 && comHand == 0)) {
                    System.out.println("じゃんけんに勝ちました！");
                    win = true;
                } else {
                    // 負けパターンの個別出力
                    System.out.println("自分がじゃんけんで" + hands[comHand] + "に負けました。");
                }
            }
            System.out.println("じゃんけんを行った回数：" + count + "回");
        }
    }
}