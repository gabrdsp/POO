# 🎬 Questão 6 - Sistema de Entretenimento

Implemente a classe `Midia` com os atributos `titulo`, `anoLancamento`, `duracao` e `preco`, e os métodos:

- `calcularPrecoAluguel()` → retorna 10% do preço  
- `exibirInfo()`

### a) Subclasse Filme
Crie a classe `Filme` que herda de `Midia` e possui os atributos `diretor` e `genero`.  
Sobrescreva `calcularPrecoAluguel()` para retornar **15% do preço**.

### b) Subclasse Serie
Crie a classe `Serie` que herda de `Midia` e possui os atributos `numeroTemporadas` e `episodiosPorTemporada`.  
Sobrescreva `calcularPrecoAluguel()` para retornar **12% do preço**.

```java
class Midia { ... }
class Filme extends Midia { ... }
class Serie extends Midia { ... }
