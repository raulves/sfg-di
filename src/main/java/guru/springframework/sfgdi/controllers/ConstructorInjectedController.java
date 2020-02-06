package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {


    private final GreetingService greetingService;

    // @Autowired // Constructor injected dependencies - ei pea Autowired kirjutama, kuna Spring teab seda juba.
    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingService greetingService) { // Qualifier ütleb, millist service kasutada
        // Kui me eemaldame Qualifier annotatsiooni, siis kasutab ta seda service implementatsiooni, millele on pandud @Primary annotatsioon
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
