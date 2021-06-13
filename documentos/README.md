# Aula de Desenvolvimento de Aplicações WEB 
# Roteiro – Desenvolvimento de Aplicações para WEB – 2020/2 (2021)

## 1 - Apresentação da disciplina: Plano de Ensino – Conteúdos – Metodologia – Avaliações
	* Vide Plano de Ensino; Planejamento da Disciplina; documento Conteúdos

- [Conteúdo do Curso](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/Conteúdo_Aula_DSW_Módulo_I.pdf)

### 1.1 Conteúdos

1.1.1. API 

1.1.2. REST 

1.1.3. Protocolo HTTP

1.1.4. Ecossistema Spring

1.1.5. O padrão MVC

1.1.6. ORM

1.1.7. Camadas 

1.1.8. Segurança

1.1.9. Consumo de APIs

1.1.10. Frontend

1.1.11. React

1.1.12. Aplicação e repositórios na nuvem

### 1.2 Metodologia

1.2.1. Conceito vs Prática vs Conceito

1.2.2. Implementação sequencial e incremental

### 1.3 Avaliações

1.3.1. Um único projeto (incluindo modelo conceitual; backend fase 1 e 2; frontend e integração)

1.3.2. Dois projetos de práticas (um sobre o Backend e outro sobre o FrontEnd).

## 2  - Ferramentas e recursos

### Ferramentas:
Java – https://www.oracle.com/technetwork/java/javase/downloads 

Maven  - https://maven.apache.org 

STS - Spring Tool Suit (Eclipse / Maven / Tomcat / Jackson / JPA): https://spring.io/tools

MySQL (Workbench) – https://dev.mysql.com/downloads/workbench

Postman – https://www.getpostaman.com

Git (gitdesktop) – https://git-scm.com/downloads

Visual Studio Code - https://code.visualstudio.com/download 

Outras instalações necessárias: node, npm, yarn e outros...

### Contas:
Github – http://www.github.com 

Heroku – www.heroku.com 

Netlify – http://www.netlify.com 

Draw.IO - https://app.diagrams.net 

## 3 - Modelo Conceitual:
Descrição: O sistema (mini sistema com poucas classes) terá como premissa permitir que seja cadastrado históricos relacionados a obras de engenharia civil. Tendo resumidamente o seguinte contexto: Um proprietário possui uma obra que possui uma descrição e localização. Para esta obra vários lançamentos são efetuados, separando estes fluxos em dois níveis de históricos. O objetivo do sistema é permitir depois de vários lançamentos conhecer o gasto com obra de acordo com cada um dos tipos de lançamento.

![Modelo Conceitual Gestão de Obras](https://raw.githubusercontent.com/marcoswagner-commits/gestao_obras_aula_daw/Documentos/GESTAO_OBRAS.png)

## 4 – Síntese do Curso
Passos:
1. Instalar ferramentas (backend)

2. Criar o modelo conceitual no Draw.io usando um Diagrama de Classes ou Entidade-Relacionamento.

3. Verificar o funcionamento do SGBD (MySQL - Workbench)

4. Criar projeto no GitHub (aula_daw_nome_aluno)

5. Criar projeto no STS4 (Spring Starter Project - Seguir check-list próprio)

6. Fazer o primeiro commit

7. Implementar o Backend (Spring Starter Project - Seguir check-list próprio)

8. Instalar ferramentas (frontend)

9. Implementar o Frontend (React - Seguir check-list próprio)


## 5 – Síntese do Backend
Passos:
1. Instalar o STS, Postman e MySQL Workbench

2. Definir dependências iniciais (Spring Web; Spring Data JPA; SpringBoot DevTools; MySQL Driver)

3. Construir o primeiro “controller” com o primeiro “endpoint” apenas para testar o container TomCat

4. Configurar o acesso ao banco de dados – usuário e senha

5. Criar o DataBase no banco

6. Configurar o arquivo application.properties

7. Criar os modelos (Anotações de entidade) - com as regras de negócio específicas

8. Criar os repositórios (Interfaces – JpaRepository)

9. Criar os serviços (Anotações de Service) - com as regras de negócio específicas

10. Criar os respectivos “controllers” com todos os “endpoints” necessários e com o CRUD necessário

11. Criar e fazer adequação para criação de DTOs

12. Adequar para o nível de maturidade 3 (HATEOAS) com os respectivos links

13. Adequar para uso do Swagger

14. Criar funcionalidades para upload de arquivos e envio de e-mails

15. Criar funcionalidades de segurança (autenticação e autorização) com Spring Security e Token JWT

16. Testar API e disponibiliza-la no Heroku


## 6 – Síntese do FrontEnd
Passos:
1. Instalando o Node.JS, Visual Studio Code, Yarn, React CLI, 

2. Criar o Client React 

3. Criar exemplos de uso de propriedades e estado

4. Ajustes de CSS

5. Configurar as rotas

6. Criar um CRUD com BootStrap

7. Validação de campos

8. Usando o LocalStorage

9. Integração com uma API usando AXIOS

![Integração Backend-Frontend](https://raw.githubusercontent.com/marcoswagner-commits/gestao_obras_aula_daw/Documentos/Captura%20de%20Tela%202021-05-17%20às%2019.33.50.png)

![Integração Backend e Frontend](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/blob/Documentos/back_front_end.jpg)


### Trabalhos
- [Trabalho1 - Modelo Conceitual](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/blob/Documentos/Trabalho1%20-%20DAW.pdf)

### Aulas
- Roteiro específico da Aula Inaugural  - 13/07/2021 * (Apresentação do Planejamento - Plano de Ensino - Metodologias) *
- [Roteiro específico da Aula02 - 20/05/2021](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/aula02.md)
- [Roteiro específico da Aula03 - 25/05/2021](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/aula03.md)
- [Roteiro específico da Aula04 - 27/05/2021](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/aula04.md)
- Roteiro específico da Aula de Apresentação do Modelo Conceitual  - 13/07/2021 * (Apresentação do Backend - fase 1) *
- [Roteiro específico da Aula05 - 08/06/2021](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/aula05.md)
- [Roteiro específico da Aula06 - 10/06/2021](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/aula06.md)
- [Roteiro específico da Aula07 - 15/06/2021](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/aula07.md)
- [Roteiro específico da Aula08 - 17/06/2021](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/aula08.md)
- [Roteiro específico da Aula09 - 22/06/2021](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/aula09.md)
- [Roteiro específico da Aula10 - 24/06/2021](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/aula10.md)
- [Roteiro específico da Aula11 - 29/06/2021](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/aula11.md)
- [Roteiro específico da Aula12 - 01/07/2021](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/aula12.md)
- [Roteiro específico da Aula13 - 06/07/2021](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/aula13.md)
- [Roteiro específico da Aula14 - 08/07/2021](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/aula14.md)
- Roteiro específico da Aula de Apresentação de Trabalho  - 13/07/2021 * (Avaliação do Backend - fase 1) *
- Roteiro específico da Aula de Projeto de Prática - 15/07/2021 * (Projeto de Prática em Desenvolvimento de Aplicações WEB) *
