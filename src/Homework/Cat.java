package Homework;

public class Cat implements Actions {
    private String name;
    private int runDistance;
    private int jumpDistance;

    public Cat(String name, int runDistance, int jumpDistance) {
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
        System.out.println("Cat " + this.name + " is running " + this.getRunDistance());
    }

    @Override
    public void jump() {
        System.out.println("Cat " + this.name + " is jumping " + this.getJumpDistance());
    }
}
