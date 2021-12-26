package module_java_basic2;

public class NumberHolder {
    private int anInt;
    private float aFloat;

    public void setAnInt(int anInt) {
        this.anInt = anInt * 2;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }


    public NumberHolder() {
    }

    public int getAnInt() {
        return anInt;
    }

    public float getaFloat() {
        return aFloat;
    }
}


