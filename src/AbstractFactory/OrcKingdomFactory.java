package AbstractFactory;

/**
 * OrcKingdomFactory concrete factory.
 */
public class OrcKingdomFactory extends Kingdom {

  public Castle createCastle() {
    return new OrcCastle();
  }

  public King createKing() {
    return new OrcKing();
  }

  public Army createArmy() {
    return new OrcArmy();
  }
}
