package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String,Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double averageTemperature() {
        double sum = 0;
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            Double temperatureValue = temperature.getValue();
            sum += temperatureValue;
        }
        return sum / temperatures.getTemperatures().size();
    }

    public double medianTemperature() {
        List<Double> onlyTemperatures = new LinkedList<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            Double temperatureValue = temperature.getValue();
            onlyTemperatures.add(temperatureValue);
        }
        Collections.sort(onlyTemperatures);
        double median = 0;

        if (onlyTemperatures.size() % 2 != 0) {
            int size = onlyTemperatures.size();
            int size1 = size - 1;
            int index = size1 / 2;
            median = onlyTemperatures.get(index);
        } else {
            int size = onlyTemperatures.size();
            int index1 = size / 2;
            int index2 = index1 -1;
            double median1 = onlyTemperatures.get(index1);
            double median2 = onlyTemperatures.get(index2);
            median = (median1 + median2) / 2.0;
        }
        return median;
    }
}
