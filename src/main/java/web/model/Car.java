package web.model;

public class Car {
    private String manufacturer;
    private String series;
    private String licensePlate;

    public Car() {

    }

    public Car(String manufacturer, String series, String licensePlate) {
        this.manufacturer = manufacturer;
        this.series = series;
        this.licensePlate = licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String model) {
        this.manufacturer = model;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return manufacturer + " " + series + " " + licensePlate;
    }
}
