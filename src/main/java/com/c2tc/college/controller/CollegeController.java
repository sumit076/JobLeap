package com.c2tc.college.controller;

import com.c2tc.college.model.College;
import com.c2tc.college.service.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/college")
public class CollegeController {
    @Autowired
    private CollegeService service;

    @PostMapping("")
    public College addProduct(@RequestBody College college) {
        return service.saveCollege(college);
    }

    @GetMapping("/getproductbyid/{id}")
    public Optional<College> findProductById(@PathVariable long id) {
        return service.getCollegeById(id);
    }

    @DeleteMapping("/deleteproduct/{id}")
    public String deleteProduct(@PathVariable long id) {
        return service.deleteCollege(id);
    }

    @PutMapping("/update")
    public College updateProduct(@RequestBody College college) {
        return service.updateCollege(college);
    }

}
