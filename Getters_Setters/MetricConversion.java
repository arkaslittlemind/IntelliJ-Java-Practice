package Getters_Setters;


class Metrics {
    private String Centimetres;
    private String Metres;
    private String Litres;
    private String Millilitres;

    public Metrics(String Centimetres, String Metres, String Litres, String Millilitres) {
        this.Centimetres = Centimetres;
        this.Metres = Metres;
        this.Litres = Litres;
        this.Millilitres = Millilitres;
    }

    public String getCentimetres() {
        return Centimetres;
    }

    public void setCentimetres(String centimetres) {
        Centimetres = centimetres;
    }

    public String getMetres() {
        return Metres;
    }

    public void setMetres(String metres) {
        Metres = metres;
    }

    public String getLitres() {
        return Litres;
    }

    public void setLitres(String litres) {
        Litres = litres;
    }

    public String getMillilitres() {
        return Millilitres;
    }

    public void setMillilitres(String millilitres) {
        Millilitres = millilitres;
    }

    public double conversion() {
        int i = Integer.parseInt(Metres);
        return i * 39.37;
    }
}
public class MetricConversion {
    public static void main(String[] args) {

        Metrics m = new Metrics("100","12", "1000", "1" );

        System.out.println("Metre to Inch conversion: " + m.conversion());
    }
}
