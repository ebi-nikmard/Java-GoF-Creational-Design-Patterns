package AbstractFactory;

/**
 * Kingdom interface.
 */
abstract class Kingdom {

  abstract Castle createCastle();

  abstract King createKing();

  abstract Army createArmy();

}