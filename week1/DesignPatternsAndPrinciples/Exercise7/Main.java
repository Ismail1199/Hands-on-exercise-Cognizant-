package DesignPatternsAndPrinciples.Exercise7;

public class Main {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobile = new MobileApp("Ismail");
        Observer web = new WebApp("Admin");

        stockMarket.registerObserver(mobile);
        stockMarket.registerObserver(web);

        stockMarket.setStockPrice(1450.75);

        stockMarket.deregisterObserver(web);

        stockMarket.setStockPrice(1525.40);
    }
}