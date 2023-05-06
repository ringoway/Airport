public class Airplane {
    private int number;
    private String model;
    private int passengerCapacity;
    private int consumption; //fuel consumption per hour (measured in kg/h)
    private double priceConsumption = 37.50; //price for 1 kg



    public Airplane(int number, String model, int passengerCapacity, int consumption) {
        this.number = number;
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.consumption = consumption;

    }
    public void toCity(String city){
        switch (city) {
            case "Ufa": System.out.println("fuel consumption to this city "+consumption*2.1);
            break;
            case "Kazan": System.out.println("fuel consumption to this city "+consumption*2.5);
            break;
            case "St.Petersburg": System.out.println("fuel consumption to this city "+consumption*1.8+"");
            break;
        }

    }
}
