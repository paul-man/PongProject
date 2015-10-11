import java.awt.*;

public class PongGraphics extends PongGame {

    /**
     * The "init()" method is similar to the PreInitializationEvent method from Minecraft modding.
     * It is called before the game starts and is used to set things up that will be necessary for later.
     * Here we set things like screen size and key listeners
     */
    //Second
    public void init() {
        setSize(400, 400);
        Thread thread = new Thread(this);
        thread.start();

        offscreen = createImage(400, 400);
        d = offscreen.getGraphics();
        addKeyListener(this);

    }

    public void paint(Graphics g) {
        d.clearRect(0, 0, 400, 400);
        setForeground(Color.red);
        d.drawOval(x, y, 20, 20);
        d.fillOval(x, y, 20, 20);

        g.drawImage(offscreen, 0, 0, this);
    }

    public void update(Graphics g) {
        paint(g);
    }
}
