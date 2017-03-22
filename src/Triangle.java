/**
 * Created by asus on 22.03.17.
 */
public class Triangle extends Shape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int aLen;
    private int bLen;
    private int cLen;
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this(x1, y1, x2, y2, x3, y3, false);
    }
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, boolean lazyload) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        if (!lazyload) {

            // @todo: вывести в отдельный метод, находящий длину отрезка по координатам двух точек
            this.aLen = (int)Math.sqrt((this.x1-this.x2)*(this.x1-this.x2)+(this.y1-this.y2)*(this.y1-this.y2));
            this.bLen = (int)Math.sqrt((this.x1-this.x3)*(this.x1-this.x3)+(this.y1-this.y3)*(this.y1-this.y3));
            this.cLen = (int)Math.sqrt((this.x2-this.x3)*(this.x2-this.x3)+(this.y2-this.y3)*(this.y2-this.y3));

            this.perimeter = this.aLen + this.bLen + this.cLen;

            // полупериметр нужен для определения площади
            double p = (this.aLen + this.bLen + this.cLen)/2;
            this.area = Math.sqrt(p * (p - this.aLen) * (p - this.bLen) * (p - this.cLen));
        }
    }

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getX3() {
        return x3;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public int getY3() {
        return y3;
    }

    public int getaLen() {
        return aLen;
    }

    public int getbLen() {
        return bLen;
    }

    public int getcLen() {
        return cLen;
    }
}
