package ru.koryakin.dbwithoutmigration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.koryakin.dbwithoutmigration.repository.OrderDao;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    OrderDao orderDao;

    @GetMapping("/products/fetch-product")
    public List<String> getProducts(@RequestParam("name") String name) {
        return orderDao.getProductName(name);
    }
}
