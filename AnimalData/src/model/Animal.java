package model;

public class Animal {
    private String name;
    private double length;
    private int speed;

    // コンストラクタ
    public Animal(String name, double length, int speed) {
        this.name = name;
        this.length = length;
        this.speed = speed;
    }

    // Getter/Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getLength() { return length; }
    public void setLength(double length) { this.length = length; }

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }
}