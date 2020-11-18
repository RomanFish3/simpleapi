package ru.mtuci.simpleapi.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Payer extends AbstractBaseEntity {
    @NotBlank

    private String name;
    @NotBlank

    private String number;
    @NotNull

    private Integer pin;
    @NotNull

    private String type;
}
