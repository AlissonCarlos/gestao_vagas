package br.com.acelera.gestao_vagas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.UUID;
import jakarta.validation.constraints.Email;

@Data
@Entity(name="Canditado")
public class CandidatoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String userName;
    @Email(message = "O campo e-mail deve conter um e-mail valido")
    private String email;
    private String senha;
    private String descricao;
    private String curriculum;
}
