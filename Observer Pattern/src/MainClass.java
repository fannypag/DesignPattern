public class MainClass {
    public static void main(String[] args) {
        IObserver conditionsMonitor = new ConditionsMonitor();

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(conditionsMonitor);

        // A change in any values in subject leads to observer triggering updateValue method
        // and printing updated values.
        weatherStation.setPressure(24.0);
        weatherStation.setTemperature(17.0);
        weatherStation.setHumidity(120.0);
    }
}
