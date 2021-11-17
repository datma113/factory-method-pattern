package iuh.nctd;

public class CarFactory {
    public static Car getCar(String type, String information, String config, String color, String manufacturer) {
        if (type.equalsIgnoreCase("Toyota")) return new Toyota(information, config, color, manufacturer);
        if (type.equalsIgnoreCase("Honda")) return new Honda(information, config, color, manufacturer);
        if (type.equalsIgnoreCase("Lexus")) return new Lexus(information, config, color, manufacturer);

        return null;
    }
}
