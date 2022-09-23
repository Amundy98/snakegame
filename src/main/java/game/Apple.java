package game;

import java.util.Random;
import java.util.TimerTask;

public class Apple extends TimerTask {


    private int posx;
    private int posy;
    private Snake snake;

    public Apple(Snake snake) {
        this.snake = snake;
    }

    public Apple() {
        this.posx = 25 * new Random().nextInt(20);
        this.posy = 25 * new Random().nextInt(20);
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    @Override
    public void run() {
        if (this.snake.getApple() == null){
            this.snake.setApple(new Apple());
        }
    }
}
