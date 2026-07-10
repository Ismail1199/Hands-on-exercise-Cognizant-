package DesignPatternsAndPrinciples.Exercise7;

public class WebApp implements Observer {

    private String user;

    public WebApp(String user) {
        this.user = user;
    }

    @Override
    public void update(double stockPrice) {
        System.out.println(user + " (Web App) received stock update: " + stockPrice);
    }
}