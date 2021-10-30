package guruqa.andreikuzn;

public class Types {
    public static void main(String[] args) {
        Parcel s = new Parcel();
        Parcel m = new Parcel();
        Parcel l = new Parcel();

        s.weight = 75;
        s.width = 25;
        s.depth = 20;
        s.length = 30;
        s.type = "S";

        m.weight = 90;
        m.width = 35;
        m.depth = 30;
        m.length = 25;
        m.type = "M";

        l.weight = 120;
        l.width = 45;
        l.depth = 40;
        l.length = 35;
        l.type = "L";

        s.printParcelDimensions();
        m.printParcelDimensions();
        l.printParcelDimensions();
    }
}
