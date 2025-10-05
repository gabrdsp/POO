# 🍽️ Questão 8 - Sistema de Restaurante

Implemente a classe `Prato` com os atributos `nome`, `preco`, `tempoPreparo` e `ingredientes (lista)`, e os métodos:

- `calcularTaxaServico()` → retorna 10% do preço  
- `exibirCardapio()`

### a) Subclasse PratoVegano
Crie a classe `PratoVegano` que herda de `Prato` e possui o atributo `certificacaoVegan`.  
Sobrescreva `calcularTaxaServico()` para retornar **5% do preço**.

### b) Subclasse PratoGourmet
Crie a classe `PratoGourmet` que herda de `Prato` e possui o atributo `chefResponsavel`.  
Sobrescreva `calcularTaxaServico()` para retornar **15% do preço**.

```java
class Prato { ... }
class PratoVegano extends Prato { ... }
class PratoGourmet extends Prato { ... }
