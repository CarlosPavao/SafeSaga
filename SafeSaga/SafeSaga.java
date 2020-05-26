import java.util.Scanner;

/*
 Projeto Integrador: Desenvolvimento de lógica

 */

/**
 * Autores: • Alexsandro da Silva Ramos • Carlos Henrique Pavão Inácio •
 * Patricia Ferreira de Sousa • Renan Ferreira Novaes • Rodrigo Dias • Vinicius
 * Da Silva Alves
 */
public class SafeSaga {
  static int menu() {
    System.out.println("                   Bem Vindo ao Safe Saga.");
    System.out.println("\n                  =========================");
    System.out.println("                  |       1 - Jogar       |");
    System.out.println("                  |     2 - instruções    |");
    System.out.println("                  |      3 - Creditos     |");
    System.out.println("                  =========================\n");
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a opção desejada");
    return entrada.nextInt();

  }

  public static void habilidade() {
    System.out.println(
        "\nEscolha  ate 5 habilidades dentre essas abaixo:\n Uma habilidade pode ser escolhida mais de uma vez.");
    System.out.println();
    System.out.println("1 - Pular - Caso não saiba a resposta pula o desafio do Hacker.");
    System.out.println("2 - Sorte - Jogue dois dados se o resultado for maior que 7 você passa esse desafio.");
    System.out.println("3 - Tente Novamente - você tem a oportunidade de responder novamente caso errou.");
    System.out.println("4 - Bônus por acerto - Permite pular uma questão após 3 acertos consecultivos.");
    System.out.println("5 - Ajuda dos Universitarios - Fica somente Duas alternativas do desafio.");
    System.out.println("6 - Visão além do alcance - revela a resposta correta.");
  }
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int[] habilidade = new int[5];
    int retornar=0;
    int confirma = 0;
    
    do{
      int opcao = menu();

      switch (opcao) {
        case 1:
          System.out.println("Vamos Criar o Seu personagem: ");
          System.out.println();
          System.out.println("Como vai se chamar seu personagem?");
          String nomePersonagem = entrada.next();

          do {
            habilidade();
            for (int i = 0; i < 5; i++) {
              habilidade[i] = entrada.nextInt();
            }
            System.out.println("Voce escolheu as seguintes habilidades: ");
            for (int i = 0; i < habilidade.length; i++) {
              switch (habilidade[i]) {
                case 1:
                  System.out.println("Habilidade[" + (i + 1) + "]: Pular");
                  break;
                case 2:
                  System.out.println("Habilidade[" + (i + 1) + "]: Sorte");
                  break;
                case 3:
                  System.out.println("Habilidade[" + (i + 1) + "]: Tente Novamente");
                  break;
                case 4:
                  System.out.println("Habilidade[" + (i + 1) + "]: Bonus por acerto");
                  break;
                case 5:
                  System.out.println("Habilidade[" + (i + 1) + "]: Ajuda dos universitários");
                  break;
                case 6:
                  System.out.println("Habilidade[" + (i + 1) + "]: Visão alem do alcance");
                  break;
              }
            }
            System.out.println("Voce confirma as habilidade:\n1-Sim\n2-Não");
            confirma = entrada.nextInt();
            if(confirma ==2){
              
            }
          } while (confirma != 1);

          break;
        case 2:
          System.out.println("               Instruções: ");

          System.out.println("Digite o numero 0 para retornar ao menu");
          retornar = entrada.nextInt();

          break;
        case 3:

      }
    }while(retornar == 0);
  }  
}