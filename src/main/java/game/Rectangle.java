package game;

public class Rectangle {

    private int posx;
    private int posy;

    public static final int REC_WIDTH = 25;
    public static final int REC_HEIGHT = 25;

    public Rectangle(int posx, int posy) {
        this.posx = posx;
        this.posy = posy;
    }

    public boolean intersects(Rectangle r2){

        return this.posx == r2.getPosx() && this.posy == getPosy();
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int increment) {
        this.posx = this.posx + increment;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int increment) {
        this.posy = this.posy + increment;
    }
}
