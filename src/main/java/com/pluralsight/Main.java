package com.pluralsight;

import com.pluralsight.Models.Asset;
import com.pluralsight.Models.House;
import com.pluralsight.Models.Vehicle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList to hold Asset objects
        ArrayList<Asset> myAssets = new ArrayList<Asset>();

        House home1 = new House("My First Home", "Oct 16, 2025", 1000000, "123 Main road Florida", 4, 1600, 5000);
        House home2 = new House("Vacation home", "Oct 28, 2025", 500000.88, "100 Roger Hideaway, Champion, PA", 2, 10000, 20000);
        myAssets.add(home1);
        myAssets.add(home2);


        Vehicle car1 = new Vehicle("First Car", "September 27, 2025", 50000.00, "Mercedes benz", 2025, 15);
        Vehicle car2 = new Vehicle("Spare Vehicle", "September 30, 2025", 10000.00, "Toyota Tacoma", 2005, 100000);
        myAssets.add(car1);
        myAssets.add(car2);
    }