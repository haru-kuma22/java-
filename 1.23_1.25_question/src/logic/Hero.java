package logic;

public class Hero extends Character {
    // コンストラクタ
    public Hero(String name, int hp, int mp, int attack, int speed, int defense) {
        // 親クラス（super）のコンストラクタを呼び出す
        super(name, hp, mp, attack, speed, defense);
    }

    // ステータスを表示するメソッド
    public void showStatus() {
        System.out.println("こんにちは 「 " + getName() + " 」 さん");
        System.out.println("ステータス");
        System.out.println("HP：" + getHp());
        System.out.println("MP：" + getMp());
        System.out.println("攻撃力：" + getAttack());
        System.out.println("素早さ：" + getSpeed());
        System.out.println("防御力：" + getDefense());
        System.out.println("\nさあ冒険に出かけよう！");
    }
}