package abstraction;

public abstract class GraphicObject {
    int x, y;

    void moveTo(int new X, int new Y) {
        System.out.println("Move to X : " +X+ " and Y : " +Y);
    }

    abstract void draw();

    abstract void resize();
}
