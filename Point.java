package lab;

public class Point {

    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Point)) {
            return false;
        }
        return (((Point) o).getX() == x) && (((Point) o).getY() == y);
    }

    @Override
    public int hashCode() {
        return Integer.valueOf(x) ^ Integer.valueOf(y);
    }

    @Override
    public String toString() {
        return Integer.toString(x) + "  " + Integer.toString(y);
    }
}