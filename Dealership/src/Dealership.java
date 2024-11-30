public class Dealership {
    
    private Car[] cars;

    public Dealership(Car[] cars) {
        
        this.cars = new Car[cars.length];
        
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car(cars[i]);
        }

    }

    // miss referencing -> defensive / deep copying, yang bertujuan untuk mencegah modifikasi langsung 
    // pada data internal kelas (car object) oleh kode di luar kelas.
    public Car getCar(int idx) {
        Car copy = new Car(this.cars[idx]); 
        return copy;
    }

    public void setCar(int idx, Car newCar) {
        Car copy = new Car(newCar);
        this.cars[idx] = copy;
    }

    public void sell(int idx) {
        this.cars[idx].drive();
    }

    public String toString() {
        
        String tmp = "";
        
        for (int i = 0; i < this.cars.length; i++) {
            tmp += "Spot: " + (i+1) + "\n";
            String carDesc = this.cars[i].toString();
            tmp += carDesc + "\n";
        }
        
        return tmp;
    
    }

}
