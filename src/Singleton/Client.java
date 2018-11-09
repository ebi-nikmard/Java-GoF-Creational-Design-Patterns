package Singleton;

/**
 * Singleton: Ensure a class only has one instance, and provide a global point of access to it.
 */
public class Client {

  public static void main(String[] args) {

    // Singleton
    System.out.println("-----Simple Singleton");
    SimpleSingleton obj1  = SimpleSingleton.getInstance();
    SimpleSingleton obj2 = SimpleSingleton.getInstance();
    System.out.println("object 1 = " + obj1);
    System.out.println("object 2 = " + obj2);

    // Thread-safe Singleton
    System.out.println("-----Thread-Safe Singleton");
    ThreadSafeSingleton threadSafeObj1 = ThreadSafeSingleton.getInstance();
    ThreadSafeSingleton threadSafeObj2 = ThreadSafeSingleton.getInstance();
    System.out.println("object 1 = " + threadSafeObj1);
    System.out.println("object 2 = " + threadSafeObj2);

    // Lazy initialized singleton
    System.out.println("-----Lazy Singleton");
    LazySingleton lazy1 = LazySingleton.getInstance();
    LazySingleton lazy2 = LazySingleton.getInstance();
    System.out.println("object 1 = " + lazy1.toString());
    System.out.println("object 2 = " + lazy2.toString());
  }
}