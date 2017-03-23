package com.star.controller;

import com.star.domain.Plant;
import com.star.repository.PlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by hp on 2017/3/21.
 */
@Controller
public class PlantController {
    @Autowired
    PlantRepository repository;

    @RequestMapping(value = "/find/{category}",produces = "application/json")
    public @ResponseBody List<Plant> findByCategory(@PathVariable("category") String category){
        return repository.findByCategoryOrderByPriceDesc(category);
    }

}
