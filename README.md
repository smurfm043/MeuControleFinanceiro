# MeuControleFinanceiro — Sistema de Controle Financeiro

## Sobre o Projeto

O MeuConsumo é um sistema de controle financeiro desenvolvido em Java utilizando Programação Orientada a Objetos (POO) e arquitetura MVC.

O objetivo do sistema é auxiliar usuários no controle de receitas, despesas e saldo mensal de forma simples e organizada.

---

# Funcionalidades

* Cadastro de usuário
* Registro de receitas
* Registro de despesas
* Controle de saldo
* Definição de meta financeira
* Alertas financeiros
* Menu interativo no terminal

---

# Estrutura do Projeto

```text id="z5yq8n"
src
├── model
├── service
├── controller
└── view
```

---

# Arquitetura Utilizada

```text id="5j5a39"
View -> Controller -> Service -> Model
```

* model: entidades do sistema
* service: regras de negócio
* controller: controle do fluxo do sistema
* view: interface/menu

---

# Conceitos de POO Utilizados

* Herança
* Polimorfismo
* Encapsulamento
* Abstração

Exemplo de herança:

```java id="c9v8vf"
public class Receita extends Movimentacao
public class Despesa extends Movimentacao
```

---

# Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos
* MVC
* Git
* GitHub

---

# Como Executar

1. Abrir o projeto em uma IDE Java
2. Executar:

```text id="jyrk4q"
view/Main.java
```

3. Utilizar o menu no terminal

---

# Conclusão

O projeto aplica conceitos importantes de desenvolvimento de software para resolver um problema real de organização financeira de maneira simples e eficiente.

---

# Autor

Projeto desenvolvido para atividade acadêmica de Programação Orientada a Objetos.
