package com.api.products.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity // Indica que essa classe é uma entidade que será mapeada para uma tabela no banco de dados.
@Table(name = "products_db") // Define explicitamente o nome da tabela no banco que essa entidade representa (products_db).
@Getter // Lombok gera automaticamente os métodos get para todos os campos da classe.
@Setter // Lombok gera automaticamente os métodos set para todos os campos da classe.

public class ProductsModel { // Declaração da classe pública chamada ProductsModel.

    @Id // Marca o campo abaixo como chave primária da tabela.
    @GeneratedValue(strategy = GenerationType.IDENTITY)// Define que o valor do ID será gerado automaticamente pelo banco, usando estratégia de incremento (auto-increment).
    private Long id;// Campo privado do tipo Long que representa o identificador único do produto.

    private String name; // Campo privado que armazena o nome do produto.
    private String brand; // Campo privado que armazena a marca do produto.
}