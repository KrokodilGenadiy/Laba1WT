package Classes;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Samosval2Osi {
    private int Nomer;
    private String Power;
    private String Color;
    private String TypeShini;

    public Samosval2Osi(int nomer, String power, String color, String typeShini) {
        Nomer = nomer;
        Power = power;
        Color = color;
        TypeShini = typeShini;
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

    public String getTypeShini() {
        return TypeShini;
    }

    public void setTypeShini(String typeShini) {
        TypeShini = typeShini;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samosval2Osi that = (Samosval2Osi) o;
        return getNomer() == that.getNomer() &&
                Objects.equals(getPower(), that.getPower()) &&
                Objects.equals(getColor(), that.getColor()) &&
                Objects.equals(getTypeShini(), that.getTypeShini());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomer(), getPower(), getColor(), getTypeShini());
    }
}
