# Sistema de Gerenciamento de Notas Fiscais e Itens

Este projeto em Java realiza a criação automatizada de um banco de dados MySQL e das tabelas 
estruturais necessárias para gerenciar a emissão de notas fiscais e seus respectivos itens de venda. 

O sistema foi idealizado para resolver problemas de pequenos comércios, permitindo salvar informações 
de vendas de forma estruturada para possibilitar futuras impressões de cupons ou notas fiscais.

## Funcionalidades

- **Criação Automatizada:** Geração automática do banco de dados e tabelas ao iniciar a aplicação.
- **Interface Visual Dinâmica:** Exibição dos produtos em uma tabela Java (`JTable`) em tempo real antes 
da confirmação do cadastro no banco de dados.
- **Regra de Negócio Customizada:** Controle de inserção de IDs de itens gerenciado diretamente pela aplicação 
Java (substituindo o padrão `AUTO_INCREMENT` do SQL para fins de estudo de lógica).
- **Gerenciamento de Vendas:** Vínculo relacional direto entre a nota fiscal gerada e os itens que a compõem.

## Modelagem do Banco de Dados (MySQL)

O banco de dados é composto por duas tabelas principais fortemente relacionadas:

1. **`NOTAS`**: Armazena os dados gerais da venda.
2. **`ITEMNOTA`**: Armazena as mercadorias que pertencem a cada nota fiscal.

## Tecnologias Utilizadas

- **Linguagem:** Java (Versão [Ex: 17 / 21])
- **Banco de Dados:** MySQL Server
- **Interface Gráfica:** Java Swing / AWT (componentes de tabela)
- **Driver de Conexão:** JDBC (MySQL Connector/J)

## Objetivos de Estudo

Este projeto foi desenvolvido com o propósito pedagógico de consolidar conceitos importantes de desenvolvimento de software:
- Integração prática entre Java e Banco de Dados Relacional via JDBC.
- Manipulação e sintaxe de queries de inserção SQL (`INSERT INTO`).
- Manipulação de arrays, coleções (`List`) e estruturas de dados em memória.
- Sincronização de dados entre arrays internos e componentes visuais de tabela.

## Como Executar o Projeto

### Pré-requisitos
Você precisará ter instalado em sua máquina:
- Java JDK (versão utilizada no projeto)
- MySQL Server ativo

### Passo a Passo
1. Clone este repositório:
   ```bash
   git clone https://github.com
   ```
2. Abra o projeto na sua IDE de preferência (IntelliJ, Eclipse ou NetBeans).
3. Certifique-se de adicionar o driver JDBC do MySQL (.jar) nas dependências do projeto.
4. Altere as credenciais de acesso ao banco (Usuário e Senha) na sua classe de conexão (`Conexão.java` ou similar).
5. Execute a classe principal para iniciar o sistema.
