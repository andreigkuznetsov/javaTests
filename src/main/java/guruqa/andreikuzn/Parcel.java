package guruqa.andreikuzn;

public class Parcel {
    int weight;
    int length;
    int width;
    int depth;
    String type;

    public void printParcelDimensions() {
        System.out.println("Посылка "+type+" имеет максимальные размеры "+length+"x"
                +width+"x"+depth+" и максимальный вес "+weight);
    }
}
