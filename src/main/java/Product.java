public class Product {
    private Long id;
    private String name;
    private String color;
    private Integer Year;

    public Product() {
    }

    public Product(Long id, String name, String color, Integer year) {
        this.id = id;
        this.name = name;
        this.color = color;
        Year = year;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getYear() {
        return Year;
    }

    public void setYear(Integer year) {
        Year = year;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", Year=" + Year +
                '}';
    }
}
