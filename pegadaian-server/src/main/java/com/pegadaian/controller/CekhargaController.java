package com.pegadaian.controller;

import com.pegadaian.domain.Cekharga;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/cekharga")
public class CekhargaController {
    
    @RequestMapping(method = RequestMethod.GET)
    public Cekharga findCekharga() {
        Cekharga a = new Cekharga();
        a.setTanggal(new Date());
        a.setHarga(new BigDecimal("100000.00"));
        
        return a;
    }
}
