package Tugas;

public abstract class Zombie implements IDestroyable{
    protected int health;
    protected int level;

    public abstract void heal();

    public abstract void destroyed();

    public String getZombieInfo() {
        return "Zombies Identification \n"
        + "Health status: " + this.health +"\n"
        +"Level status: " + this.level;
    }
}
