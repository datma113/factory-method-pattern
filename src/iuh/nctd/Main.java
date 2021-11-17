package iuh.nctd;

public class Main {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("pc","2 GB","500GB","2.4 GHz");
        Computer server = ComputerFactory.getComputer("server","16  GB","1 TB","2.9 GHz");
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);


        Car honda = CarFactory.getCar("Honda", "car honda", "none", "red", "JPN");
        Car lexus = CarFactory.getCar("Lexus", "car lexxus", "none", "red", "JPN");
        Car toyota = CarFactory.getCar("Toyota", "car toyota", "none", "red", "JPN");
        System.out.println(honda);
        System.out.println(lexus);
        System.out.println(toyota);
    }
}
