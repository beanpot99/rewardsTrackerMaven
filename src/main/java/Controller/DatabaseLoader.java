package Controller;

import model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repositories.CustomerRepository;

import java.util.HashMap;

@Component
public class DatabaseLoader implements CommandLineRunner {
    public HashMap<String, Double> purchases = new HashMap<>();
    private final CustomerRepository repository;


    @Autowired
    public DatabaseLoader(CustomerRepository repository){
        this.repository=repository;
    }

    @Override
    public void run(String...strings) {

        purchases.put("02/12", 14.25);
        purchases.put("02/15", 1.25);
        purchases.put("02/18", 3.97);
        purchases.put("02/21", 0.98);
        purchases.put("02/22", 2.56);
        purchases.put("03/05", 1.25);
        purchases.put("03/12", 3.97);
        purchases.put("03/13", 0.55);
        purchases.put("03/15", 1.99);
        purchases.put("03/17", 10.23);
        purchases.put("03/20", 15.67);
        purchases.put("03/26", 20.38);
        purchases.put("04/08", 14.25);
        purchases.put("04/09", 1.23);
        purchases.put("04/17", 0.10);
        purchases.put("04/22", 3.45);
        purchases.put("04/29", 6.98);
        purchases.put("04/30", 1.32);
        this.repository.save(new Customer("Grace Thompson",purchases));
    }
}
