package DesignPatternsAndPrinciples.Exercise7;

public class MobileApp implements Observer {

    private String user;

    public MobileApp(String user) {
        this.user = user;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(user + " (Mobile App) received stock update: " + stockPrice);
    }
}