import java.util.Objects;

public class Cars {

    private String brand;
    private int number;

    public Cars(String brand, int number) {
        this.brand = brand;
        this.number = number;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return number == cars.number && Objects.equals(brand, cars.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, number);
    }
}
