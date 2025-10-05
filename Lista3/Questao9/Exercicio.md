# 📚 Questão 9 - Sistema de Bibliotecas

Implemente a classe `Livro` com os atributos `titulo`, `autor`, `anoPublicacao` e `preco`, e os métodos:

- `calcularMultaAtraso()` → retorna R$ 2,00 por dia  
- `exibirFichaCatalografica()`

### a) Subclasse LivroDidatico
Crie a classe `LivroDidatico` que herda de `Livro` e possui o atributo `disciplina`.  
Sobrescreva `calcularMultaAtraso()` para retornar **R$ 1,00 por dia**.

### b) Subclasse LivroRaro
Crie a classe `LivroRaro` que herda de `Livro` e possui o atributo `edicaoLimitada`.  
Sobrescreva `calcularMultaAtraso()` para retornar **R$ 5,00 por dia**.

```java
class Livro { ... }
class LivroDidatico extends Livro { ... }
class LivroRaro extends Livro { ... }
