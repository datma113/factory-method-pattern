package iuh.nctd;

public class Lexus extends Car {
    private String infomation;
    private String config;
    private String color;
    private String manufacturer;

    public Lexus(String infomation, String config, String color, String manufacturer) {
        this.infomation = infomation;
        this.config = config;
        this.color = color;
        this.manufacturer = manufacturer;
    }

    @Override
    public String getInfomation() {
        return infomation;
    }

    @Override
    public String getConfig() {
        return config;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }
}
