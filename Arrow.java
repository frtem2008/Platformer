import java.util.Arrays;

public class Arrow {
    private int arrowX = 0;
    private int arrowY = 0;
    private int defaultX, defaultY;
    private int length = 100;
    private int width = 50;

    public Arrow(int x, int y, int Length, int Width) {
        arrowX = x;
        arrowY = y;
        defaultX = x;
        defaultY = y;
        length = Length;
        width = Width;
    }

    public static void respawn(Arrow[] arrows){
        for (int i = 0; i < arrows.length; i++) {
            Arrow arrow = arrows[i];
            arrow.setArrowX(arrow.defaultX);
            arrow.setArrowY(arrow.defaultY);
        }
    }

    public void setArrowX(int arrowX) {
        this.arrowX = arrowX;
    }

    public void setArrowY(int arrowY) {
        this.arrowY = arrowY;
    }

    public static void moveArrows(Arrow arrow, double speed, double gravitation) {
        arrow.plusarrowY(-gravitation);
        arrow.plusarrowX(-speed);
    }

    public static boolean collides(Player player, Arrow[] arrows) {
        int a = 0;
        for (int i = 0; i < arrows.length; i++) {
            Arrow arrow = arrows[i];
            double x0 = player.getX();
            double y0 = player.getY();
            double x1 = player.getX() + player.getSize();
            double y1 = player.getY() + player.getSize();

            double x2 = arrow.arrowX;
            double y2 = arrow.arrowY;
            double x3 = x2 + arrow.length;
            double y3 = y2 + arrow.width;


            if (x0 > x3 || /* первый правее второго */
                    x1 < x2 || /* первый левее второго */
                    y0 > y3 || /* первый ниже второго */
                    y1 < y2/* первый выше второго */
            ) {
                // не пересекаются
            } else {
                a++;
            }
        }

        return a > 0;
    }


    public int getWidth() {
        return width;
    }

    public int getArrowX() {
        return arrowX;
    }

    public int getArrowY() {
        return arrowY;
    }

    public void plusarrowX(double a) {
        this.arrowX += a;
    }

    public void plusarrowY(double a) {
        this.arrowY += a;
    }

    public int getLength() {
        return length;
    }
}
