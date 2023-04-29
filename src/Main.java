public class Main {
    public static void main(String[] args) {


            Pessoa pessoa1 = new Pessoa("João", 20);
            System.out.println("Meu nome é " + pessoa1.getNome() + " e eu tenho " + pessoa1.getIdade() + " anos");
            pessoa1.fazerAniversario();
            pessoa1.apresentarPessoa();


            Pessoa pessoa2 = new Pessoa();
            pessoa2.setNome("Luke");
            pessoa2.setIdade(16);
            System.out.println("Meu nome é " + pessoa2.getNome() + " e eu tenho " + pessoa2.getIdade() + " anos");
            pessoa2.fazerAniversario();
            pessoa2.apresentarPessoa();

            Animal cachorro = new Cachorro();
            Animal gato = new Gato();

            pessoa2.realizarAcao(cachorro);
            pessoa2.realizarAcao(gato);
    }
}