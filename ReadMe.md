# Projeto: Gestão de Funcionários e Animais
## Descrição
Este projeto é uma aplicação Java que gerencia funcionários e animais em uma empresa. Ele calcula os custos com salários, comissões e organiza os dados de diferentes tipos de funcionários e animais.

## Estrutura do Projeto
A estrutura do projeto é organizada em pacotes, cada um responsável por uma parte específica da aplicação:

- **administracao**: Contém classes relacionadas à administração da empresa.
- **funcionarios**: Contém classes relacionadas aos funcionários, incluindo diferentes níveis de escolaridade e cargos.
- **animais**: Contém classes relacionadas aos animais, como Cachorro, Cavalo e Preguiça.
- **veterinario**: Contém classes relacionadas aos serviços veterinários.

## Classes Principais

### Funcionários
- **Funcionario**: Classe base para todos os funcionários.
- **FuncionarioComEnsinoBasico**: Funcionário com ensino básico.
- **FuncionarioComEnsinoMedio**: Funcionário com ensino médio.
- **FuncionarioComGraduacao**: Funcionário graduado.
- **Gerente**: Classe para gerentes.
- **Supervisor**: Classe para supervisores.
- **Vendedor**: Classe para vendedores.

### Animais
- Animal: Classe base para todos os animais.
- Cachorro: Classe para cachorros.
- Cavalo: Classe para cavalos.
- Preguica: Classe para preguiças.
 
### Outros
- **Empresa**: Classe que gerencia a empresa.
- **Veterinario**: Classe para veterinários.
- **Zoologico**: Classe para zoológicos.

## Estrutura do Projeto

````
lista-heranca-poliformismo/
├── src/
│   ├── administracao/
│   │   ├── funcionarios/
│   │   │   ├── Funcionario
│   │   │   ├── FuncionarioComEnsinoBasico
│   │   │   ├── FuncionarioComEnsinoMedio
│   │   │   └── FuncionarioComGraduacao
│   │   ├── Comissao
│   │   ├── Empresa
│   │   ├── Gerente
│   │   ├── semComissao
│   │   ├── Supervisor
│   │   └── Vendedor
│   ├── animais/
│   │   ├── Animal
│   │   ├── Cachorro
│   │   ├── Cavalo
│   │   ├── Main
│   │   ├── Preguica
│   │   ├── Veterinario
│   │   └── Zoologico  
├── .gitignore
├── pom.xml
└── README.md
````
## Como Executar
- Clone o repositório.
- Importe o projeto em sua IDE preferida.
- Compile e execute a aplicação.

## Licença
Este projeto está voltado para fins educacionais e processo seletivo Solutis DevTrail.