import java.util.Scanner;

class Main { 
  public static void main(String[] args) {


    int idade = 0;
    int idades = 0;
    int soma = 0;
    double media = 0.0;

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite a idades");
    idade = leitor.nextInt();

    do {
       
       

      if (idade>0) {

        System.out.println("Digite a idade");
        idade = leitor.nextInt();

        soma = soma + idade;
        idades++;
  
      }

      else{}


    } 
  
    while (idade>0);

    media = soma / idades;

    System.out.println("A média das idades é " +media);

	  leitor.close();
	
  }

}








  

  
   



 