package net.lenni0451.mcstructs.text.components;

import net.lenni0451.mcstructs.text.ATextComponent;

import java.util.Objects;

public class ScoreComponent extends ATextComponent {

    private final String name;
    private final String objective;

    private String value;

    public ScoreComponent(final String name, final String objective) {
        this.name = name;
        this.objective = objective;
    }

    public String getName() {
        return this.name;
    }

    public String getObjective() {
        return this.objective;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(final String value) {
        this.value = value;
    }

    @Override
    public String asSingleString() {
        return this.value;
    }

    @Override
    public ATextComponent copy() {
        ScoreComponent copy = new ScoreComponent(this.name, this.objective);
        copy.value = this.value;
        return this.putMetaCopy(copy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoreComponent that = (ScoreComponent) o;
        return Objects.equals(getSiblings(), that.getSiblings()) && Objects.equals(getStyle(), that.getStyle()) && Objects.equals(name, that.name) && Objects.equals(objective, that.objective) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSiblings(), getStyle(), name, objective, value);
    }

    @Override
    public String toString() {
        return "ScoreComponent{" +
                "siblings=" + getSiblings() +
                ", style=" + getStyle() +
                ", name='" + name + '\'' +
                ", objective='" + objective + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

}
