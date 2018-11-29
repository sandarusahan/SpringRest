package demo.sahan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    User user = new User();

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public User index() {

        user.setId("1");
        user.setName("Sahan");
        user.setAge(23);

        return user;
    }

}
