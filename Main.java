import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.net.URL;

import static java.awt.Color.BLACK;
import static java.awt.Color.red;

public class Main {

    public static final int a = 10000;
    public static final int b = -10000;
    public static final Platform learn1 = new Platform(-2800 + b, 600 + a, 1200, 50);
    public static final Platform learn2 = new Platform(-1400 + b, 600 + a, 300, 50);
    public static final Platform learn3 = new Platform(-880 + b, 600 + a, 1400, 50);
    public static final Platform learn4 = new Platform(840 + b, 600 + a, 700, 50, true);
    public static final Platform learn5 = new Platform(1800 + b, 1000 + a, 700, 50);




    public static final Platform Platform1 = new Platform(-200, 600 + a, 800, 50);
    public static final Platform Platform2 = new Platform(200, 500 + a, 100, 50);
    public static final Platform Platform3 = new Platform(300, 400 + a, 100, 50);
    public static final Platform Platform4 = new Platform(400, 300 + a, 100, 50);
    public static final Platform Platform5 = new Platform(500, 200 + a, 100, 50);
    public static final Platform Platform6 = new Platform(600, 100 + a, 100, 50);
    public static final Platform Platform7 = new Platform(800, 100 + a, 100, 50);
    public static final Platform Platform8 = new Platform(1000, 50 + a, 100, 50);
    public static final Platform Platform9 = new Platform(1400, 300 + a, 400, 50);
    public static final Platform Platform10 = new Platform(2200, 600 + a, 250, 50, true);
    public static final Platform Platform11 = new Platform(2700, 600 + a, 100, 50);
    public static final Platform Platform12 = new Platform(3000, 480 + a, 100, 50);
    public static final Platform Platform13 = new Platform(3200, 380 + a, 100, 50);
    public static final Platform Platform14 = new Platform(3540, 400 + a, 160, 50);
    public static final Platform Platform15 = new Platform(3600, 180 + a, 100, 50);
    public static final Platform Platform16 = new Platform(3400, 120 + a, 100, 50);
    public static final Platform Platform17 = new Platform(3400, -100 + a, 300, 50);
    public static final Platform Platform18 = new Platform(4200, -100 + a, 300, 50);
    public static final Platform Platform19 = new Platform(3800, -760 + a, 480, 50);
    public static final Platform Platform20 = new Platform(2900, -400 + a, 300, 50, true);
    public static final Platform Platform21 = new Platform(2550, -500 + a, 150, 50);
    public static final Platform Platform22 = new Platform(2700, -1000 + a, 700, 50);
    public static final Platform Platform23 = new Platform(2550, -1600 + a, 700, 50);
    public static final Platform Platform24 = new Platform(1950, -1700 + a, 200, 50);
    //public static final Platform Platform25 = new Platform(1700, -1800 + a, 100, 50);
    public static final Platform Platform26 = new Platform(1200, -1800 + a, 400, 50);
    public static final Platform Platform27 = new Platform(1745, -1130 + a, 300, 50);
    public static final Platform Platform28 = new Platform(1445, -1130 + a, 150, 50);
    public static final Platform Platform29 = new Platform(1245, -1130 + a, 100, 50);
    public static final Platform Platform30 = new Platform(945, -1130 + a, 150, 50);

    public static final Platform Platform31 = new Platform(1050, -2800 + a, 600, 50, true);
    public static final Platform Platform32 = new Platform(1820, -2950 + a, 150, 50);
    public static final Platform Platform33 = new Platform(1970, -3100 + a, 150, 50);
    public static final Platform Platform34 = new Platform(2120, -3250 + a, 150, 50);
    public static final Platform Platform35 = new Platform(2260, -4100 + a, 150, 50);
    public static final Platform Platform36 = new Platform(2680, -3900 + a, 150, 50);
    public static final Platform Platform37 = new Platform(1840, -2500 + a, 560, 50, true);
    public static final Platform Platform38 = new Platform(2400, -3100 + a, 430, 50);
    public static final Platform Platform39 = new Platform(3140, -2940 + a, 250, 50);
    public static final Platform Platform40 = new Platform(3680, -2800 + a, 100, 50, true);
    public static final Platform Platform41 = new Platform(3910, -2700 + a, 100, 50);
    public static final Platform Platform42 = new Platform(4200, -2800 + a, 100, 50);
    public static final Platform Platform43 = new Platform(4450, -2900 + a, 100, 50);
    public static final Platform Platform44 = new Platform(4700, -3000 + a, 350, 50, true);
    public static final Platform Platform45 = new Platform(4800, -3680 + a, 120, 50, true);
    public static final Platform Platform46 = new Platform(4520, -3740 + a, 100, 50);
    public static final Platform Platform47 = new Platform(4240, -3870 + a, 100, 50);
    public static final Platform Platform48 = new Platform(3980, -3990 + a, 100, 50);
    public static final Platform Platform49 = new Platform(3650, -4100 + a, 250, 50, true);
    public static final Platform Platform50 = new Platform(2900, -4150 + a, 250, 50);
    public static final Platform Platform51 = new Platform(2650, -4250 + a, 100, 50);
    public static final Platform Platform52 = new Platform(2400, -4350 + a, 100, 50);
    public static final Platform Platform53 = new Platform(2150, -4450 + a, 100, 50, true);

    public static final Barrier barrier1 = new Barrier(-100, 300 + a, 600 + a);
    public static final Barrier barrier2 = new Barrier(3850, 50 + a, 450 + a);
    public static final Barrier barrier3 = new Barrier(3300, -200 + a, 200 + a);
    public static final Barrier barrier4 = new Barrier(4300, -800 + a, -250 + a);
    public static final Barrier barrier5 = new Barrier(4450, -1000 + a, -100 + a);
    public static final Barrier barrier6 = new Barrier(2500, -1100 + a, -500 + a);
    public static final Barrier barrier7 = new Barrier(2650, -1000 + a, -600 + a);
    public static final Barrier barrier8 = new Barrier(3400, -1700 + a, -1000 + a);
    public static final Barrier barrier9 = new Barrier(3250, -1600 + a, -1200 + a);
    public static final Barrier barrier10 = new Barrier(900, -3000 + a, -1075 + a);
    public static final Barrier blearn1  = new Barrier(180 + b, 300 + a, 500+ a);
    public static final Barrier barrier11 = new Barrier(1050, -2750 + a, -1350 + a);
    public static final Barrier barrier12 = new Barrier(2270, -4100 + a, -2600 + a);
    public static final Barrier barrier13 = new Barrier(2150, -4200 + a, -3450 + a);
    public static final Barrier barrier14 = new Barrier(1820, -2900 + a, -2650 + a);
    public static final Barrier barrier15 = new Barrier(2400, -3100 + a, -2500 + a);
    public static final Barrier barrier16 = new Barrier(3200, -4000 + a, -3000 + a);
    public static final Barrier barrier17 = new Barrier(4920, -3630 + a, -3150 + a);
    public static final Barrier barrier18 = new Barrier(5050, -3780 + a, -3000 + a);

    public static final Arrow Arrow1 = new Arrow(1400, 230 + a, 400, 50);
    public static final Arrow Arrow2 = new Arrow(3450, -150 + a, 250, 50);
    public static final Arrow Arrow3 = new Arrow(3800, -810 + a, 450, 50);
    public static final Arrow Arrow4 = new Arrow(2700, -1050 + a, 600, 50);
    public static final Arrow Arrow5 = new Arrow(2550, -1650 + a, 600, 50);
    public static final Arrow Arrow6 = new Arrow(3650, -4150 + a, 250, 50);

    public static final Platform[] platforms = {
            learn1,
            learn2,
            learn3,
            learn4,
            learn5,
            Platform1,
            Platform2,
            Platform3,
            Platform4,
            Platform5,
            Platform6,
            Platform7,
            Platform8,
            Platform9,
            Platform10,
            Platform11,
            Platform12,
            Platform13,
            Platform14,
            Platform15,
            Platform16,
            Platform17,
            Platform18,
            Platform19,
            Platform20,
            Platform21,
            Platform22,
            Platform23,
            Platform24,
            Platform26,
            Platform27,
            Platform28,
            Platform29,
            Platform30,

            Platform31,
            Platform32,
            Platform33,
            Platform34,
            Platform35,
            Platform36,
            Platform37,
            Platform38,
            Platform39,
            Platform40,
            Platform41,
            Platform42,
            Platform43,
            Platform44,
            Platform45,
            Platform46,
            Platform47,
            Platform48,
            Platform49,
            Platform50,
            Platform51,
            Platform52,
            Platform53,
    };

    public static final Barrier[] Barriers = {
            blearn1,
            barrier1,
            barrier2,
            barrier3,
            barrier4,
            barrier5,
            barrier6,
            barrier7,
            barrier8,
            barrier9,
            barrier10,
            barrier11,
            barrier12,
            barrier13,
            barrier14,
            barrier15,
            barrier16,
            barrier17,
            barrier18,
    };

    public static final Barrier[] platformBarriers = new Barrier[platforms.length * 2];

    public static final Arrow[] arrows = {
            Arrow1,
            Arrow2,
            Arrow3,
            Arrow4,
            Arrow5,
            Arrow6,
    };


    public static final MovingPlatform[] movingPlatforms = {};

    public static Player player = new Player();
    //Timer timer = new Timer(1000 / 60, this);
    JFrame frame;
    private Image platform, arrow, fon;

    public static double toScreenX(double x) {
        return Display.frame.getWidth() / 2 + (x - Main.player.getX());
    }

    public static double toScreenY(double y) {
        return Display.frame.getHeight() / 2 + (y - Main.player.getY());
    }

    public static void fillBarriers() {
        for (int i = 0; i < platformBarriers.length; i++) {
            if (i % 2 == 0) {
                Platform cur = platforms[i / 2];
                platformBarriers[i] = new Barrier(cur.getPlatformX(), cur.getPlatformY() + 10, cur.getPlatformY() + cur.getHeight() - 10);
            } else {
                Platform cur = platforms[(i - 1) / 2];
                platformBarriers[i] = new Barrier(cur.getPlatformX() + cur.getWidth(), cur.getPlatformY() + 10, cur.getPlatformY() + cur.getHeight() - 10);

            }
        }
    }

    //
    public void startDrawing(JFrame frame) throws InterruptedException {
        this.frame = frame;
        //timer.start();

        frame.createBufferStrategy(2);
        while (true) {
            long frameLength = 1000 / 60; //пытаемся работать из рассчета  60 кадров в секунду
            long start = System.currentTimeMillis();
            BufferStrategy bs = frame.getBufferStrategy();
            Graphics2D g = (Graphics2D) bs.getDrawGraphics();
            g.clearRect(0, 0, frame.getWidth(), frame.getHeight());
            draw(g);
            Player.keyboard.update();
            player.move();

            bs.show();
            g.dispose();

            long end = System.currentTimeMillis();
            long len = end - start;
            if (len < frameLength) {
                Thread.sleep(frameLength - len);
            }
            Keyboard keyboard = Player.keyboard;
            frame.addKeyListener(keyboard);
        }

    }

    public void draw(Graphics g) {

        loadImages();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                g.drawImage(fon, i * 1332, j * 850, null);
            }
        }
        for (int i = 0; i < Barriers.length; i++) {
            Barrier Barrier = Barriers[i];
            g.setColor(red);
            g.drawLine((int) toScreenX(Barrier.getX()), (int) toScreenY(Barrier.getY1()), (int) toScreenX(Barrier.getX()), (int) toScreenY(Barrier.getY2()));
        }

        for (int i = 0; i < platforms.length; i++) {
            Platform Platform1 = platforms[i];
            g.drawImage(platform, (int) toScreenX(Platform1.getPlatformX()), (int) toScreenY(Platform1.getPlatformY()), (int) Platform1.getWidth(), (int) Platform1.getHeight(), null);
        }

        for (int i = 0; i < arrows.length; i++) {
            Arrow arrow = arrows[i];
            g.drawImage(this.arrow, (int) toScreenX(arrow.getArrowX()), (int) toScreenY(arrow.getArrowY()), arrow.getLength(), arrow.getWidth(), null);
        }

        g.setColor(BLACK);

        g.fillOval((int) toScreenX(player.getX()), (int) toScreenY(player.getY()), (int) (player.getSize()), (int) (player.getSize()));

        g.setColor(red);
        g.setFont(new Font("bruh", Font.BOLD, 24));
        g.drawString(Player.ohh, (int) (player.getX()), (int) (player.getY() + player.getSize() + 10));
        double h = Player.fallingHeight;
        if (h <= 100) {
            g.setColor(new Color(0x207826));
        } else if (100 < h && h <= 400) {
            g.setColor(new Color(0xFFA822));
        } else if (h > 400) {
            g.setColor(red);
        }
        g.drawString(String.valueOf((int) Player.fallingHeight), 100, 100);
        g.setColor(red);
        g.drawString("Deaths: " + Player.deaths, 100, 150);
        g.setColor(new Color(0x307E7C));
        String[] chat = Player.chat;
        for (int i = 0; i < Player.chatLast; i++) {
            g.drawString(chat[i], 15, 350 + i * 50);
        }


        g.setColor(new Color(187, 136, 13, 255));
        g.drawString("To go left/right use a/d or left arrow/ right arrow", (int)toScreenX(-2850 + b), (int)toScreenY(400 + a));
        g.drawString("To jump use w/space/up arrow", (int)toScreenX(-2250 + b), (int)toScreenY(400 + a));
        g.drawString("Jump here", (int)toScreenX(-1695 + b), (int)toScreenY(540 + a));
        g.drawString("And here", (int)toScreenX(-1195 + b), (int)toScreenY(540 + a));
        g.drawString("This red line is a barrier", (int)toScreenX(-680 + b), (int)toScreenY(300 + a));
        g.drawString("You can't go through it", (int)toScreenX(-680 + b), (int)toScreenY(350 + a));
        g.drawString("but if you press left when you jump from the left side", (int)toScreenX(-880 + b), (int)toScreenY(400 + a));
        g.drawString("you can push off it", (int)toScreenX(-680 + b), (int)toScreenY(450 + a));
        g.drawString("Jump", (int)toScreenX(b), (int)toScreenY(540 + a));
        g.drawString("Press left", (int)toScreenX(75 + b), (int)toScreenY(428 + a));
        g.drawString("Go --->", (int)toScreenX(100 + b), (int)toScreenY(560 + a));
        g.drawString("Jump", (int)toScreenX(496 + b), (int)toScreenY(560 + a));
        g.drawString("You're on the edge of the platform", (int)toScreenX(560 + b), (int)toScreenY(400 + a));
        g.drawString("You can push off it as a barrier ", (int)toScreenX(560 + b), (int)toScreenY(450 + a));
        g.drawString("Now you can go!!!(just jump into the void) ", (int)toScreenX(1000 + b), (int)toScreenY(450 + a));

    }

    public void loadImages() {

        ImageIcon pl = createIcon("Images/Platform.png");
        ImageIcon fon = createIcon("Images/фон.jpg");
        ImageIcon ar = createIcon("Images/Arrow.png");
        ImageIcon Standing = new ImageIcon("Standing.png");
        ImageIcon R1 = new ImageIcon("r1.png");
        ImageIcon R2 = new ImageIcon("r2.png");
        ImageIcon R3 = new ImageIcon("r3.png");
        ImageIcon L1 = new ImageIcon("l1.png");
        ImageIcon L2 = new ImageIcon("l2.png");
        ImageIcon L3 = new ImageIcon("l3.png");
        platform = pl.getImage();
        arrow = ar.getImage();
        this.fon = fon.getImage();
    }
    protected static ImageIcon createIcon(String path) {
        URL imgURL = Main.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("File not found " + path);
            return null;
        }
    }
}
