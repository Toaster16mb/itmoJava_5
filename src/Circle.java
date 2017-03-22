/**
 * Created by asus on 22.03.17.
 */
public class Circle extends Shape {
    private int oX;
    private int oY;
    private int r;
    public Circle(int oX, int oY, int r) {
        this(oX, oY, r, false);
    }
    public Circle(int oX, int oY, int r, boolean lazyload) {
        this.oX = oX;
        this.oY = oY;
        this.r = r;
        if (!lazyload) {
            this.load();
        }
    }
    private void load() {
        this.perimeter = 2 * Math.PI * this.r;
        this.area = Math.PI * this.r * this.r;
    }

    public int getoX() {
        return oX;
    }

    public int getoY() {
        return oY;
    }

    public int getR() {
        return r;
    }
}
