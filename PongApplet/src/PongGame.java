import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PongGame extends Applet implements Runnable, KeyListener {


    public boolean up;
    public boolean runGame = true;
    public int x = 200, y = 0;
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
     */
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == e.VK_W) {
            up = true;
        }
    }

    /**
     * called when a key has been let go after being pressed down
     */
    public void keyReleased(KeyEvent e) {

    }

    /**
     * Called when a key has been typed.
     */
    @Override
    public void keyTyped(KeyEvent e) { }

}
