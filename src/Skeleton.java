public class Skeleton extends Boss{
    private int arrowLeft;

    public int getArrowLeft() {
        return arrowLeft;
    }

    public void setArrowLeft(int arrowLeft) {
        this.arrowLeft = arrowLeft;
    }
    @Override
    public void printInfo(){
        System.out.println("Skeleton Health: " + this.getEntityHealth() + " Damage: " + this.getEntityDamage()
                + " Weapon:" + this.getBossWeapon().getWeaponName() + " Weapon type: " + this.getBossWeapon().getWeaponType() + " Arrow left: " + this.getArrowLeft());
    }

}
