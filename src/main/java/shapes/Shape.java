package shapes;

public abstract class Shape {
    private int x;
    private int y;

    public Shape(){

    }
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape(Shape source) {
        this.x = source.x;
        this.y = source.y;
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape shape2)) return false;
        return shape2.x == x && shape2.y == y;
    }
}
