package main;

import java.util.Random;
import java.util.Scanner;

import logic.Hero;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("名前を入力してください：");
        String inputName = sc.nextLine();

        // 毎回数値が変わるようにランダムな値を生成（例: 1〜1000の範囲）
        int hp = rand.nextInt(1000) + 1;
        int mp = rand.nextInt(1000) + 1;
        int atk = rand.nextInt(1000) + 1;
        int spd = rand.nextInt(1000) + 1;
        int def = rand.nextInt(1000) + 1;

        // サブクラスのインスタンス化（コンストラクタを使用）
        Hero hero = new Hero(inputName, hp, mp, atk, spd, def);

        // 表示処理
        hero.showStatus();

        sc.close();
    }
}