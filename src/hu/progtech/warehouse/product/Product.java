package hu.progtech.warehouse.product;

public class Product {
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
