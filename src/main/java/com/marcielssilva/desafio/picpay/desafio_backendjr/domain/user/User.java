package com.marcielssilva.desafio.picpay.desafio_backendjr.domain.user;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity(name = "users")
@Table(name = "users")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
// Lombok irá gerar automaticamente o construtor sem argumentos (NoArgsConstructor)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String document;

    @Column(unique = true)
    private String email;

    private String password;

    private BigDecimal balance;

    // Tipo de dado customizado, pode ser um enum ou outro tipo, dependendo do seu caso
    private UserType userType;  // Caso use um tipo personalizado como UserType ou Enum

    // O Lombok já gera o construtor sem argumentos, então não precisa escrever um manualmente.
}