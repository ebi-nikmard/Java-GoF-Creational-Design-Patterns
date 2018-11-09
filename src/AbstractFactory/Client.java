package AbstractFactory;

/**
 * AbstractFactory: Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 */
public class Client {

  private King king;
  private Castle castle;
  private Army army;

  /**
   * Create kingdom
   */
  private void createKingdom(final Kingdom factory) {
    setKing(factory.createKing());
    setCastle(factory.createCastle());
    setArmy(factory.createArmy());
  }

  private King getKing() {
    return king;
  }

  private void setKing(final King king) {
    this.king = king;
  }

  private Castle getCastle() {
    return castle;
  }

  private void setCastle(final Castle castle) {
    this.castle = castle;
  }

  private Army getArmy() {
    return army;
  }

  private void setArmy(final Army army) {
    this.army = army;
  }

  public static void main(String[] args) {

    Client client = new Client();

    System.out.println("Elf Kingdom");
    client.createKingdom(KingdomFactory.makeFactory(KingdomFactory.KingdomType.ELF));
    System.out.println(client.getArmy().getDescription());
    System.out.println(client.getCastle().getDescription());
    System.out.println(client.getKing().getDescription());

    System.out.println("------");

    System.out.println("Orc Kingdom");
    client.createKingdom(KingdomFactory.makeFactory(KingdomFactory.KingdomType.ORC));
    System.out.println(client.getArmy().getDescription());
    System.out.println(client.getCastle().getDescription());
    System.out.println(client.getKing().getDescription());
  }
}