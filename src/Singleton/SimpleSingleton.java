package Singleton;

/**
 * Singleton class
 */
public final class SimpleSingleton {

  /**
   * Private constructor.
   */
  private SimpleSingleton() {}

  /**
   * Static to class instance of the class.
   */
  private static final SimpleSingleton INSTANCE = new SimpleSingleton();

  /**
   * @return instance of the singleton.
   */
  public static SimpleSingleton getInstance() {
    return INSTANCE;
  }
}
