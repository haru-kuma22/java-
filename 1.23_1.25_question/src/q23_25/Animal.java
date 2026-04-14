package q23_25;

public class Animal {
    // フィールド（カプセル化のためprivateで宣言）
    private String name;
    private double length;
    private int speed;

    // nameのSetter
    public void setName(String name) {
        this.name = name; // フィールドと引数を区別するためにthisを使用
    }

    // nameのGetter
    public String getName() {
        return name;
    }

    // lengthのSetter
    public void setLength(double length) {
        this.length = length;
    }

    // lengthのGetter
    public double getLength() {
        return length;
    }

    // speedのSetter
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // speedのGetter
    public int getSpeed() {
        return speed;
    }
}