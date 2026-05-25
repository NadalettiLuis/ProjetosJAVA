Sistema de Gerenciamento de Revendedora de Veículos 
Este projeto em Java é o motor perfeito para gerenciar o estoque de uma revendedora de veículos. 
Ele oferece uma solução completa para controle de frota, permitindo realizar todas as operações 
essenciais de CRUD (Criar, Ler, Atualizar e Deletar) de forma intuitiva e integrada a um banco de 
dados MySQL.

O sistema foi idealizado para facilitar o dia a dia de concessionárias, organizando o fluxo de 
trabalho em uma interface moderna dividida em abas e permitindo a pré-visualização de ações antes 
de consolidá-las no banco.

## Funcionalidades 
- **Geração sob Demanda:**  Botões dedicados na interface para criar automaticamente o banco de 
dados e as tabelas necessárias com apenas um clique (sem precisar sujar as mãos de graxa!).

- **Gestão Completa (CRUD):**  Sistema robusto para adicionar, buscar, editar e excluir dados 
dos veículos em estoque.

- **Visualização Dinâmica com JTable:**  Os dados são exibidos em tabelas em tempo real. Isso 
permite listar e conferir os veículos na interface antes de confirmar a inserção definitiva no 
banco, além de facilitar a seleção de itens para os processos de busca e exclusão.

- **Navegação em Abas:**  Frontend desenvolvido em JFrame utilizando JPanel dentro de um 
JTabbedPane, separando as operações do sistema em abas organizadas para uma melhor experiência 
do usuário.

## Modelagem do Banco de Dados (MySQL) 
O banco de dados é estruturado para suportar o controle do estoque de automóveis, sendo gerado 
dinamicamente pela própria aplicação. A estrutura principal foca em armazenar as especificações 
de cada automóvel, como:

## Identificador (ID)

- ** Marca e Modelo ** 
- ** Ano de Fabricação ** 
- ** Km Rodados ** 
- ** Placa ** 
- ** Preço ** 

## Tecnologias Utilizadas 
- ** Linguagem: Java (Versão [Ex: 17 / 21]) ** 
- ** Banco de Dados: MySQL Server ** 
- ** Interface Gráfica: Java Swing (componentes JFrame, JPanel, JTabbedPane e JTable) ** 
- ** Driver de Conexão: JDBC (MySQL Connector/J) ** 

## Objetivos de Estudo 
Este projeto foi desenvolvido com o propósito pedagógico de consolidar conceitos importantes 
de desenvolvimento de software desktop:
- Estruturação de interfaces complexas e organizadas utilizando JTabbedPane.
- Sincronização de dados visuais via JTable com ações transacionais no banco de dados.
- Implementação completa do padrão CRUD integrado via JDBC com MySQL.
- Criação e manipulação de esquemas DDL (CREATE DATABASE, CREATE TABLE) diretamente pelo código Java.

##  Como Dar a Partida no Projeto

## Pré-requisitos
Você precisará ter instalado em sua máquina:
- Java JDK (versão utilizada no projeto)
- MySQL Server ativo e rodando localmente (ou em nuvem)

## Passo a Passo
1. Clone este repositório:
  ```Bash
  git clone https://github.com/seu-usuario/seu-repositorio.git
  ```
2. Abra o projeto na sua IDE de preferência (IntelliJ, Eclipse ou NetBeans).
3. Certifique-se de adicionar o driver JDBC do MySQL (.jar) no Build Path / dependências do projeto.
4. Altere as credenciais de acesso ao banco (Usuário e Senha) na sua classe responsável pela conexão
com o MySQL.
5. Execute a classe principal para iniciar o sistema.
- Dica: Utilize os botões de geração na interface para criar o banco e as tabelas na sua primeira 
execução!