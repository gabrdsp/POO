# 💰 Questão 2 - Sistema Bancário

Implemente a classe `ContaBancaria` com os atributos `numeroConta`, `saldo` e `titular`, e os métodos:

- `depositar(double valor)`
- `sacar(double valor)`
- `consultarSaldo()`

### a) Subclasse ContaCorrente
Crie a classe `ContaCorrente` que herda de `ContaBancaria` e possui o atributo `limiteChequeEspecial`.  
Sobrescreva o método `sacar()` para permitir saques até o limite do cheque especial.

### b) Subclasse ContaPoupanca
Crie a classe `ContaPoupanca` que herda de `ContaBancaria` e possui o atributo `taxaRendimento`.  
Adicione o método `aplicarRendimento()`.

```java
class ContaBancaria { ... }
class ContaCorrente extends ContaBancaria { ... }
class ContaPoupanca extends ContaBancaria { ... }
