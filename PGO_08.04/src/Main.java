import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        User guest1 = new User("guest1@gmai.com");
        User guest2 = new User("guest2@gmail.com");
        User user1 = new User("Will", "Smith", "willsmith@gmail.com", "12345678");
        User user2 = new User(guest1, "Alex", "Brown", "12345678");

        Product banana = new Product("Banana", 1000, 91920, 5);
        Product apple = new Product("Apple", 1000, 91920, 5);
        Product potato = new Product("Potato", 2000, 59302, 2);
        Product cucumber = new Product("Cucumber", 2000, 59302, 2);
        Product beef = new Product("Beef", 3000, 45678);

        List<Product> fruitsList = new ArrayList<>();
        List<Product> vegetableList = new ArrayList<>();
        List<Product> meatList = new ArrayList<>();

        fruitsList.add(banana);fruitsList.add(apple);
        vegetableList.add(potato); vegetableList.add(cucumber);
        meatList.add(beef);

        Category fruits = new Category();
        fruits.setName("Fruits");
        fruits.addProduct(banana);
        Category vegetables = new Category("Vegetables");
        vegetables.addProduct(potato);
        Category meat = new Category("Meat", meatList);


        Basket basket1 = new Basket();
        Basket basket2 = new Basket(user1);
        basket2.addProduct(potato);
        basket2.addProduct(cucumber);
        basket2.removeProduct(potato);
        Basket basket3 = new Basket(fruitsList, user2);

        System.out.println(basket2.pay());

    }
}