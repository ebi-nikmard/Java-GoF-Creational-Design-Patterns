package FactoryMethod;

/**
 * The interface containing method for producing objects.
 */
abstract class Blacksmith {

  abstract Weapon factoryMethodWeapon(WeaponType weaponType);

}
