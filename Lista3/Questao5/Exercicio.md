# ⚙️ Questão 5 - Sistema de Eletrônicos

Implemente a classe `ProdutoEletronico` com os atributos `marca`, `modelo`, `preco` e `voltagem`, e os métodos:

- `calcularGarantiaEstendida()` → retorna 15% do preço  
- `exibirEspecificacoes()`

### a) Subclasse Smartphone
Crie a classe `Smartphone` que herda de `ProdutoEletronico` e possui os atributos `tamanhoTela` e `capacidadeBateria`.  
Sobrescreva `calcularGarantiaEstendida()` para retornar **20% do preço**.

### b) Subclasse Notebook
Crie a classe `Notebook` que herda de `ProdutoEletronico` e possui os atributos `processador` e `memoriaRAM`.  
Sobrescreva `calcularGarantiaEstendida()` para retornar **25% do preço**.

```java
class ProdutoEletronico { ... }
class Smartphone extends ProdutoEletronico { ... }
class Notebook extends ProdutoEletronico { ... }
