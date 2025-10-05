# 🎓 Questão 3 - Sistema de Cursos

Implemente a classe `Curso` com os atributos `nome`, `cargaHoraria`, `preco` e `nivel`, e os métodos:

- `calcularDesconto()` → retorna 10% do preço  
- `exibirInformacoes()`

### a) Subclasse CursoPresencial
Crie a classe `CursoPresencial` que herda de `Curso` e possui o atributo `local`.  
Sobrescreva `calcularDesconto()` para retornar **5% do preço**.

### b) Subclasse CursoOnline
Crie a classe `CursoOnline` que herda de `Curso` e possui o atributo `plataforma`.  
Sobrescreva `calcularDesconto()` para retornar **15% do preço**.

```java
class Curso { ... }
class CursoPresencial extends Curso { ... }
class CursoOnline extends Curso { ... }
