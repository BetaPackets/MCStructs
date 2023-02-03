package net.lenni0451.mcstructs.nbt.tags;

import net.lenni0451.mcstructs.nbt.INbtNumber;
import net.lenni0451.mcstructs.nbt.INbtTag;
import net.lenni0451.mcstructs.nbt.NbtType;

import java.util.Objects;

public class ShortTag implements INbtNumber {

    private short value;

    /**
     * Create a short tag with the value 0.
     */
    public ShortTag() {
        this((short) 0);
    }

    /**
     * Create a short tag with the given value.
     *
     * @param value The value
     */
    public ShortTag(final short value) {
        this.value = value;
    }

    /**
     * @return The short value
     */
    public short getValue() {
        return this.value;
    }

    /**
     * Set the short value.
     *
     * @param value The new value
     */
    public void setValue(final short value) {
        this.value = value;
    }

    @Override
    public byte byteValue() {
        return (byte) (this.value & 0xFF);
    }

    @Override
    public short shortValue() {
        return this.value;
    }

    @Override
    public int intValue() {
        return this.value;
    }

    @Override
    public long longValue() {
        return this.value;
    }

    @Override
    public float floatValue() {
        return this.value;
    }

    @Override
    public double doubleValue() {
        return this.value;
    }

    @Override
    public Number numberValue() {
        return this.value;
    }

    @Override
    public NbtType getNbtType() {
        return NbtType.SHORT;
    }

    @Override
    public INbtTag copy() {
        return new ShortTag(this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortTag shortTag = (ShortTag) o;
        return value == shortTag.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "short(" + this.value + ")";
    }

}
