package hu.progtech.warehouse;

public class IdGenerator {

    private static IdGenerator idGenerator;
    private int id;

    /** Privát konstruktor a singleton minta megvalósításához */
    /** Private constructor for singleton pattern implementation */
    private IdGenerator() {

    }

    /** Ez az metódus biztosítja az egyedi azonosítókat (id) az osztályok számára, ahol szükséges */
    /** This method provides a unique id for the classes, which require it */
    public int getNewId() {
        id++;
        return this.id;
    }

    /** Ezzel a metódussal kérhető el az IdGenerator példánya */
    /** This method provides the IdGenerator instance */
    public static IdGenerator getIdGenerator() {
        if (idGenerator == null)
            idGenerator = new IdGenerator();

        return idGenerator;
    }
}
