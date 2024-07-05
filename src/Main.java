public class Main {
    public static void main(String[] args) {
        // Crear instancia de WeatherStation
        WeatherStation weatherStation = new WeatherStation();

        // Creacion de instancias
        TemperatureDisplay tempDisplay = new TemperatureDisplay();
        WeatherWarning weatherWarning = new WeatherWarning();

        //Estación meteorológica
        weatherStation.addObserver(tempDisplay);
        weatherStation.addObserver(weatherWarning);

        // Cambiar la temperatura
        weatherStation.setTemperature(15);
        weatherStation.setTemperature(50);
        weatherStation.setTemperature(100);
    }
}