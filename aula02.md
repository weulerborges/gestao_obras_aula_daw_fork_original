# Aula 02 - Desenvolvimento de Aplicações WEB

> Aula 20/05/2021
> 
>  *Estudo de caso: Gestão de Obras*

## Atividades da aula - roteiro

- Conceituar Ecossistema SPRING - [Conteúdo do Curso](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/Conteúdo_Aula_DSW_Módulo_I.pdf)
- Importância do Spring Boot 
- Acessar o site Spring.io (https://spring.io) e verificar outros projetos existentes

### Ferramenta de implementação ([Roteiro - Ferramentas](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/README.md))

- [x] Abrir a Ferramenta STS4 (Spring Tool Suite)
- [x] Criar um novo Projeto (File - New - Spring Starter Project)
- [x] Primeira janela: 
(Service URL: spring.io -  Name/Artfact: testeAula1 - Type: Maven - Java Version: 11 - Packaging: Jar - Group/Package: br.edu.ufj - Description: Primeiro teste para Aula DAW)
- [x] Segunda janela: 
(Versão do Spring Boot: 2.4.5 - Starters: Spring WEB; Spring Data)

### Passo 1: Verificar a estrutura de arquivos do projeto

### Passo 2: Compilar (run) a aplicação 

### Passo 3: Adicionar a dependência H2 para resolver o problema apresentado, pois já foi informada a dependência Spring Data

### Passo 4: Analisar primariamente o Project Object Model (pom.xml)

### Passo 5: Fazer os primeiros testes com dois clientes (navegador e PostMan) ([Roteiro - Ferramentas](https://github.com/marcoswagner-commits/gestao_obras_aula_daw/tree/Documentos/README.md))

### Passo 6: Incluir os primeiros códigos, :+1: ainda sem criar nenhuma classe ou pacote, usando o arquivo principal:

:shipit:
```
@SpringBootApplication
@RestController
public class TesteAula1Application {

	public static void main(String[] args) {
		SpringApplication.run(TesteAula1Application.class, args);
	}
	
	@GetMapping("/auladaw")
	public String auladaw() {
		return "Olá turma de DAW!;
	}
}
```
### Alterar os primeiros códigos, :+1::
:shipit:
```
@SpringBootApplication
@RestController
public class TesteAula1Application {

	public static void main(String[] args) {
		SpringApplication.run(TesteAula1Application.class, args);
	}
	
	@GetMapping("/auladaw")
	public String auladaw(@RequestParam(value = "nome", defaultValue = "NOME") String nome) {
		return String.format("Olá turma de DAW, meu nome é %s",nome);
	}
}
```

### Conceituar API, REST, HTTP...


