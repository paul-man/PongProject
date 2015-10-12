import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongGame extends Applet implements Runnable, KeyListener {


    public boolean up, down, left, right;
    public boolean runGame = true;
    public int x = 200, y = 200;
    public Image offscreen;
    public Graphics d;
    /**
     * When an object implements Runnable, it must have a "run()" method.
     * Imagine the "run()" method as the forever loop from scratch.
     *
     */
    // First
    @Override
    public void run() {
        while (runGame) {
            if (up) {
                y--;
            } if (down) {
                y++;
            } if (right) {
                x++;
            } if (left)  {
                x--;
            }

            repaint();
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {

            }
        }


    }


    /**
     * Called when a key has been pressed down
     * Do not control movements here, because this method is not called as frequently,
     * movements will be delayed.
     */
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == e.VK_W) {
            up = true;
        }
        if (e.getKeyCode() == e.VK_A) {
            left = true;
        }
        if (e.getKeyCode() == e.VK_D) {
            right = true;
        }
        if (e.getKeyCode() == e.VK_S) {
            down = true;
        }
    }

    /**
     * Called when a key has been let go after being pressed down
     */
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == e.VK_W) {
            up = false;
        }
        if (e.getKeyCode() == e.VK_A) {
            left = false;
        }
        if (e.getKeyCode() == e.VK_D) {
            right = false;
        }
        if (e.getKeyCode() == e.VK_S) {
            down = false;
        }
    }

    /**
     * Called when a key has been typed.
     */
    @Override
    public void keyTyped(KeyEvent e) { }

}
