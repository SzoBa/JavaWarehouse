package hu.progtech.warehouse;

public class IdGenerator {

    private static IdGenerator idGenerator;
    private int id = 0;

    /** Private constructor for singleton pattern implementation */
    private IdGenerator() {

    }

    /**
     * This method provides a unique id for the classes, which require it and
     * instantiates the IdGenerator if necessary.
     */
    public static int getNewId() {
        if (idGenerator == null) {
            idGenerator = new IdGenerator();
        }
        idGenerator.id++;
        return idGenerator.id;
    }
}
