package Homework;


public class Wall implements Barrier {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean moving(Actions actions) {
        System.out.println("The Wall height is " +height);
        actions.jump();
        if (getHeight()<actions.getJumpDistance()) {
            System.out.println("Прыжок успешен");
            return true;
        }
        System.out.println("Прыжок не удался");
        return false;
    }
}
