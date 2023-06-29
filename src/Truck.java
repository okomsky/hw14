public class Truck extends TransportWithEngine {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.service();
        checkTrailer();
    }
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}