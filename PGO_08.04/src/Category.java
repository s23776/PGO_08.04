import java.util.ArrayList;
import java.util.List;

public class Category {

    private String name;
    private List<Product> products;

    public Category() {
        this("", new ArrayList<>());
    }

    public Category(String name) {
        this(name, new ArrayList<>());
    }

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(){
        if(!products.remove(products))
            System.out.println("Product not found");;
    }

    public void setName(String name) {
        this.name = name;
    }
}