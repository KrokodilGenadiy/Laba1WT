package Classes;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Bortovoy {
    private int Nomer;
    private String Power;
    private String Color;
    private int KPD;

    public Bortovoy(int nomer, String power, String color, int KPD) {
        Nomer = nomer;
        Power = power;
        Color = color;
        this.KPD = KPD;
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

    public int getKPD() {
        return KPD;
    }

    public void setKPD(int KPD) {
        this.KPD = KPD;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bortovoy bortovoy = (Bortovoy) o;
        return getNomer() == bortovoy.getNomer() &&
                getKPD() == bortovoy.getKPD() &&
                Objects.equals(getPower(), bortovoy.getPower()) &&
                Objects.equals(getColor(), bortovoy.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomer(), getPower(), getColor(), getKPD());
    }
}
