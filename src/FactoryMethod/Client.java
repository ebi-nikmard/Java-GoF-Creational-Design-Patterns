package FactoryMethod;

/**
 * Factory Method: Define an interface for creating an object, but let subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 */

public class Client {

  private final Blacksmith blacksmith;

  private Client(Blacksmith blacksmith) {
    this.blacksmith = blacksmith;
  }

  public static void main(String[] args) {
    // Lets go to war with Orc weapons
    Client client = new Client(new OrcBlacksmith());
    client.manufactureWeapons();

    System.out.println("--------");

    // Lets go to war with Elf weapons
    client = new Client(new ElfBlacksmith());
    client.manufactureWeapons();
  }
  
  private void manufactureWeapons() {
    Weapon weapon;
    weapon = blacksmith.factoryMethodWeapon(WeaponType.SPEAR);
    System.out.println(weapon.toString());

    weapon = blacksmith.factoryMethodWeapon(WeaponType.AXE);
    System.out.println(weapon.toString());
  }
}