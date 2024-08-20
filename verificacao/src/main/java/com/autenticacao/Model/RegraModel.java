package com.autenticacao.Model;

import com.autenticacao.Enum.RegrasEnum;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Regras")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RegraModel {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    @Enumerated(EnumType.STRING)
    private RegrasEnum tipo;
    


}
