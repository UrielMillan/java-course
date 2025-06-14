package collections.challenges.challenge1;

import java.util.Date;

public class Fly {
    private String flyCode;
    private String fromCountry;
    private String toCountry;
    private Date arrivedDate;
    private int passengers;

    public Fly(String flyCode, String fromCountry, String toCountry, Date arrivedDate, int passengers) {
        this.flyCode = flyCode;
        this.fromCountry = fromCountry;
        this.toCountry = toCountry;
        this.arrivedDate = arrivedDate;
        this.passengers = passengers;
    }

    public Fly() {
    }

    public String getFlyCode() {
        return flyCode;
    }

    public void setFlyCode(String flyCode) {
        this.flyCode = flyCode;
    }

    public String getFromCountry() {
        return fromCountry;
    }

    public void setFromCountry(String fromCountry) {
        this.fromCountry = fromCountry;
    }

    public String getToCountry() {
        return toCountry;
    }

    public void setToCountry(String toCountry) {
        this.toCountry = toCountry;
    }

    public Date getArrivedDate() {
        return arrivedDate;
    }

    public void setArrivedDate(Date arrivedDate) {
        this.arrivedDate = arrivedDate;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    @Override
    public String toString() {
        return
                "Vuelo: " + flyCode + '\'' +
                ", De: '" + fromCountry + '\'' +
                ", Para: " + toCountry + '\'' +
                ", Hora: " + arrivedDate +
                ", Pasajeros: " + passengers ;
    }
}
