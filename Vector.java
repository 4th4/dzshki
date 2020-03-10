package lesson2;

public class Vector {

    private float x,y,z;

    public Vector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float length(){
        float length = (float) Math.sqrt((x*x) + (y*y) + (z*z));
        return length;
    }

    public float scalarProduct(Vector v2){
        float product = x*v2.getX() + y*v2.getY() + z*v2.getZ();
        return product;
    }

    public Vector vectorProduct(Vector v2){
        Vector product = new Vector(
                y*v2.getZ() - z*v2.getY(),
                z*v2.getX() - x*v2.getZ(),
                x*v2.getY() - y*v2.getX());
        return product;
    }

    public float getCosOfAngle(Vector v2){
        float cos = scalarProduct(v2)/(length()*v2.length());
        return cos;
    }

    public Vector sum(Vector v2){
        Vector product = new Vector(x+v2.getX(),y+v2.getY(),z+v2.getZ());
        return product;
    }

    public static Vector sub(Vector v1,Vector v2){
        Vector product = new Vector(v1.getX()-v2.getX(),
                v1.getY()-v2.getY(),v1.getZ()-v2.getZ());
        return product;
    }

    public static Vector[] randomVectors(int N){
        Vector[] vectors = new Vector[N];
        for (int i = 0; i < N; i++) {
            vectors[i] = new Vector(
                    (float) Math.random(),
                    (float) Math.random(),
                    (float) Math.random());
        }
        return vectors;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getZ() {
        return z;
    }
}
