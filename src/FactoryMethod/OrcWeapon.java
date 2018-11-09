package FactoryMethod;

/**
 * OrcWeapon.
 */
public class OrcWeapon implements Weapon {

  private WeaponType weaponType;

  OrcWeapon(WeaponType weaponType) {
    this.weaponType = weaponType;
  }

  @Override
  public String toString() {
    return "We go to war with orc army and " + weaponType + " weapon.";
  }

  @Override
  public WeaponType getWeaponType() {
    return weaponType;
  }
}
