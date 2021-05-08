package hu.progtech.warehouse.product;


/**
 * Implements the Cloneable interface. Stores product information.
 * Use the clone method to request a copy of it.
 * */
public abstract class Product implements Cloneable{
    private final int id;
    private long EAN;
    private boolean isVisible;
    private String name;
    private int height;
    private int width;
    private int weight;

    public Product(int id) {
        this.id = id;
    }

    public abstract Product clone();

    public Product superClone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    public int getId() {
        return id;
    }

    public long getEAN() {
        return EAN;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getWeight() {
        return weight;
    }

    public void setEAN(long EAN) {
        this.EAN = EAN;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
