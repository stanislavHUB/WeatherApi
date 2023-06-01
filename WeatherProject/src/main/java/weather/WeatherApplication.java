package weather;

import weather.api.OpenWeatherMapApiConnector;
import org.json.JSONObject;

import java.io.IOException;

public class WeatherApplication {
    public static void main(String[] args) {
        String apiKey = "4f18a8162af1572e4d388a0068033b6d";
        OpenWeatherMapApiConnector connector = new OpenWeatherMapApiConnector(apiKey);

        try {
            JSONObject weatherData = connector.getWeatherForCity("Lviv");
            System.out.println(weatherData);

            System.out.println("================================================================");

            // Витягуємо країну
            JSONObject country = weatherData.getJSONObject("sys");
            String countryName = country.getString("country");
            System.out.println("Країна: " + countryName);

            // Витягуємо назву
            String cityName = weatherData.getString("name");
            System.out.println("Назва міста: " + cityName);

            // Витягуємо значення температури
            double temperature = weatherData.getJSONObject("main").getDouble("temp");
            System.out.printf("Температура: %.1f градусів Цельсія%n", temperature);

            // Витягуємо значення мінімальної температури
            double min_temperature = weatherData.getJSONObject("main").getDouble("temp_min");
            System.out.printf("Мінімальна Температура: %.1f градусів Цельсія%n", min_temperature);

            // Витягуємо значення Максимальної температури
            double max_temperature = weatherData.getJSONObject("main").getDouble("temp_max");
            System.out.printf("Максимальна Температура: %.1f градусів Цельсія%n", max_temperature);

            // Витягуємо значення як відчувається
            double feels_like = weatherData.getJSONObject("main").getDouble("feels_like");
            System.out.printf("Відчувається як: %.1f градусів Цельсія%n", feels_like);

            // Витягуємо значення вологості
            int humidity = weatherData.getJSONObject("main").getInt("humidity");
            System.out.printf("Вологість: %d%%%n", humidity);

            // Витягуємо значення тиску
            int pressure = weatherData.getJSONObject("main").getInt("pressure");
            System.out.printf("Тиск: %d гПа%n", pressure);

            // Витягуємо опис погоди
            String description = weatherData.getJSONArray("weather").getJSONObject(0).getString("description");
            System.out.println("Опис погоди: " + description);

            // Витягуємо інформацію про вітер
            double windSpeed = weatherData.getJSONObject("wind").getDouble("speed");
            System.out.printf("Швидкість вітру: %.1f м/с%n", windSpeed);

            int windDirection = weatherData.getJSONObject("wind").getInt("deg");
            System.out.printf("Напрямок вітру: %d градусів%n", windDirection);

            // Витягуємо інформацію про хмарність
            int cloudiness = weatherData.getJSONObject("clouds").getInt("all");
            System.out.printf("Хмарність: %d%%%n", cloudiness);

            // Витягуємо інформацію про сонце
            JSONObject sysData = weatherData.getJSONObject("sys");
            String sunrise = getTimeFromUnixTimestamp(sysData.getLong("sunrise"));
            String sunset = getTimeFromUnixTimestamp(sysData.getLong("sunset"));
            System.out.println("Схід сонця: " + sunrise);
            System.out.println("Захід сонця: " + sunset);

            // Витягуємо інформацію про координати міста
            JSONObject cordData = weatherData.getJSONObject("coord");
            double latitude = cordData.getDouble("lat");
            double longitude = cordData.getDouble("lon");
            System.out.printf("Координати: %.2f°N, %.2f°E%n", latitude, longitude);
            System.out.println("================================================================");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getTimeFromUnixTimestamp(long timestamp) {
        return java.time.Instant.ofEpochSecond(timestamp).toString();
    }

}
