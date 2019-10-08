package Classes;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Samosval {
    private int Nomer;
    private String Power;
    private String Color;

    public Samosval(int nomer, String power, String color) {
        Nomer = nomer;
        Power = power;
        Color = color;
    }

    public int getNomer() {
        return Nomer;
    }

    public void setNomer(int nomer) {
        Nomer = nomer;
    }

    public String getPower() {
        return Power;
    }

    public void setPower(String power) {
        Power = power;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samosval samosval = (Samosval) o;
        return getNomer() == samosval.getNomer() &&
                Objects.equals(getPower(), samosval.getPower()) &&
                Objects.equals(getColor(), samosval.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomer(), getPower(), getColor());
    }
}
