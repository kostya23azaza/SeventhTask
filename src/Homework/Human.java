package Homework;


public class Human implements Actions {
    private String name;
    private int runDistance;
    private int jumpDistance;

    public Human(String name, int runDistance, int jumpDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;
    }

    @Override
    public int getRunDistance() {
        return runDistance;
    }

    @Override
    public int getJumpDistance() {
        return jumpDistance;
    }

    @Override
    public void run() {
        System.out.println("Human " + this.name + " is running " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Human " + this.name + " is jumping " + this.getJumpDistance());
    }
}
