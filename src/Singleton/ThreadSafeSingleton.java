package Singleton;

/**
 * Thread-safe Singleton
 */
public class ThreadSafeSingleton {

  private static ThreadSafeSingleton INSTANCE;

  /**
   * Private constructor.
   */
  private ThreadSafeSingleton() {
    if (INSTANCE == null) INSTANCE = this;
    else throw new IllegalStateException("Already initialized.");
  }

  /**
   * @return instance of the singleton.
   */
  public static synchronized ThreadSafeSingleton getInstance() {
    if (INSTANCE == null) INSTANCE = new ThreadSafeSingleton();
    return INSTANCE;
  }
}
