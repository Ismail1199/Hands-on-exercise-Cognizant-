package DesignPatternsAndPrinciples.Exercise3;

public class Main {

    public static void main(String[] args) {

        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel Core i9")
                .setRam("32 GB")
                .setStorage("1 TB SSD")
                .build();

        Computer officePC = new Computer.Builder()
                .setCpu("Intel Core i5")
                .setRam("16 GB")
                .setStorage("512 GB SSD")
                .build();

        gamingPC.display();

        officePC.display();
    }
}