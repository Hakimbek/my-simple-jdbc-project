package org.example.service;

import org.example.dto.Laptop;
import org.example.jdbc.ConnectionDb;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class LaptopService {
    public static ArrayList<Laptop> getLaptop() throws SQLException {
        ResultSet resultSet = ConnectionDb.getConnection("laptop");
        ArrayList<Laptop> laptopArrayList = new ArrayList<>();
        if (resultSet != null) {
            while (resultSet.next()) {
                Integer code = resultSet.getInt(1);
                String  model = resultSet.getString(2);
                Integer speed = resultSet.getInt(3);
                Integer ram = resultSet.getInt(4);
                Integer hd = resultSet.getInt(5);
                Double price = resultSet.getDouble(6);
                Integer screen = resultSet.getInt(7);
                Laptop laptop = new Laptop(code, model, speed, ram, hd, price, screen);
                laptopArrayList.add(laptop);
            }
            return laptopArrayList;
        }
        return null;
    }
}
