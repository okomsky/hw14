public class ServiceStation {

    public void check (CanBeServiced canBeServiced) {
        canBeServiced.service();
    }

    public void checkAll(CanBeServiced[] canBeServiceds) {
        for (CanBeServiced canBeServiced : canBeServiceds) {
            canBeServiced.service();
        }
    }
}