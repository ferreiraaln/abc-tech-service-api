package br.com.fiap.abctechservice.controller;

import br.com.fiap.abctechservice.application.PropertiesComponet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HealthCheckController {

    @Autowired
    private PropertiesComponet propertiesComponet;

    @GetMapping()
    public ResponseEntity<String> status(){
        return ResponseEntity.ok("sucesso");
    }

    @GetMapping("version")
    public ResponseEntity<String> version(){
        return ResponseEntity.ok(this.propertiesComponet.getNameAndVersion());
    }
}
