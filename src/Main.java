public class Main {
    public static void main(String[] args) {
        Weapon weapon1 = new Weapon();
        weapon1.setWeaponName("Mace");
        weapon1.setWeaponType(WeaponType.PHYSICAL);
        Boss boss = new Boss();
        boss.setBossWeapon(weapon1);
        boss.setEntityDamage(100);
        boss.setEntityHealth(1200);
        boss.printInfo();
        Weapon skeletonWeapon = new Weapon();
        skeletonWeapon.setWeaponType(WeaponType.RANGED);
        skeletonWeapon.setWeaponName("Bow");
        Skeleton archer1 = new Skeleton();
        archer1.setEntityHealth(200);
        archer1.setEntityDamage(45);
        archer1.setBossWeapon(skeletonWeapon);
        archer1.setArrowLeft(10);
        archer1.printInfo();
        Skeleton archer2 = new Skeleton();
        archer2.setEntityHealth(150);
        archer2.setEntityDamage(65);
        archer2.setBossWeapon(skeletonWeapon);
        archer2.setArrowLeft(20);
        archer2.printInfo();



    }
}