import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Player {
    private static final Platform[] platforms = Main.platforms;
    private static final MovingPlatform[] movingPlatforms = Main.movingPlatforms;
    private static final Barrier[] barriers = Main.Barriers;
    public static int deaths = 0;
    public static boolean godMode = false;
    public static Keyboard keyboard = new Keyboard();
    public static int maxSpeed = 5;
    public static double fallingHeight = 0;
    public static String ohh = "";
    public static double spawnX = -2745 + Main.b;
    public static double spawnY = 400 + Main.a;
    /*    public static double spawnX = 0;
    public static double spawnY = 400 + Main.a;*/
/*    public static double spawnX = 4780;
    public static double spawnY = -3740 + Main.a;*/
    /*    public static double spawnX = 3379;
        public static double spawnY = -260 + Main.a;*/
   /* public static double spawnX = 4200;
    public static double spawnY = -165 + Main.a;*//*
    public static double spawnX = 2630;
    public static double spawnY = -560 + Main.a;*/
   /* public static double spawnX = 2700;
    public static double spawnY = -1060 + Main.a;*/
    /*public static double spawnX = 1000;
    public static double spawnY = -1200 + Main.a;*/
  /*  public static double spawnX = 1350;
    public static double spawnY = -3000 + Main.a;*/
/* public static double spawnX = 3250;
    public static double spawnY = -3000 + Main.a*/;
    public static double x = spawnX;
    public static double y = spawnY;
    public static ArrayList<Double> spawnpointsX = new ArrayList<>();
    public static ArrayList<Double> spawnpointsY = new ArrayList<>();
    public static String[] chat = new String[10];
    public static int chatLast = 0;
    private static double size = 60;
    public static Rectangle rect = new Rectangle(x, y, size, size);
    private static double gravitation = 0;
    private static boolean jump = true;
    private static double speed = 0;
    private static double maxFallingHeight = 550;
    private static int frame = 1;
    private static boolean onBarrier = false;
    private static boolean fromRight = false;
    private static boolean fromLeft = false;
    private static boolean fromUp = false;
    private static boolean fromDown = false;

    public static void respawn() {
        speed = 0;
        gravitation = 0;
        fallingHeight = 0;
        x = spawnX;
        y = spawnY;
        maxFallingHeight = 510;
        maxSpeed = 5;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getSize() {
        return size;
    }

    public void move() {
        keyboard.update();

        if (chatLast >= chat.length) {
            for (int i = 1; i < chat.length; i++) {
                chat[i] = chat[i - 1];
            }
            chatLast = 0;
        }

        if (Platform.Collides(Main.player, platforms) == 4) {
            setSpawnpoint(0, 400 + Main.a);
            deaths = 0;
            chatLast = 1;
            Arrays.fill(chat, "");
            chat[0] = "[Debug] Cleared chat";
        }

        if (!godMode) {
            if (speed > 0) {
                fromRight = true;
                fromLeft = false;
            } else if (speed < 0) {
                fromLeft = true;
                fromRight = false;
            }
            if (gravitation > 0) {
                fromDown = false;
                fromUp = true;
            } else if (gravitation < 0) {
                fromUp = false;
                fromDown = true;
            }
            if (frame % 60 != 0) {
                frame++;
            } else {
                frame = 1;
            }

            if (Barrier.Collides(Main.player, barriers) != -1 || Barrier.Collides(Main.player, Main.platformBarriers) != -1) {
                onBarrier = true;
                speed = 0;
                fallingHeight = 0;
                if (fromRight) {
                    if (keyboard.getLeft() && !keyboard.getRight() && !keyboard.getUp()) {
                        jump = true;
                        speed = -5;
                        if (gravitation <= 7)
                            gravitation += -8;
                    }
                }
                if (fromLeft) {
                    if (!keyboard.getLeft() && keyboard.getRight() && !keyboard.getUp()) {
                        jump = true;
                        speed = 5;
                        gravitation += -8;
                    }
                }


            } else {
                onBarrier = false;
            }

            if (Platform.Collides(Main.player, platforms) != -1 && Platform.Collides(Main.player, platforms) != 4 || MovingPlatform.collides(Main.player, movingPlatforms)) {
                if (fallingHeight > maxFallingHeight) {
                    System.out.println("Вы упали с высоты " + (int) fallingHeight + " и разбились (максимальная высота: " + maxFallingHeight + ")");
                    chat[chatLast] = "Player fell from a high place!!!";
                    chatLast++;
                    respawn();
                    deaths++;
                }

                if (Platform.Collides(Main.player, platforms) != -1) {
                    Platform cur = platforms[Platform.Collides(Main.player, platforms)];
                    if (cur.isSpawnpoint()) {
                        setSpawnpoint(cur.getPlatformX() + cur.getWidth() / 2, cur.getPlatformY() - size - 50);
                    }
                   /* if (fromUp) {
                        if (cur.getPlatformY() >= y - Main.a + size) {
                            if (cur.getPlatformX() < x && x + size < cur.getPlatformX() + cur.getWidth()) {
                                jump = false;
                                fallingHeight = 0;
                                gravitation = 0;
                                if (Math.abs(y + size - cur.getPlatformY()) > 0) {
                                    System.out.println("down");
                                    y -= Math.abs(cur.getPlatformY() - y - size);
                                }
                            } else if (fromLeft) {
                                if (y + size / 2 < cur.getHeight()) {
                                    System.out.println("fromLeft Higher");
                                    x += cur.getPlatformX() - x;
                                    y -= cur.getPlatformY() - y - Main.a;
                                } else {
                                    *//*System.out.println("fromLeft deeper");
                                    speed = 0;
                                    fallingHeight = 0;
                                    y -= cur.getPlatformY() + y;*//*
                                }
                            }*//*else if (fromRight){
                                if (y + size / 2 < cur.getHeight()){
                                    x -= x - cur.getPlatformX();
                                    y -= y- Main.a -  cur.getPlatformY();
                                }else {
                                    speed = 0;
                                    fallingHeight = 0;
                                    gravitation = 0;
                                }
                            }*//*
                        }
                    }*/
                }
                //
                //
                jump = false;
                fallingHeight = 0;
                gravitation = 0;
                //
                //
                if (Barrier.Collides(Main.player, barriers) != -1) {
                    onBarrier = true;
                    speed = 0;
                    fallingHeight = 0;
                    if (fromRight) {
                        if (keyboard.getLeft()) {
                            x -= 10;
                        }
                    }
                    if (fromLeft) {
                        if (keyboard.getRight()) {
                            x += 10;
                        }
                    }
                } else if (Barrier.Collides(Main.player, Main.platformBarriers) != -1) {
                    onBarrier = true;
                    speed = 0;
                    fallingHeight = 0;
                    if (fromRight) {
                        /*if (keyboard.getShift()){
                            System.out.println((Barrier.Collides(Main.player, Main.platformBarriers) - 1) % 2);
                            y -= -Main.player.getY()  + platforms[(Barrier.Collides(Main.player, Main.platformBarriers) - 1) % 2].getPlatformY() + platforms[(Barrier.Collides(Main.player, Main.platformBarriers) - 1) % 2].getHeight();
                            x += Main.player.getSize();
                        }else*/
                        if (keyboard.getLeft() && !keyboard.getRight() && !keyboard.getUp()) {
                            jump = true;
                            speed = -5;
                            if (gravitation <= 7)
                                gravitation += -8;
                        }
                    }
                    if (fromLeft) {
                        /*if (keyboard.getShift()){
                            gravitation -= 1;
                            x -= Main.player.getSize();
                        }else*/
                        if (!keyboard.getLeft() && keyboard.getRight() && !keyboard.getUp()) {
                            jump = true;
                            speed = 5;
                            gravitation += -8;
                        }
                    }
                } else {
                    if (keyboard.getLeft() && !keyboard.getRight() && !jump) {
                        speed -= 2;
                    }
                    if (!keyboard.getLeft() && keyboard.getRight() && !jump) {
                        speed += 2;
                    }
                }
                if (!keyboard.getLeft() && !keyboard.getRight()) {
                    if (speed > 0)
                        speed -= 0.2;
                    else if (speed < 0) {
                        speed += 0.2;
                    }
                }
                if (keyboard.getShift() && gravitation < 10) {
                    fallingHeight /= 1.5;
                }
                if (fallingHeight > 501) {
                    System.out.println("Вы упали с высоты " + (int) fallingHeight + " и разбились (максимальная высота: " + maxFallingHeight + ")");
                    chat[chatLast] = "Player fell from a high place!!!";
                    chatLast++;
                    respawn();
                    deaths++;
                }
                if (Arrow.collides(Main.player, Main.arrows)) {
                    maxSpeed = 10;
                    maxFallingHeight = 800;
                } else {
                    if (maxSpeed > 5) {
                        maxSpeed -= 0.2;
                        maxFallingHeight = 501;
                    }
                }
                if (Math.abs(speed) > 0 && keyboard.getShift()) {
                    speed = 0;
                }
                if (Math.abs(speed) > 4) {
                    ohh = "";
                }
                if (100 <= fallingHeight && fallingHeight <= 200) {
                    ohh = "oh";
                }
                if (201 <= fallingHeight && fallingHeight <= 300) {
                    ohh = "ooh";
                }
                if (fallingHeight >= 301) {
                    ohh = "oooh";
                }

            } else {
                jump = true;
            }

            if (fallingHeight >= 1000) {
                System.out.println("Вы упали вниз");
                chat[chatLast] = "Player fell into the void!!!";
                chatLast++;
                respawn();
                deaths++;
            }

            if (keyboard.getUp() && !jump && !onBarrier) {
                jump = true;
                gravitation += -10;
            }
            if (speed > maxSpeed) {
                speed = maxSpeed;
            }
            if (speed < -maxSpeed) {
                speed = -maxSpeed;
            }


            if (!jump && !keyboard.getLeft() && !keyboard.getRight() && speed != 0) {
                if (speed > 0 && speed > 1) {
                    speed -= 0.2;
                } else if (speed > 0 && speed < 1) {
                    speed = 0;
                }
                if (speed < 0 && speed < -1) {
                    speed += 0.2;
                } else if (speed < 0 && speed > -1) {
                    speed = 0;
                }
            }

            if (keyboard.getQ()) {
                System.out.println("Выход");
                System.exit(20);
            }
            if (keyboard.getS()) {
                setSpawnpoint(x, y);
            }
            x += speed;
            y += gravitation;
            if (gravitation > 0)
                fallingHeight += Math.abs(gravitation);
            gravitation += 0.4;
        } else {
            if (keyboard.getLeft() && !keyboard.getRight()) {
                x -= 10;
            }
            if (!keyboard.getLeft() && keyboard.getRight()) {
                x += 10;
            }
            if (keyboard.getUp()) {
                y -= 10;
            }
            if (keyboard.getS()) {
                y += 10;
            }
        }
        if (keyboard.getE()) {
            godMode = true;
        }
        if (keyboard.getR()) {
            godMode = false;
        }
        if (keyboard.getF11() && frame % 5 == 0) {
            if (Display.isFullScreen) {
                Display.frame.setSize(Display.w, Display.h);
            } else {
                Display.frame.setExtendedState(Frame.MAXIMIZED_BOTH);
            }
            Display.isFullScreen = !Display.isFullScreen;
        }
        if (keyboard.getF()) {
            chat[chatLast] = "[Debug] Player x: " + x + " ; player y: " + (y - Main.a);
            chatLast++;
            System.out.println("Player x: " + x + " ; player y: " + (y - Main.a));
        }

        if (keyboard.getX()) {
            chatLast = 1;
            Arrays.fill(chat, "");
            chat[0] = "[Debug] Cleared chat";
        }


        if (keyboard.getC()) {
            cancelSpawnpoint();
        }
        if (keyboard.getV()) {
            respawn();
        }
        if (keyboard.getG()) {
            setSpawnpoint(spawnpointsX.get(0), spawnpointsY.get(0));
        }
    }

    private void cancelSpawnpoint() {
        if (spawnpointsX.size() > 2) {
            spawnX = spawnpointsX.get(spawnpointsX.size() - 2);
            spawnY = spawnpointsY.get(spawnpointsY.size() - 2);
            spawnpointsX.remove(spawnpointsX.size() - 1);
            spawnpointsY.remove(spawnpointsY.size() - 1);
            chat[chatLast] = "[Debug] Set player's spawnpoint on " + (int) spawnX + "; " + ((int) spawnY - Main.a);
            chatLast++;
            System.out.println("Set spawnpoint on " + spawnX + "; " + spawnY);
        } else {
            chat[chatLast] = "[Debug] Nothing changed";
            chatLast++;
            System.out.println("Nothing changed");
        }
    }

    private void setSpawnpoint(double x, double y) {
        int a = 0;
        for (int i = 0; i < spawnpointsX.size(); i++) {
            if (spawnpointsX.get(i) == x && spawnpointsY.get(i) == y) {
                a++;
                break;
            }
        }
        if (a == 0) {
            spawnX = x;
            spawnY = y;
            chat[chatLast] = "[Debug] Set player's spawnpoint on " + (int) spawnX + "; " + ((int) spawnY - Main.a);
            chatLast++;
            System.out.println("Set spawnpoint on " + spawnX + "; " + spawnY);
            spawnpointsX.add(x);
            spawnpointsY.add(y);
        }
    }

}
