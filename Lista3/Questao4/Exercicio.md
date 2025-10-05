# 🏠 Questão 4 - Sistema de Imóveis

Implemente a classe `Imovel` com os atributos `endereco`, `area`, `numeroQuartos` e `preco`, e os métodos:

- `calcularTaxaAdministracao()` → retorna 8% do preço  
- `exibirCaracteristicas()`

### a) Subclasse Apartamento
Crie a classe `Apartamento` que herda de `Imovel` e possui os atributos `andar` e `valorCondominio`.  
Sobrescreva `calcularTaxaAdministracao()` para retornar **6% do preço**.

### b) Subclasse Casa
Crie a classe `Casa` que herda de `Imovel` e possui os atributos `areaQuintal` e `temPiscina`.  
Sobrescreva `calcularTaxaAdministracao()` para retornar **10% do preço**.

```java
class Imovel { ... }
class Apartamento extends Imovel { ... }
class Casa extends Imovel { ... }
