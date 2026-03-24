package curriculum_B;
import java.util.Scanner;

public class Qes7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAX_STUDENTS = 15;
        // 成績を保持する配列 [最大15人][4教科]
        int[][] scores = new int[MAX_STUDENTS][4];
        String[] subjects = {"英語", "数学", "理科", "社会"};
        
        int actualCount = 0; // 実際に何人入力されたか
        boolean isExit = false;

        System.out.println("生徒の成績を入力してください。");
        System.out.println("※途中で終了する場合は 'exit' と入力してください。");

        for (int i = 0; i < MAX_STUDENTS; i++) {
            System.out.println("\n--- " + (i + 1) + "人目の入力 ---");
            
            for (int j = 0; j < 4; j++) {
                System.out.print((i + 1) + "人目の『" + subjects[j] + "』の点数を入力してください : ");
                String input = sc.next();

                // exitチェック
                if (input.equalsIgnoreCase("exit")) {
                    isExit = true;
                    break; 
                }

                try {
                    scores[i][j] = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("無効な入力です。数値を入力するか 'exit' で終了してください。");
                    j--; // 同じ教科を再入力させる
                }
            }

            if (isExit) break; // 外側のループも抜ける
            actualCount++; // 全教科入力できた生徒だけカウント
        }

        // 1人も入力されていない場合のチェック
        if (actualCount < 1) {
            System.out.println("データが入力されませんでした。");
            return;
        }

        // --- 集計と出力 ---
        double totalAll = 0;
        double[] subTotals = new double[4];

        for (int i = 0; i < actualCount; i++) {
            double sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += scores[i][j];
                subTotals[j] += scores[i][j];
            }
            System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), (sum / 4.0));
            totalAll += sum;
        }

        for (int j = 0; j < 4; j++) {
            System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], (subTotals[j] / actualCount));
        }

        System.out.printf("全体の平均点は%.2f点です。\n", (totalAll / (actualCount * 4.0)));
        
        sc.close();
    }
}