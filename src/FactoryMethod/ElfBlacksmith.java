package FactoryMethod;

/**
 * Concrete subclass for creating new objects.
 */
public class ElfBlacksmith extends Blacksmith {

  public Weapon factoryMethodWeapon(WeaponType weaponType) {
    return new ElfWeapon(weaponType);
  }

}
