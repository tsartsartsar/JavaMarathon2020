package day11.task1;

public class Picker implements Worker{
    private int salary;
    private Warehouse warehouse;

    public int getSalary() {
        return salary;
    }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Picker " +
                "salary = " + salary;
    }

    @Override
    public void doWork() {
        salary += 80;
        warehouse.setCountOrder(warehouse.getCountOrder() + 1);
    }

    @Override
    public void bonus() {
        if (warehouse.getCountOrder() >= 1500){
            salary = salary * 3;
            warehouse.setCountOrder(warehouse.getCountOrder() - 1500);
        }
    }
}
