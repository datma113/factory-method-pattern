package iuh.nctd;

public abstract class Car {
    public abstract String getInfomation();
    public abstract String getConfig();
    public abstract String getColor();
    public abstract String getManufacturer();

    @Override
    public String toString() {
        return "Honda{" +
                "infomation='" + getInfomation() + '\'' +
                ", config='" + getConfig() + '\'' +
                ", color='" + getColor() + '\'' +
                ", manufacturer='" + getManufacturer() + '\'' +
                '}';
    }
}
