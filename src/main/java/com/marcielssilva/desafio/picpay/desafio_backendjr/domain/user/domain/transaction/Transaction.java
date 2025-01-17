package com.marcielssilva.desafio.picpay.desafio_backendjr.domain.user.domain.transaction;

import com.marcielssilva.desafio.picpay.desafio_backendjr.domain.user.User;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "transactions")
@Table(name = "transactions")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
// Lombok irá gerar automaticamente o construtor sem argumentos (NoArgsConstructor)
@NoArgsConstructor  // Lombok irá gerar o construtor sem argumentos automaticamente
@AllArgsConstructor // Lombok irá gerar o construtor com todos os parâmetros automaticamente
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;

    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;

    private LocalDateTime timestamp;

    // O Lombok já gera o construtor sem argumentos, então não é necessário um construtor manual
}
