package kg.geektech.les8.players;

import kg.geektech.les8.game.RPG_Game;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        setDamage(20);
        setDamage(getDamage() * RPG_Game.random.nextInt(2) + 2);
    }
}
