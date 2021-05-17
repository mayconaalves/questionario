package br.com.aprendizado.funcionalidade.exemplo.entidade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Exemplo {
    private Integer id;
    private String nome;
    private String mensagem;
}
