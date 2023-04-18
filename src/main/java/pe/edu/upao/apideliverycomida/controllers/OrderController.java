package pe.edu.upao.apideliverycomida.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upao.apideliverycomida.models.Food;

import java.util.ArrayList;
import java.util.List;

@RestController

@RequestMapping("/orders")
public class OrderController {

    @GetMapping("/foods")
    public ResponseEntity<ArrayList<Food>> getAllOrders(){
        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Food( "Arroz con Pollo",  "Plato de arroz verde acompañado de pollo",  12.0 ));
        foods.add(new Food( "Ceviche",  "Pescadito fresco",  35.0 ));
        return ResponseEntity.ok(foods);
    }
}
