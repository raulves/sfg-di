package guru.springframework.sfgdi.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary  // Kõik controllerid, kes kasutavad GreetingService ja kui neil ei ole eraldi öeldud Qualifier -ga millist service implementatsiooni kasutada, siis kasutavad nad seda impl. millel Primary annotatsioon.
@Service
public class PrimaryGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - From the PRIMARY Bean";
    }
}
