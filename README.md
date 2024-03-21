# CRUD-Livros

Este é um projeto Spring Boot que implementa as operações básicas de um CRUD (Create, Read, Update, Delete) para um sistema de gerenciamento de livros.

## Funcionalidades

- Criação de novos livros com validação de campos obrigatórios.
- Listagem de todos os livros cadastrados.
- Atualização de informações de um livro existente.
- Exclusão de um livro do sistema.

## Estrutura do Projeto

O projeto está estruturado em diferentes pacotes:

- **com.project.springboot.controllers**: Contém os controladores REST que definem os pontos de extremidade da API e conectam as solicitações HTTP aos métodos de serviço apropriados.
- **com.project.springboot.exception**: Contém a classe de exceção personalizada `LivroException`.
- **com.project.springboot.models**: Contém a classe `LivroModel` que representa a entidade do livro.
- **com.project.springboot.repositories**: Contém a interface `LivroRepository` que define operações de persistência.
- **com.project.springboot.service**: Contém a classe de serviço `LivroService` que lida com a lógica de negócios e a interação com o banco de dados.

## Configuração do Banco de Dados

O projeto está configurado para usar um banco de dados MySQL. As configurações podem ser encontradas no arquivo `application.properties`. Certifique-se de fornecer as credenciais corretas para o banco de dados.

## Execução do Projeto

Para executar o projeto, você pode usar o Maven. Abra um terminal na raiz do projeto e execute o seguinte comando:

```bash
mvn spring-boot:run

Isso iniciará a aplicação Spring Boot.

Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para fazer fork deste repositório, fazer suas alterações e enviar uma solicitação pull. Se você encontrar algum problema ou tiver alguma sugestão, por favor, abra uma issue.

Licença
Este projeto está licenciado sob a Licença MIT.

Este README.md fornece uma visão geral do projeto, suas funcionalidades, estrutura, configuração e instruções para execução. Certifique-se de ajustar as informações conforme necessário para refletir com precisão o seu projeto.

