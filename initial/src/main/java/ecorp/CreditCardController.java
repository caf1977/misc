package ecorp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecorp")
public class CreditCardController {

    @RequestMapping(value = "/fakeCreditCard/{day}", method = RequestMethod.GET)
    public String getNumberOfFakeCards(@PathVariable final Integer day) {
        return "Number of faked cards on day " + day + ": " + CreditCardHandler.calculatefakeCards(day);
    }

}
