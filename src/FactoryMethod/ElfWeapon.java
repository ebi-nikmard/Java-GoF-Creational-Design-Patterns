package FactoryMethod;

/**
 * ElfWeapon.
 */
public class ElfWeapon implements Weapon {

  private WeaponType weaponType;

  ElfWeapon(WeaponType weaponType) {
    this.weaponType = weaponType;
  }

  @Override
  public String toString() {
    return "We go to war with elf army and " + weaponType + " weapon.";
  }

  @Override
  public WeaponType getWeaponType() {
    return weaponType;
  }
}