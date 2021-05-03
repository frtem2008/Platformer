public class MovingPlatform {
    public Platform platform;
    public int x, x1, x2, speed;
    public boolean direction;

    public MovingPlatform(Platform platform, int x1, int x2, int speed, boolean direction) {
        this.platform = platform;
        this.x1 = x1;
        this.x2 = x2;
        this.speed = speed;
        this.direction = direction;
    }

   /* public static void move(MovingPlatform[] movingPlatforms) {
        if (collides(Main.player, movingPlatforms)) {
            System.out.println("1111111");
            Platform.movePlatforms(Main.platforms, movingPlatforms[Collides(Main.player, movingPlatforms)].speed, Player.getGravitation());
        } else {
            for (int i = 0; i < movingPlatforms.length; i++) {
                MovingPlatform p = movingPlatforms[i];
                Platform[] P = {p.getPlatform()};
                Platform.movePlatforms(P, Player.getSpeed(), Player.getGravitation());
                if (-1 < p.x && p.x <= p.getMovingPlatformX2() - p.getMovingPlatformX1() + 1) {
                    if (p.x == 0) {
                        p.direction = true;
                    }
                    if (p.x == p.getMovingPlatformX2() - p.getMovingPlatformX1()) {
                        p.direction = false;
                    }
                    if (p.direction) {
                        p.getPlatform().plusPlatformX(p.getMovingPlatformSpeed());
                        p.x += p.speed;
                    } else {
                        p.getPlatform().plusPlatformX(-p.getMovingPlatformSpeed());
                        p.x -= p.speed;
                    }
                }
            }
        }
    }*/

    public static int Collides(Player player, MovingPlatform[] platforms) {
        /*for (int i = 0; i < platforms.length; i++) {
            MovingPlatform platform = platforms[i];
            double aX = player.getX() + player.getSize() / 2;
            double aY = player.getY() + player.getSize();
            double x1 = platform.getPlatform().getPlatformX();
            double y1 = platform.getPlatform().getPlatformY();
            double x2 = x1 + platform.getPlatform().getLength();
            double y2 = y1 + platform.getPlatform().getWidth();
            if (x1 < aX && aX < x2 && y1 < aY && aY < y2) {
                return i;
            }
        }*/

        return -1;
    }

    public static boolean collides(Player player, MovingPlatform[] platforms) {
        int a = 0;
        /*for (int i = 0; i < platforms.length; i++) {
            MovingPlatform platform = platforms[i];
            double aX = player.getX() + player.getSize() / 2;
            double aY = player.getY() + player.getSize();
            double x1 = platform.getPlatform().getPlatformX();
            double y1 = platform.getPlatform().getPlatformY();
            double x2 = x1 + platform.getPlatform().getLength();
            double y2 = y1 + platform.getPlatform().getWidth();
            if (x1 < aX && aX < x2 && y1 < aY && aY < y2) {
                a++;
            }
        }*/
        return a > 0;
    }

    public Platform getPlatform() {
        return platform;
    }

    public int getMovingPlatformX1() {
        return x1;
    }

    public int getMovingPlatformX2() {
        return x2;
    }

    public int getMovingPlatformSpeed() {
        return speed;
    }

}
