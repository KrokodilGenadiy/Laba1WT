package Classes;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Samosval3Osi {
    private int Nomer;
    private String Power;
    private String Color;
    private String TypeKusova;

    public Samosval3Osi(int nomer, String power, String color, String typeKusova) {
        Nomer = nomer;
        Power = power;
        Color = color;
        TypeKusova = typeKusova;
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

    public String getTypeKusova() {
        return TypeKusova;
    }

    public void setTypeKusova(String typeKusova) {
        TypeKusova = typeKusova;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samosval3Osi that = (Samosval3Osi) o;
        return getNomer() == that.getNomer() &&
                Objects.equals(getPower(), that.getPower()) &&
                Objects.equals(getColor(), that.getColor()) &&
                Objects.equals(getTypeKusova(), that.getTypeKusova());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomer(), getPower(), getColor(), getTypeKusova());
    }

}
