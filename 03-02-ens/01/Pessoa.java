public class Pessoa {
  private String nome;
  private int idade;
  private double altura;

  public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  public void imprimirDados(){
    System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura);
  }

  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("John Doe", 30, 1.75);
    pessoa.imprimirDados();
  }
}

/*
 * javac Pessoa.java
 * 
 * java Pessoa
 * 
 */