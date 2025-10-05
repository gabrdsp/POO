# 🚆 Questão 10 - Sistema de Transporte

Implemente a classe `Transporte` com os atributos `capacidadePassageiros`, `velocidadeMaxima`, `consumo` e `preco`, e os métodos:

- `calcularCustoViagem(double distancia)` → retorna `(distância / consumo) * 5.50`  
- `exibirDados()`

### a) Subclasse Onibus
Crie a classe `Onibus` que herda de `Transporte` e possui o atributo `numeroEixos`.  
Sobrescreva `calcularCustoViagem()` aplicando **desconto de 20%**.

### b) Subclasse Metro
Crie a classe `Metro` que herda de `Transporte` e possui o atributo `eletrico`.  
Sobrescreva `calcularCustoViagem()` aplicando **desconto de 30%**.

```java
class Transporte { ... }
class Onibus extends Transporte { ... }
class Metro extends Transporte { ... }
