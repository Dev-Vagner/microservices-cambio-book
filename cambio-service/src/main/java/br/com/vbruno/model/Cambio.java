package br.com.vbruno.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity(name = "cambio")
public class Cambio implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "from_currency", nullable = false, length = 3)
    private String from;
    @Column(name = "to_currency", nullable = false, length = 3)
    private String to;
    @Column(nullable = false)
    private BigDecimal conversionFactor;
    @Transient
    private BigDecimal convertedValue;
    @Transient
    private String environment;
}
