package in.ashokit;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entities.Product;
import in.ashokit.repositories.ProductRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(Application.class, args);

        ProductRepository productRepository =
                context.getBean(ProductRepository.class);

        // findAll()
        List<Product> products = productRepository.findAll();

        // Write data to CSV file
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("products_export.csv"))) {

            for (Product p : products) {
                String line =
                        p.getPId() + "," +
                        p.getPName() + "," +
                        p.getPPrice();

                bw.write(line);
                bw.newLine();
            }

            System.out.println("Data exported from DB to CSV successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }

        context.close();
    }
}
