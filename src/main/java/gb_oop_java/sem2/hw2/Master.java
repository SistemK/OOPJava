package gb_oop_java.sem2.hw2;

public class Master {
    protected String name;
    protected int maxHeight;
    protected int maxLenght;

    public Master(String name, int maxHeight, int maxLenght) {
        this.name = name;
        this.maxHeight = maxHeight;
        this.maxLenght = maxLenght;
    }

    public boolean run(RunTrack track) {
        if (track.distance > maxLenght) {
            return false;
        } else {
            return true;
        }

    }

    public boolean jump(Wall wall) {
        if (wall.height > maxHeight) {
            return false;
        } else {
            return true;
        }
    }

}
