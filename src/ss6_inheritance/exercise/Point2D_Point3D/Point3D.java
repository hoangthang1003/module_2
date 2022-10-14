package ss6_inheritance.exercise.Point2D_Point3D;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x , float y , float z) {
        super.setXY(x,y);
        this.z = z;
    }
    public float[] getXYZ() {
        super.getXY();
        return new float[]{getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +"\n"+Arrays.toString(getXYZ()) +
                '}';
    }
}
