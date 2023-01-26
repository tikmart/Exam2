public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car("c1",2019, 24000);
        Car c2 = new Car("c2",2011, 30000);
        Car c3 = new Car("c3",2022, 21000);
        Car c4 = new Car("c4",2006, 14000);
        Car c5 = new Car("c5",2019, 30000);
        Car c6 = new Car("c6",2020, 22000);
        Car c7 = new Car("c7",2014, 19000);

        Car[] cars = {c1, c2, c3, c4, c5, c6, c7};

        System.out.println(CarMethods.countByYear(cars));

        Car[] oldCars = CarMethods.oldCars(cars);
    }
}
