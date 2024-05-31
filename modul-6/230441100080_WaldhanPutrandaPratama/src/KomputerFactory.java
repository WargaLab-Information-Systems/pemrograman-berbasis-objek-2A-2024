public class KomputerFactory {
    public Komputer createKomputer(String type) {
        switch (type.toLowerCase()) {
            case "pc":
                return new PC();
            case "laptop":
                return new Laptop();
            case "netbook":
                return new Netbook();
            default:
                return null;
        }
    }
}
