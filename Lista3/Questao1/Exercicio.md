# 💻 Lista 3 - Programação Orientada a Objetos (Herança)

## 🚗 Questão 1: Sistema de Veículos
Implemente a classe `Veiculo` com os atributos `marca`, `modelo`, `ano` e `preco`, e os métodos:
- `calcularIpva()` - retorna 4% do preço para veículos comuns  
- `exibirDetalhes()` - mostra todos os dados do veículo  

a. Crie a classe `Moto` que herda de `Veiculo` e possui atributo `cilindrada`.  
Sobrescreva `calcularIpva()` para retornar 2% do preço.  

b. Crie a classe `Caminhao` que herda de `Veiculo` e possui atributo `capacidadeCarga`.  
Sobrescreva `calcularIpva()` para retornar 1.5% do preço.  

```java
class Veiculo { ... }
class Moto extends Veiculo { ... }
class Caminhao extends Veiculo { ... }
