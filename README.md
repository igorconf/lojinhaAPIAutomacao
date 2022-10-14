# Lojinha API Automação
Esse é um projeto que contém a automação de alguns testes de API Rest de um software denominado Lojinha. Os sub-tópicos abaixo descrevem algumas decisões tomadas na estruturação do projeto.
## Tecnologias Utilizadas
- Java (https://www.oracle.com/br/java/technologies/downloads/)
- JUnit (https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api/5.8.0-M1)
- RestAssured (https://mvnrepository.com/artifact/io.rest-assured/rest-assured/4.4.0)
- Maven (https://maven.apache.org)

## Testes Automatizados
Testes para validar as partições de equivalência ao valor do produto da Lojinha, que estão vinculadas a regra de negócio que diz que o valor do produto deve estar entre R$ 0,01 e R$ 7.000,00.

## Notas gerais
- Sempre utilizamos a anotação Before Each para capturar o token que será utilizado posteriormente nos métodos de teste.
- Armazenamos os dados que são enviados para a API através do uso de classes POJO
- Criamos dados inicais através do uso de classe Data Factory, para facilitar a criação e controle dos mesmos
- Nesse projeto fazemos uso do JUnit 5, o que nos dá a possibilidade de usar a anotação Display Nome para dar descrições em português para nossos testes.