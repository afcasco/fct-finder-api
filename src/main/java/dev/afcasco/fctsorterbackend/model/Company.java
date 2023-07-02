package dev.afcasco.fctsorterbackend.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "Autogenerated value", example = "1")
    private Long id;
    @Schema(description = "Company identification document", example = "B5555555")
    @NotBlank
    private String cif;
    @Schema(description = "Company name",example = "Compu-Global-Hyper-Mega-Net")
    @NotBlank
    private String name;
    @Schema(description = "Includes street, number and/or building name...", example = "742 Evergreen Terrace")
    @NotBlank
    private String address;
    @Schema(description = "City name", example = "Springfield")
    @NotBlank
    private String city;
    @Schema(description = "Zip code number",example = "80085")
    @NotBlank
    private String zipCode;
    @Schema(description = "Mobile/office telephone number", example = "555-6528")
    @NotBlank
    private String phone;
    @Schema(description = "Current registered status", example = "ACTIVE")
    @Enumerated(EnumType.STRING)
    private Status status;
}