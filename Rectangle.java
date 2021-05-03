public class Rectangle {
    double x;
    double y;
    double w;
    double h;

    public boolean overlaps(Rectangle other){
        if (Math.abs(x/2 - other.x/2) > w / 2 + other.w / 2) return false;
        if (Math.abs(y/2 - other.y/2) > h / 2 + other.h / 2) return false;
        return true;
    }

    public Rectangle(double x, double y, double w, double h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
}
