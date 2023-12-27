package players;

public abstract class Hero extends  GameEntity implements HavingSuperAbility {
    private SuperAbility ability;
    public Hero(int health, int damage,SuperAbility ability, String name) {
        super(health, damage, name);
        this.ability = ability;
    }
    public SuperAbility getAbility() {
        return this.ability;
    }

    public void attack(Boss boss) {
        boss.setHealth(boss.getHealth() - this.getDamage());
    }

    public String toString() {
        String var10000 = this.getClass().getSimpleName();
        return var10000 + " " + super.toString();
    }
}
