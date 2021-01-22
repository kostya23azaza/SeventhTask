package Homework;

public class Road implements Barrier {
    private int lenght;

    public Road(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    @Override
    public boolean moving(Actions actions) {
        System.out.println("The Road lenght is " + this.lenght);
        actions.run();
        if (getLenght()<actions.getRunDistance()) {
            System.out.println("Пробежка удалась");
            return true;
        }
        System.out.println("пробежка не удалась");
        return false;
    }
}
