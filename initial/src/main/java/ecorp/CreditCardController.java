package ecorp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecorp")
public class CreditCardController {

    @RequestMapping(value = "/fakeCreditCard/{day}", method = RequestMethod.GET)
    public ResponseEntity<String> getNumberOfFakeCards(@PathVariable final Integer day) {
        return new ResponseEntity<>("Number of faked cards on day " + day + ": "
                + CreditCardHandler.calculatefakeCards(day), HttpStatus.OK);
    }

}
