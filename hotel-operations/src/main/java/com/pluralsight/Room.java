package com.pluralsight;

public class Room {
    private static int beds;
    private static double price;
    private static boolean occupied;
    private static boolean dirty;

    Room(int beds, double price) {
        this.beds = beds;
        this.price = price;
        this.occupied = false;
        this.dirty=false;

    }
    public static int getNumberOfBeds(){
        return beds;
    }
    public static double getPrice(){
        return price;
    }
    public static boolean isOccupied(){
        return occupied;
    }
    public static boolean isDirty(){
        return dirty;
    }
    public static boolean isAvailable(){
        return (!occupied)&(!dirty);
    }
}
