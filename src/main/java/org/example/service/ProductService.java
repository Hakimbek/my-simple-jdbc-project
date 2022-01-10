package org.example.service;

import org.example.dto.Product;
import org.example.jdbc.ConnectionDb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductService {
    public static ArrayList<Product> getProduct() throws SQLException {
        ArrayList<Product> productArrayList = new ArrayList<>();
        ResultSet resultSet = ConnectionDb.getConnection("product");
        if (resultSet != null) {
            while (resultSet.next()) {
                String maker = resultSet.getString(1);
                String model = resultSet.getString(2);
                String type = resultSet.getString(3);
                Product product = new Product(maker, model, type);
                productArrayList.add(product);
            }
            return productArrayList;
        }
        return null;
    }
}
