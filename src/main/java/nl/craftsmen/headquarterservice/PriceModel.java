package nl.craftsmen.headquarterservice;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class PriceModel {

    private BigDecimal price;
}
