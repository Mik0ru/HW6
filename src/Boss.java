public class Boss extends GameEntity {
    private Weapon bossWeapon;

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }
    public void printInfo(){
        System.out.println("Boss Health: " + this.getEntityHealth() + " Damage: " + this.getEntityDamage()
        + " Weapon:" + this.getBossWeapon().getWeaponName() + " Weapon type: " + this.getBossWeapon().getWeaponType());
    }
}
