package nl.craftsmen.headquarterservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class PriceRestController {

    @GetMapping("/prices/{productName}")
    public PriceModel getPrice(@PathVariable String productName) {
        return PriceModel.builder().price(BigDecimal.ONE).build();
    }

}
