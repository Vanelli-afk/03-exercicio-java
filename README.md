# Projeto: Sistema de Cadastro de Empresa

## Descrição

Este projeto consiste em uma aplicação desenvolvida em Java com o objetivo de gerenciar uma empresa, permitindo o cadastro de fornecedores e funcionários.

O sistema foi desenvolvido utilizando conceitos de Programação Orientada a Objetos, como abstração, herança e polimorfismo.

A estrutura do projeto foi organizada de forma modular, separando as classes em pacotes, a fim de facilitar a manutenção, legibilidade e escalabilidade.

---

## Estrutura do Projeto
```
    meu-projeto/
    │
    ├── src/
    │ ├── app/
    │ │ └── Main.java # Classe principal
    │ │
    │ └── model/
    │ ├── Pessoa.java # Classe abstrata base
    │ ├── Fornecedor.java # Subclasse de Pessoa
    │ ├── Empregado.java # Classe abstrata
    │ ├── Operario.java # Subclasse de Empregado
    │ └── Vendedor.java # Subclasse de Empregado
    │ │
    │ ├── util/
    │ ├── Empacotamento.java # Classe de serialização
    │ │
    ├── README.md # Documentação
    └── .gitignore # Arquivos ignorados pelo Git
```

---

## Requisitos

Para compilar e executar este projeto, é necessário:

* Java JDK 8 ou superior
* Sistema operacional compatível (Windows, Linux ou macOS)
* Editor ou IDE (recomendado: Visual Studio Code ou IntelliJ IDEA)

---

## Compilação e Execução

### Compilação

No terminal, na raiz do projeto, execute:

```bash
javac -d bin src/app/Main.java src/model/*.java
```

### Execução

Após a compilação, execute:

No Linux/macOS:

```bash
java -cp bin app.Main
```

No Windows:

```bash
java -cp bin app.Main
```

---

## Funcionalidades

* Cadastro de fornecedores
* Cadastro de funcionários (Operário e Vendedor)
* Listagem de todos os cadastrados
* Cálculo da folha de pagamento

---

## Conceitos Utilizados

* Programação Orientada a Objetos (POO)
* Abstração (classes abstratas)
* Herança
* Polimorfismo
* Encapsulamento
