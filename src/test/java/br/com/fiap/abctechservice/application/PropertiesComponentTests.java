package br.com.fiap.abctechservice.application;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PropertiesComponentTests {

    private PropertiesComponet propertiesComponet;

    @BeforeEach
    void setUp(){
        propertiesComponet =  new PropertiesComponet();
    }

    @Test
    void testandoGetName() {
        Assertions.assertNotNull(propertiesComponet.getName());
    }

    @Test
    void testandoGetVersion() {
        Assertions.assertNotNull(propertiesComponet.getVersion());
    }

    @Test
    void testandoGetNameAndVersion() {
        Assertions.assertNotNull(propertiesComponet.getNameAndVersion());
    }
}
