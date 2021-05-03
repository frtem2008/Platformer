import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {

    private static boolean[] keys = new boolean[66568];
    private static boolean left, right, up, space, shift, f11, s, e, r, f, q, c, v, g, x;

    public void update() {
        left = keys[KeyEvent.VK_LEFT] || keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_RIGHT] || keys[KeyEvent.VK_D] ;
        up = keys[KeyEvent.VK_UP] || keys[KeyEvent.VK_W] || keys[KeyEvent.VK_SPACE];
        space = keys[KeyEvent.VK_SPACE];
        shift = keys[KeyEvent.VK_SHIFT];
        f11 = keys[KeyEvent.VK_F11];
        s = keys[KeyEvent.VK_S];
        e = keys[KeyEvent.VK_E];
        r = keys[KeyEvent.VK_R];
        f = keys[KeyEvent.VK_F];
        q = keys[KeyEvent.VK_Q];
        c = keys[KeyEvent.VK_C];
        v = keys[KeyEvent.VK_V];
        g = keys[KeyEvent.VK_G];
        x = keys[KeyEvent.VK_X] || keys[KeyEvent.VK_DELETE];
    }
    public boolean getX(){return x;}

    public boolean getG() {
        return g;
    }

    public boolean getV() {
        return v;
    }

    public boolean getC() {
        return c;
    }

    public boolean getQ() {
        return q;
    }

    public boolean getF() {
        return f;
    }

    public boolean getE() {
        return e;
    }

    public boolean getR() {
        return r;
    }

    public boolean getLeft() {
        return left;
    }

    public boolean getRight() {
        return right;
    }

    public boolean getUp() {
        return up;
    }

    public boolean getF11() {
        return f11;
    }

    public boolean getS() {
        return s;
    }

    public boolean getShift() {
        return shift;
    }

    @Override
    public void keyPressed(KeyEvent event) {
        keys[event.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent event) {
        keys[event.getKeyCode()] = false;
    }

    @Override
    public void keyTyped(KeyEvent event) {

    }

}