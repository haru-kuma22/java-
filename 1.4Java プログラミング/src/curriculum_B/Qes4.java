package curriculum_B;

public class Qes4 {
    public static void main(String[] args) {
        // 外側のループ：行（01から09まで）
        for (int i = 1; i <= 9; i++) {
            
            // 行の先頭部分： "01 = 011" の形式
            System.out.printf("%02d = %03d", i, i * 11);
            
            // 内側のループ：列（12から20まで）
            for (int j = 12; j <= 20; j++) {
                // 各項： " || 012 * 001 = 012" の形式
                // jは掛ける数（12〜20）、iは掛けられる数（1〜9）
                System.out.printf(" || %03d * %03d = %03d", j, i, j * i);
            }
            
            // 1行終わったら改行
            System.out.println();
        }
    }
}