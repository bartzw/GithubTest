public class App {
    public static void main(String[] args) {
        System.out.println("App.main");
    }
    private static void doStuff() {
        System.out.println("App.doStuff called by FeatureZ of Y");
    }
    private static void featureZ() {
        doStuff();
    }
    private static void featureY() {
        doStuff();
    }
}
