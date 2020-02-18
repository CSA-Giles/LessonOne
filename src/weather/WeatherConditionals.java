package weather;

public class WeatherConditionals {

    public static String getWeatherAdvice(int temperature, String description) {
        boolean windy = false;

        if (description.indexOf("windy") <= 0 && temperature == 32) {
            windy = true;
            return "32 degrees and heavy snow";
        }
        else if (temperature > 100 && description.equals("snow")) {
            return ("That's implausible bud");
        }
    }
}