import javafx.application.Application;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by mobile-mann on 10/10/2015.
 */
public class PongGame extends Application implements KeyListener {

    public boolean runGame = true,
                   up, down, left, right;
    public int x, y;
    public Image offscreen;
    public GraphicsContext g;
    public Stage gameStage;


    /**
     * The main entry point for all JavaFX applications.
     * The start method is called after the init method has returned,
     * and after the system is ready for the application to begin running.
     *
     * <p>
     * NOTE: This method is called on the JavaFX Application Thread.
     * </p>
     *
     * @param primaryStage the primary stage for this application, onto which
     * the application scene can be set. The primary stage will be embedded in
     * the browser if the application was launched as an applet.
     * Applications may create other stages, if needed, but they will not be
     * primary stages and will not be embedded in the browser.
     */
    public void start(Stage primaryStage) {
        gameStage = primaryStage;
        x = y = 200;


        while(runGame) {

            if (up) {
                y++;
            } if (down) {
                y--;
            } if (left) {
                x--;
            } if (right) {
                x++;
            }

            repaint(g);
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }










    /**
     * Invoked when a key has been pressed.
     * See the class description for {@link KeyEvent} for a definition of
     * a key pressed event.
     */
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == e.VK_W) {
            up = true;
        } if (e.getKeyCode() == e.VK_S) {
            down = true;
        } if (e.getKeyCode() == e.VK_A) {
            left = true;
        } if (e.getKeyCode() == e.VK_D) {
            right = true;
        }
    }

    /**
     * Invoked when a key has been released.
     * See the class description for {@link KeyEvent} for a definition of
     * a key released event.
     */
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == e.VK_W) {
            up = false;
        } if (e.getKeyCode() == e.VK_S) {
            down = false;
        } if (e.getKeyCode() == e.VK_A) {
            left = false;
        } if (e.getKeyCode() == e.VK_D) {
            right = false;
        }
    }

    public void keyTyped(KeyEvent e) {}

}