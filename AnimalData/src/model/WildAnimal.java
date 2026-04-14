package model;

public class WildAnimal extends Animal {
    private String scientificName;

    public WildAnimal(String name, double length, int speed) {
        super(name, length, speed); // 親のコンストラクタを呼び出し
        this.scientificName = determineScientificName(name);
    }

    // 名前から学名を自動判定するロジック（カプセル化のため内部メソッド化）
    private String determineScientificName(String name) {
        switch (name) {
            case "ライオン": return "パンテラ レオ";
            case "ゾウ": return "ロキソドンタ・サイクロティス";
            case "パンダ": return "アイルロポダ・メラノレウカ";
            case "チンパンジー": return "パン・トゥログロディテス";
            case "シマウマ": return "チャップマンシマウマ";
            case "インコ": return "不明";
            default: return "未登録";
        }
    }

    // getter/setter
    public String getScientificName() { return scientificName; }
    public void setScientificName(String scientificName) { this.scientificName = scientificName; }

    // 詳細表示用メソッド
    public void printInfo() {
        System.out.println("動物名：" + getName());
        System.out.println("体長：" + getLength() + "m");
        System.out.println("速度：" + getSpeed() + "km/h");
        System.out.println("学名：" + getScientificName());
        System.out.println();
    }
}