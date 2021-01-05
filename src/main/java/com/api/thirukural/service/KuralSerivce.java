package com.api.thirukural.service;

import com.api.thirukural.model.Kural;
import com.api.thirukural.repo.KuralRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.AccessType;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KuralSerivce {
    @Autowired
    private KuralRepo kuralRepo;


    public List<Kural> getAll() {
             return  kuralRepo.findAll();
    }
    public Kural getByNumber(int number){
        return kuralRepo.findByNumber(number);
    }
}
