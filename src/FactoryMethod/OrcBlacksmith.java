package FactoryMethod;

/**
 * Concrete subclass for creating new objects.
 */
public class OrcBlacksmith extends Blacksmith {

  public Weapon factoryMethodWeapon(WeaponType weaponType) {
    return new OrcWeapon(weaponType);
  }
}
