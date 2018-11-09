package Singleton;

/**
 * Lazy Singleton
 */
public class LazySingleton {

  /**
   * Private constructor.
   */
  private LazySingleton() {}

  /**
   * @return Singleton instance
   */
  public static LazySingleton getInstance() {
    return HelperHolder.INSTANCE;
  }

  /**
   * Provides the lazy-loaded Singleton instance.
   */
  private static class HelperHolder {
    private static final LazySingleton INSTANCE = new LazySingleton();
  }
}