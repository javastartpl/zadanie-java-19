public class Product {
    private int id;
    private String name;
    private String producer;

    public Product() {
    }

    public Product(int id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void showInfo() {
        System.out.println(id + " " + name + " " + producer);
    }
}
