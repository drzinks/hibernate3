package com.drzinks.server;

import com.drzinks.server.model.Car;
import com.drzinks.server.model.Motorcycle;
import com.drzinks.server.model.Vehicle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Michal on 2017-04-23.
 */
@Controller
public class WelcomeController {


    @RequestMapping("/")
    public String welcomePage(Model model) {
        model.addAttribute("name", "Michal");
        model.addAttribute("vehicles", getVehicles());
        return "index";
    }

    private List<Vehicle> getVehicles(){
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car().setDescription("Audi A4 B7"));
        vehicles.add(new Motorcycle().setDescription("Kawasaki 500"));
        return vehicles;
    }

}
