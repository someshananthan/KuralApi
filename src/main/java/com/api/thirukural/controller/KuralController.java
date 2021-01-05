package com.api.thirukural.controller;

import com.api.thirukural.model.Kural;
import com.api.thirukural.service.KuralSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kural")
public class KuralController {

    private KuralSerivce serivce;
    @Autowired
    public KuralController(KuralSerivce serivce) {
        this.serivce = serivce;
    }

    @GetMapping("/getAll")
    public List<Kural> getAll(){
      return   serivce.getAll();
    }


    @GetMapping("/{id}")
    public Kural getByNumber(@PathVariable("id") int id){
        return serivce.getByNumber(id);
    }
}
