package prototypeRegistry.cache;

import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.util.HashMap;
import java.util.Map;

public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(9, 15);

        cache.put("Medium Circle", circle);
        cache.put("Medium Rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get(String key) {
        return cache.get(key).clone();
    }

}
