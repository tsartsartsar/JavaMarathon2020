package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Warehouse warehouseNew = new Warehouse();
        Picker picker = new Picker(warehouse);
        Picker pickerNew = new Picker(warehouseNew);
        Courier courier = new Courier(warehouse);
        Courier courierNew = new Courier(warehouseNew);

        System.out.println("Деньги сборщика: " + picker.getSalary());
        System.out.println("Деньги доставщика: " + courier.getSalary());
        System.out.println("Деньги склада: " + warehouse.getBalance());
        System.out.println("Собрано заказов: " + warehouse.getCountOrder());

        int count = 0;
        while (count < 10){
            picker.doWork();
            courier.doWork();
            count++;
        }

        System.out.println("");

        System.out.println("Деньги сборщика: " + picker.getSalary());
        System.out.println("Деньги доставщика: " + courier.getSalary());
        System.out.println("Собрано заказов: " + warehouse.getCountOrder());
        System.out.println("Деньги склада: " + warehouse.getBalance());

        System.out.println();

        System.out.println("Деньги сборщика (нов.): " + pickerNew.getSalary());
        System.out.println("Деньги доставщика (нов.): " + courierNew.getSalary());
        System.out.println("Собрано заказов (нов.): " + warehouseNew.getCountOrder());
        System.out.println("Деньги склада (нов.): " + warehouseNew.getBalance());

        pickerNew.doWork();
        courierNew.doWork();

        System.out.println("");

        System.out.println("Деньги сборщика (нов.): " + pickerNew.getSalary());
        System.out.println("Деньги доставщика (нов.): " + courierNew.getSalary());
        System.out.println("Собрано заказов (нов.): " + warehouseNew.getCountOrder());
        System.out.println("Деньги склада (нов.): " + warehouseNew.getBalance());

        System.out.println("");

        System.out.println("Деньги сборщика: " + picker.getSalary());
        System.out.println("Деньги доставщика: " + courier.getSalary());
        System.out.println("Собрано заказов: " + warehouse.getCountOrder());
        System.out.println("Деньги склада: " + warehouse.getBalance());
    }
}
