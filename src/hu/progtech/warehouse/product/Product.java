package hu.progtech.warehouse.product;

public abstract class Product implements Cloneable{
    private final int id;
    private String name;
    private final ProductType type;
    private int height;
    private int width;
    private int weight;

    public Product(int id, String name, ProductType type, int height, int width, int weight) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.height = height;
        this.width = width;
        this.weight = weight;
    }

    @Override
    public Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProductType getType() {
        return type;
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
