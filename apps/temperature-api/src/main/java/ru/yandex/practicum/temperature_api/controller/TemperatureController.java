package ru.yandex.practicum.temperature_api.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.temperature_api.TemperatureResponse;

import java.util.Optional;
import java.util.Random;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {
    private final static ObjectMapper objectMapper = new ObjectMapper();
    private final static Random random = new Random();

    @GetMapping("/{id}")
    public String getTemperatureById(@PathVariable("id") Optional<String> sensorId, @RequestParam("location") Optional<String> location) throws Exception {
        TemperatureResponse response = new TemperatureResponse();
        response.setValue(random.nextDouble(100) - 50);
        return objectMapper.writeValueAsString(response);
    }

    @GetMapping
    public String getTemperature(@RequestParam("location") Optional<String> location) throws Exception {
        TemperatureResponse response = new TemperatureResponse();
        response.setValue(random.nextDouble(100) - 50);
        return objectMapper.writeValueAsString(response);
    }
}

