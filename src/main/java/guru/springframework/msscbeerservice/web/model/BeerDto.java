package guru.springframework.msscbeerservice.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDto {
    @Null
    private UUID ID;

    @Null
    private Integer version;

    //@Null does not allow set the value from outside
    @NotNull
    private OffsetDateTime createdDate;

    @NotNull
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    private  String beerName;

    @NotNull
    private BeerStyleEnum beerStyle;

    @Positive
    @NotNull
    private  long upc;

    @Positive
    @NotNull
    private BigDecimal price;

    private Integer quantityOnHand;



}
