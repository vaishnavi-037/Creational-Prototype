package prototypeRegistry;

import prototypeRegistry.cache.BundledShapeCache;
import shapes.Shape;

public class Application {
    public static void main(String[] args) {
        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Medium Circle");
        Shape shape2 = cache.get("Medium Rectangle");
        Shape shape3 = cache.get("Medium Rectangle");

        System.out.println(shape1);
        System.out.println(shape2.equals(shape3));
        System.out.println(shape2 == shape3);
    }
}
