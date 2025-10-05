# 🏅 Questão 7 - Sistema de Esportes

Implemente a classe `Esporte` com os atributos `nome`, `numeroJogadores`, `duracaoPartida` e `popularidade`, e os métodos:

- `calcularCustoEquipamento()` → retorna valor base de R$ 500,00  
- `exibirRegras()`

### a) Subclasse Futebol
Crie a classe `Futebol` que herda de `Esporte` e possui o atributo `tamanhoCampo`.  
Sobrescreva `calcularCustoEquipamento()` para retornar **R$ 300,00**.

### b) Subclasse Basquete
Crie a classe `Basquete` que herda de `Esporte` e possui o atributo `alturaCesta`.  
Sobrescreva `calcularCustoEquipamento()` para retornar **R$ 400,00**.

```java
class Esporte { ... }
class Futebol extends Esporte { ... }
class Basquete extends Esporte { ... }
