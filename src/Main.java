public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("MyBike", 2);
        int wheelsCount = bicycle.getWheelsCount();
        String modelName = bicycle.getModelName();
        bicycle.setWheelsCount(3);
        bicycle.setModelName("NewBike");
        bicycle.updateTyre();
    }
}