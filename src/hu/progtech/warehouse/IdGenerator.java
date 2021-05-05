package hu.progtech.warehouse;

public class IdGenerator {

    private static IdGenerator idGenerator = null;

    private int id;

    private IdGenerator()
    {
        this.id = 0;
    }

    public static IdGenerator getIdGenerator()
    {
        if (idGenerator == null)
            idGenerator = new IdGenerator();
        return idGenerator;
    }

    public int getNewId() {
        this.id++;
        return id;
    }
}
