package curriculum_B;

public class Qes5 {
    public static void main(String[] args) {
        // 外側のループ：掛ける数（1段から9段まで）
        for (int i = 1; i <= 9; i++) {
            
            // 内側のループ：1から10までの計算を横に並べる
            for (int j = 1; j <= 10; j++) {
                
                if (j == 10) {
                    // 10番目だけ特殊な形式「010 * 00」
                    System.out.printf("%03d * 00", j);
                } else {
                    // 通常の計算：001 * 001 = 001 の形式
                    System.out.printf("%03d * %03d = %03d", j, i, j * i);
                }
                
                // 10番目以外は、後ろに区切り文字「 || 」を付ける
                if (j < 10) {
                    System.out.print(" || ");
                }
            }
            
            // 10個の計算（1行分）が終わったら改行
            System.out.println();
        }
    }
}