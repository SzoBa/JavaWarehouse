package hu.progtech.warehouse;

public class IdGenerator {

    private static IdGenerator idGenerator;
    private int id;

    private IdGenerator() {

    }

    public int getNewId() {
        id++;
        return this.id;
    }

    public static IdGenerator getIdGenerator() {
        if (idGenerator == null)
            idGenerator = new IdGenerator();

        return idGenerator;
    }
}
