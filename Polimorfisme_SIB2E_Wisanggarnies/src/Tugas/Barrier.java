package Tugas;

public class Barrier implements IDestroyable{
    private int strength;

    public Barrier (int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int setStrength() {
        return strength;
    }

    public void destroyed() {
        if (strength > 0) {
            strength -= 9;
        }else if (strength <=0) {
            strength = 0;
            System.out.println("Barrier is broke");
        }
    }

    public String getBarrierInfo() {
        return "Barrier Strength: " + this.strength;
    }
}
