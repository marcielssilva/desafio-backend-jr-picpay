package com.marcielssilva.desafio.picpay.desafio_backendjr.service;

import com.marcielssilva.desafio.picpay.desafio_backendjr.domain.user.User;
import com.marcielssilva.desafio.picpay.desafio_backendjr.domain.user.UserType;
import com.marcielssilva.desafio.picpay.desafio_backendjr.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void validateTransaction(User sender, BigDecimal amount) throws Exception {
        if(sender.getUserType() != UserType.MERCHANT){
            throw new Exception("Usuário do tipo Lojista não está autorizado a realizar transação");
        }

        if(sender.getBalance().compareTo(amount) < 0){
            throw new Exception("Usuário está com  Saldo insuficiente");
        }
    }

    public User findUserbyId(Long id) throws Exception {
        return this.repository.findUserById(id).orElseThrow(() -> new Exception("Usuário não encontrato"));
    }

    public void saveUser(User user) {
        this.repository.save(user);
    }
}
