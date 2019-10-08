package Classes;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Tesla {
    private int Nomer;
    private String Power;
    private String Color;
    private int KPD;

    public Tesla(int nomer, String power, String color, int KPD) {
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
        Tesla tesla = (Tesla) o;
        return getNomer() == tesla.getNomer() &&
                getKPD() == tesla.getKPD() &&
                Objects.equals(getPower(), tesla.getPower()) &&
                Objects.equals(getColor(), tesla.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNomer(), getPower(), getColor(), getKPD());
    }

  /**  @Override
    public ObjectCreator Create() {
        return new Tesla(1,"200","зелёный", 80 );
    }**/
}
