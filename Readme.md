Estrutura de código Java com foco em Programação Orientada a Objetos


Este projeto apresenta uma estrutura de código básica em Java com foco no paradigma de programação orientada a objetos. A estrutura aborda os quatro pilares da programação orientada a objetos: encapsulamento, abstração, herança e polimorfismo.

Como utilizar
Clone o repositório para o seu ambiente de desenvolvimento:
bash
Copy code
git clone https://github.com/seu-usuario/desafioPOO.
Abra o projeto em sua IDE Java de preferência.

Execute a classe Main para ver a estrutura de código em ação.

Componentes da estrutura
A estrutura de código é composta pelos seguintes elementos:

Classe Pessoa
A classe Pessoa representa uma pessoa e possui os seguintes atributos:

nome: uma String que representa o nome da pessoa.
idade: um int que representa a idade da pessoa.
A classe Pessoa utiliza encapsulamento para proteger os atributos e permitir acesso através dos métodos getNome, setNome, getIdade e setIdade. Além disso, a classe Pessoa utiliza abstração para definir métodos que utilizam os atributos, como fazerAniversario e apresentarPessoa. A classe Pessoa ainda utiliza polimorfismo para interagir com outras classes através do método realizarAcao, que recebe como parâmetro um objeto da classe Animal (que é abstrata).

Classe Animal
A classe Animal é uma classe abstrata que representa um animal e possui o método abstrato emitirSom. Esta classe é utilizada para ilustrar o conceito de herança e polimorfismo.

Classes Cachorro e Gato
As classes Cachorro e Gato são subclasses de Animal e implementam o método abstrato emitirSom de maneira diferente, permitindo que o método realizarAcao da classe Pessoa tenha um comportamento diferente dependendo do objeto que recebe como parâmetro.

Classe Main
A classe Main é a classe principal do programa, responsável por criar objetos das outras classes e executar métodos para demonstrar a estrutura de código em ação.

Contribuição
Contribuições são bem-vindas! Se você tiver sugestões de melhorias ou novas funcionalidades para a estrutura de código, fique à vontade para abrir uma issue ou enviar um pull request para o repositório.
