package Classes;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Tiagach {
    private int Nomer;
    private String Power;
    private String Color;
    private String LoadCapacity;

    public Tiagach(int nomer, String power, String color, String loadCapacity) {
        Nomer = nomer;
        Power = power;
        Color = color;
        LoadCapacity = loadCapacity;
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

    public String getLoadCapacity() {
        return LoadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        LoadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiagach tiagach = (Tiagach) o;
        return getNomer() == tiagach.getNomer() &&
                Objects.equals(getPower(), tiagach.getPower()) &&
                Objects.equals(getColor(), tiagach.getColor()) &&
                Objects.equals(getLoadCapacity(), tiagach.getLoadCapacity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomer(), getPower(), getColor(), getLoadCapacity());
    }
}
