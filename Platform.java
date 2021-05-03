public class Platform {
    private final int defaultX;
    private final int defaultY;
    private double platformX = 0;
    private double platformY = 0;
    private int length = 100;
    private int width = 50;
    private Rectangle r;
    private boolean isSpawnpoint = false;

    public Platform(int x, int y, int Length, int Width) {
        platformX = x;
        platformY = y;
        defaultX = x;
        defaultY = y;
        length = Length;
        width = Width;
        r = new Rectangle(x, y, Length, Width);
    }

    public Platform(int x, int y, int Length, int Width, boolean isSpawnpoint ) {
        platformX = x;
        platformY = y;
        defaultX = x;
        defaultY = y;
        length = Length;
        width = Width;
        r = new Rectangle(x, y, Length, Width);
        this.isSpawnpoint = isSpawnpoint;
    }

    public boolean isSpawnpoint() {
        return isSpawnpoint;
    }

    public static void respawn(Platform[] platforms) {
        for (int i = 0; i < platforms.length; i++) {
            Platform platform = platforms[i];
            platform.setPlatformX(platform.defaultX);
            platform.setPlatformY(platform.defaultY);
        }
    }

    public static void movePlatforms(Platform[] platforms) {
        for (int i = 0; i < platforms.length; i++) {
            Platform platform = platforms[i];
            platform.setPlatformX(Main.toScreenX(platform.defaultX));
            platform.setPlatformY(Main.toScreenY(platform.defaultY));
        }
    }

      public static int Collides(Player player, Platform[] platforms) {
        int b = -1;
        for (int i = 0; i < platforms.length; i++) {
            Platform platform = platforms[i];
            double x0 = player.getX();
            double y0 = player.getY();
            double x1 = player.getX() + player.getSize();
            double y1 = player.getY() + player.getSize();

            double x2 = platform.platformX;
            double y2 = platform.platformY;
            double x3 = platform.platformX + platform.length;
            double y3 = platform.platformY + platform.width;



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
/*
    public static boolean collides(Player player, Platform[] platforms){
        int a = Collides(player,platforms);
        if (a != -1){
            return player.getFakeY() < platforms[a].getPlatformY();
        }else {
            return false;
        }
    }*/

    public Rectangle getRect() {
        return r;
    }

    public double getHeight() {
        return r.h;
    }

    public double getPlatformX() {
        return r.x;
    }

    public void setPlatformX(double platformX) {
        r.x = platformX;
    }

    public double getPlatformY() {
        return r.y;
    }

    public void setPlatformY(double platformY) {
        r.y = platformY;
    }

    public double getWidth() {
        return r.w;
    }

}
