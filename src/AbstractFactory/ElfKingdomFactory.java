package AbstractFactory;

/**
 * ElfKingdomFactory concrete factory.
 */
public class ElfKingdomFactory extends Kingdom {

  public Castle createCastle() {
    return new ElfCastle();
  }

  public King createKing() {
    return new ElfKing();
  }

  public Army createArmy() {
    return new ElfArmy();
  }

}