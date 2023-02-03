/*
 * CLASSE PESSOA
 * 
 */
public class Pessoa { //classe
    private String nome; //atributos, propriedades
    private int idade; //atributos, propriedades
    private double altura; //atributos, propriedades

    /*
     * CHAMAMOS DE ENTIDADE O PADRÃO DE ATRIBUTOS, OU CARACTERÍSTICAS
     */

    //método constructor -> PRA CRIAR OU EXCLUIR OBJETOS
    public Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this. altura = altura;
    }

    public void imprimirDados(){ // método imprimirDados() 
        System.out.println("Nome:  " + nome + "Idade:  " + idade + "Altura:  " + altura);
    }

    public void saudacao(){
        System.out.println("Olá, meu nome é   " + nome + ", tenho  " + idade + " anos, e minha altura é  " + altura );
    }

    public static void main(String[] args){
        Pessoa pessoa = new Pessoa("Demetrius Ferreira", 27, 1.75);
        pessoa.saudacao();
        
    }


  

    /*
     * se for mais de uma pessoa, é necessário colocar em uma lista, um array[] 
     * 
     * JSON = NOTAÇÃO DE OBJETOS EM JAVASCRIPT
     * 
     * NA HORA DE TESTAR AS APIS, É DESSA FORMA QUE EXIBIREMOS OS NOSSOS OBJETOS, COM ESSA NOTAÇÃO.
     * 
     * lista = [{ 
     * 
     * "nome": "Demetrius Ferreira",
     * "idade": 27,
     * "altura": 1.75
     * 
     * },
     * 
     * { 
     * 
     * "nome": "Demetrius Ferreira", "idade": 27,  "altura": 1.75
     * 
     * },
     * 
     * { 
     * 
     * "nome": "Demetrius Ferreira",
     * "idade": 27,
     * "altura": 1.75
     * 
     * },
     * 
     * 
     * 
     * ]
     * 
     */
    
}

