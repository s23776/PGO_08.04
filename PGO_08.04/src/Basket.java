import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Product> products;
    private User user;

    public Basket() {
        this(new ArrayList<>(), null);
    }

    public Basket(User user) {
        this(new ArrayList<>(), user);
    }

    public Basket(List<Product> products, User user) {
        this.products = products;
        this.user = user;
    }

    public void addProduct(Product product){
        if(product.getNumberOfUnits() - 1 < 0) {
            System.out.println("The product isn't in stock");
            return;
        }
        product.setNumberOfUnits(product.getNumberOfUnits() - 1);
        products.add(product);
    }

    public void removeProduct(Product product){
        if(!products.remove(product))
            System.out.println("Product not found");
        else
            product.setNumberOfUnits(product.getNumberOfUnits() + 1);
    }

    public String pay(){
        int sumPrice = 0;
        for (Product product: products)
            sumPrice += product.getPrice();
        products = new ArrayList<>();
        return "The price of products in basket: " + sumPrice + " usd";
    }

}