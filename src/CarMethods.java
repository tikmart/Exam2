public class CarMethods {
    public static int countByYear(Car[] cars){
        int count = 0;
        for (Car c : cars){
            if (c.getYear() >= 2018 && c.getPrice() < 25000)
                count++;
        }

        return count;
    }


    public static Car[] oldCars(Car[] cars){
        int oldCount = 0;

        for (Car c : cars){
            if (c.getYear() < 2015)
                oldCount++;
        }

        Car[] oldCars = new Car[oldCount];

        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < oldCars.length; j++) {
                if (cars[i].getYear() < 2015)
                    oldCars[j] = cars[i];
            }
        }
        return oldCars;
    }
}
