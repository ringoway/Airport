public class Airport { //suppose the airport in Moscow
    public static void main(String[] args) {
        Airplane airport = new Airplane(1, "Боинг-707", 289, 26000);
        airport.toCity("Kazan");
        airport.toCity("Ufa");
    }
}