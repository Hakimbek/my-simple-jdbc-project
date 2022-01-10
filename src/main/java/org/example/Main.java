package org.example;

import org.example.dto.Laptop;
import org.example.dto.PC;
import org.example.dto.Printer;
import org.example.dto.Product;
import org.example.service.LaptopService;
import org.example.service.PcService;
import org.example.service.PrinterService;
import org.example.service.ProductService;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Laptops");
            ArrayList<Laptop> laptopArrayList = LaptopService.getLaptop();
            if (laptopArrayList != null) {
                laptopArrayList.forEach(System.out::println);
            }

            System.out.println("Pc");
            ArrayList<PC> pcArrayList = PcService.getPc();
            if (pcArrayList != null) {
                pcArrayList.forEach(System.out::println);
            }

            System.out.println("Printer");
            ArrayList<Printer> printerArrayList = PrinterService.getPrinter();
            if (printerArrayList != null) {
                printerArrayList.forEach(System.out::println);
            }

            System.out.println("Product");
            ArrayList<Product> productArrayList = ProductService.getProduct();
            if (productArrayList != null) {
                productArrayList.forEach(System.out::println);
            }
        } catch (SQLException throwable) {
            System.out.println("Error");
        }
    }
}
