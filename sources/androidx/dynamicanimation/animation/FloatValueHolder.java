package androidx.dynamicanimation.animation;

public final class FloatValueHolder {
    private float mValue = 0.0f;

    public float getValue() {
        return this.mValue;
    }

    public void setValue(float f) {
        this.mValue = f;
    }

    public FloatValueHolder() {
    }

    public FloatValueHolder(float f) {
        setValue(f);
    }
}