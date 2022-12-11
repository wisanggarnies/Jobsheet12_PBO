package Tugas;

public class JumpingZombie extends Zombie{
    
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        if (this.level == 1) {
            this.health += (this.health * 3/10);
        }else if (this.level == 2) {
            this.health += (this.health * 4/10);
        }else if (this.level == 3) {
            this.health += (this.health * 5/10);
        }
    }

    public void destroyed() {
        if (this.health > 0) {
            this.health -= (this.health * 1/10);
        }else if (this.health <= 0) {
            this.health = 0;
            System.out.println("Jumping Zombie is dead");
        }
    }

    public String getZombieInfo() {
        return "Jumping Zombie Data \n"
        + "Health : " + this.health +"\n"
        + "Level  : " + this.level + "\n";
    }
}
