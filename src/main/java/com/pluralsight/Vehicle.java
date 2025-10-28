package com.pluralsight;

public class Vehicle extends Asset {
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override
    public double getValue() {
        int currentYear = 2025;
        int age = currentYear - year;
        double value = 0.0;
        if (age >= 0 && age <= 3) {
            // 0-3 years old - 3% reduced value per year
            value = getOriginalCost() * (1 - (age * 0.03));
        } else if (age >= 4 && age <= 6) {
            // 4-6 years old - 6% reduced value per year
            value = getOriginalCost() * (1 - (age * 0.06));
        } else if (age >= 7 && age <= 10) {
            // 7-10 years old - 8% reduced value per year
            value = getOriginalCost() * (1 - (age * 0.08));
        } else if (age > 10) {
            // over 10 years old - $1000.00
            value = 1000.00;
        }
        if (odometer > 100000) {
            // Reduce by 25% UNLESS it's a Honda or Toyota
            if (!makeModel.toLowerCase().contains("honda") &&
                    !makeModel.toLowerCase().contains("toyota")) {
                value = value * 0.75;
            }
        }

        return value;
    }
}

