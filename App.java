public class App {
    public static void main(String[] args) {
        System.out.println("App.main");
    }
    private static void doStuff() {
        System.out.println("Feature X: Do stuff");
    }
    private static void featureZ() {
        doStuff();
    }
}
