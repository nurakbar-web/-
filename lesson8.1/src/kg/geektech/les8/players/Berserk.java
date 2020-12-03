package kg.geektech.les8.players;

public class Berserk extends Hero implements HavingSuperPower{
    public Berserk(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }


    public void applySuperPower(Boss boss, Hero[] heroes) {
        setDamage(10);
        setDamage(getDamage()+boss.getDamage()/2  );
    }
}
