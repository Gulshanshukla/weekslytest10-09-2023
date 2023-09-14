package org.geekster;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ApiController {
    @GetMapping("name")
    public Car getcolor()
    {
        Car c1=new Car("golden");
       // String value="gulshan";
        MailHandlerBase.sendMail(c1.toString());
        return c1;
    }
}
