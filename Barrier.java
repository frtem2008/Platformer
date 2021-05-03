public class Barrier {
    private final double x;
    private final double y1;
    private final double y2;

    public Barrier(double x, double y1, double y2) {
        this.x = x;
        this.y1 = y1;
        this.y2 = y2;
    }

    public static int Collides(Player player, Barrier[] barriers) {
        int b = -1;
        for (int i = 0; i < barriers.length; i++) {
            Barrier barrier = barriers[i];
            double x0 = player.getX();
            double y0 = player.getY();
            double x1 = player.getX() + player.getSize();
            double y1 = player.getY() + player.getSize();

            double x2 = barrier.getX();
            double y2 = barrier.getY1();
            double x3 = barrier.getX();
            double y3 = barrier.getY2();


            if (x0 > x3 ||
                    x1 < x2 ||
                    y0 > y3 ||
                    y1 < y2
            ) {
                // не пересекаются
            } else {
                b = i;
            }
        }
        return b;
    }

    public double getY1() {
        return y1;
    }


    public double getY2() {
        return y2;
    }


    public double getX() {
        return x;
    }


}
