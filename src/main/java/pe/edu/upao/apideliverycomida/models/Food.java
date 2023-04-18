package pe.edu.upao.apideliverycomida.models;

public class Food {
    private String name;
    private String description;
    private double price;

    //Constructor sin attributes(s)
    public Food() {
    }
    //Constructor con attributes(s) name
    public Food(String name) {
        this.name = name;
    }
    //Constructor con attributes(s) name, description
    public Food(String name, String description) {
        this.name = name;
        this.description = description;
    }

    //Constructor con attributes(s) name, description y price
    public Food(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
    //Getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
