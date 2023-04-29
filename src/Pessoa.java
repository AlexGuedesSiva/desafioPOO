public class Pessoa {
    // Atributos
    private String nome;
    private int idade;

    // Construtor

    public Pessoa() {
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Métodos de acesso aos atributos (Encapsulamento)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Métodos que utilizam os atributos (Abstração)
    public void fazerAniversario() {
        this.idade++;
    }

    public void apresentarPessoa() {
        System.out.println("Meu nome é " + this.nome + " e eu tenho " + this.idade + " anos.");
    }

    // Métodos que interagem com outras classes (Polimorfismo)
    public void realizarAcao(Animal animal) {
        animal.emitirSom();
    }
}