package Java.Generics.Reflection;

public class Main {

    public static void main(String[] args) {
        Injector injector = new Injector().with("Hello World");

        Logger logger = (Logger) injector.newInstance(Logger.class);
        logger.log();
    }
}
