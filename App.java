public class App {
    public static void main(String[] args) {
        System.out.println("App.main");
    }
    private static void doStuff() {
        System.out.println("App.doStuff called by featuryY");
    }
    private static void featureY() {
        doStuff();
    }
}
