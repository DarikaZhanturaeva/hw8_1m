package players;

import logic.RPG_Game;

import java.io.PrintStream;

public class Warrior extends Hero{
    public Warrior(int health, int damage, String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE, name);
    }

    public void applySuperPower(Boss boss, Hero[] heroes) {
        int coeff = RPG_Game.random.nextInt(8) + 2;
        boss.setHealth(boss.getHealth() - this.getDamage() * coeff);
        PrintStream var10000 = System.out;
        String var10001 = this.getName();
        var10000.println("Warrior " + var10001 + " hits critically " + this.getDamage() * coeff);
    }
}
