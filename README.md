# Exemplo de Polimorfismo em Java

Este repositório contém exemplos práticos de sobrescrita e sobrecarga de métodos em Java, ilustrando o uso desses conceitos fundamentais de polimorfismo. 

## Índice

1. [Sobrescrita de Métodos - Hierarquia de Veículos](#1-sobrescrita-de-métodos---hierarquia-de-veículos)
2. [Sobrecarga de Métodos - Calculadora](#2-sobrecarga-de-métodos---calculadora)
3. [Sobrecarga de Construtores - Produto](#3-sobrecarga-de-construtores---produto)
4. [Sobrescrita de Métodos - Classe de Pagamento](#4-sobrescrita-de-métodos---classe-de-pagamento)
5. [Sobrecarga de Métodos - Conversor](#5-sobrecarga-de-métodos---conversor)

---

### 1. Sobrescrita de Métodos - Hierarquia de Veículos

**Enunciado:**  
Implemente uma classe base chamada `Veiculo` com um método `mover()`. Crie duas subclasses: `Carro` e `Bicicleta`, que sobrescrevam o método `mover()` com comportamentos específicos.

- `Carro`: Imprime "O carro está dirigindo."
- `Bicicleta`: Imprime "A bicicleta está pedalando."

**Pergunta:**  
Como a sobrescrita de métodos permite comportamentos diferentes para objetos da mesma hierarquia?

**Explicação:**  
A sobrescrita de métodos permite que as subclasses personalizem o comportamento herdado da classe base. Com isso, mesmo que `Carro` e `Bicicleta` herdem o método `mover()` de `Veiculo`, cada classe tem sua própria implementação, garantindo que o método se comporte de maneira adequada ao contexto de cada objeto.

---

### 2. Sobrecarga de Métodos - Calculadora

**Enunciado:**  
Crie uma classe `Calculadora` com três versões do método `somar()`:
- A primeira recebe dois parâmetros inteiros.
- A segunda recebe três parâmetros inteiros.
- A terceira recebe dois parâmetros do tipo `double`.

**Pergunta:**  
Descreva o mecanismo de sobrecarga de métodos e como ele difere da sobrescrita em termos de polimorfismo.

**Explicação:**  
A sobrecarga de métodos permite que uma classe tenha várias versões de um mesmo método, contanto que as assinaturas (parâmetros) sejam diferentes. Diferentemente da sobrescrita, onde o método é redefinido nas subclasses, na sobrecarga todos os métodos coexistem dentro da mesma classe, promovendo o polimorfismo em tempo de compilação.

---

### 3. Sobrecarga de Construtores - Produto

**Enunciado:**  
Crie uma classe chamada `Produto` com três construtores sobrecarregados:
- O primeiro recebe apenas o nome do produto.
- O segundo recebe o nome e o preço.
- O terceiro recebe o nome, o preço e a quantidade em estoque.

**Pergunta:**  
Como a sobrecarga de construtores facilita a criação de objetos com diferentes conjuntos de informações?

**Explicação:**  
A sobrecarga de construtores permite flexibilidade na criação de objetos, possibilitando a inicialização de objetos com diferentes quantidades de informações. Isso facilita a instânciação em diferentes contextos sem a necessidade de múltiplas classes.

---

### 4. Sobrescrita de Métodos - Classe de Pagamento

**Enunciado:**  
Implemente uma classe `Pagamento` com um método `processarPagamento()` que imprime "Processando pagamento genérico". Crie duas subclasses: `PagamentoCartao` e `PagamentoBoleto`, cada uma sobrescrevendo o método para implementar comportamentos específicos.

- `PagamentoCartao`: "Processando pagamento via cartão de crédito."
- `PagamentoBoleto`: "Processando pagamento via boleto bancário."

**Pergunta:**  
Como o polimorfismo por sobrescrita facilita a implementação de diferentes formas de pagamento dentro de um sistema sem alterar o código da classe base?

**Explicação:**  
A sobrescrita de métodos permite que uma mesma interface (classe base) ofereça diferentes implementações específicas, como é o caso das diferentes formas de pagamento. O polimorfismo por sobrescrita é um mecanismo poderoso que permite a extensibilidade de sistemas sem a necessidade de modificar código existente na classe base.

---

### 5. Sobrecarga de Métodos - Conversor

**Enunciado:**  
Crie uma classe `Conversor` com três versões sobrecarregadas do método `converter()`:
- A primeira converte Celsius para Fahrenheit.
- A segunda converte quilômetros para milhas.
- A terceira converte uma string para letras maiúsculas.

**Pergunta:**  
Como a sobrecarga de métodos permite implementar várias versões do método `converter()`, mesmo com diferentes tipos de dados e funcionalidades?

**Explicação:**  
A sobrecarga de métodos permite que um mesmo método lide com diferentes tipos de dados e operações, facilitando a reutilização do nome do método para diferentes funcionalidades. Isso promove clareza e consistência no código ao manter um único nome de método para diversas operações relacionadas.

---

## Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/Almile/polimorfismo.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd polimorfismo
   ```
3. Compile e execute os exemplos conforme necessário.



