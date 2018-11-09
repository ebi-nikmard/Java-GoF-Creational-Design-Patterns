package AbstractFactory;

/**
 * Kingdom factory interface.
 */
class KingdomFactory {
    /**
     * The different types of Kingdoms.
     */
    public enum KingdomType {
        ELF, ORC
    }

    /**
     * The factory method to create Kingdom concrete objects.
     */
    static Kingdom makeFactory(KingdomType type) {
        switch (type) {
            case ELF:
                return new ElfKingdomFactory();
            case ORC:
                return new OrcKingdomFactory();
            default:
                throw new IllegalArgumentException("KingdomType not supported.");
        }
    }
}