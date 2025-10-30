package com.pluralsight;

import com.pluralsight.Models.Asset;
import com.pluralsight.Models.House;
import com.pluralsight.Models.Vehicle;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        ArrayList<Asset> assets = new ArrayList<Asset>();

        assets.add(new House("A good house", "Last Time", 125000, "123 Nowhere st.", 2, 1000, 10000));
        assets.add(new House("A bad house", "Some Time Ago", 85000, "144 Nowhere st.", 4, 1000, 10000));

        assets.add(new Vehicle("A good car", "Last Month", 25000, "Ford Fusion", 2015, 150000));
        assets.add(new Vehicle("A bad motorcycle", "Last Year", 15000, "Honda Manga", 2005, 1000));

        for (Asset asset : assets) {
            System.out.println(asset.getDescription());
            System.out.println(asset.getOriginalCost());
            System.out.println(asset.getDateAcquired());
            System.out.println(asset.getValue());
            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("House at " + house.getAddress());
            }
            else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }
            System.out.println();

        }
    }
}