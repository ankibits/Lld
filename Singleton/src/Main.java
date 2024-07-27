public class Main {
    public static void main(String[] args) {

        // Instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();

        // Instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();

        // Instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();

        if (x==y && x==z && y==z) {
            System.out.println("objects are similar");
        } else {
            System.out.println("objects are dissimilar");
        }
    }
}