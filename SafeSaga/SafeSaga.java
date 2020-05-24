import java.util.Scanner;

/*
 Projeto Integrador: Desenvolvimento de lógica

 */

/**
Autores:
• Alexsandro da Silva Ramos
• Carlos Henrique Pavão Inácio
• Patricia Ferreira de Sousa
• Renan Ferreira Novaes
• Rodrigo Dias
• Vinicius Da Silva Alves
 */
public class SafeSaga {
  public static void menu(){
    System.out.println("                   Bem Vindo ao Safe Saga.");
    System.out.println("\n                  =========================");
		System.out.println("                  |       1 - Jogar       |");
		System.out.println("                  |     2 - instruções    |");
		System.out.println("                  |      3 - Creditos     |");
    System.out.println("                  =========================\n");
  }
  public static void habilidade(){
    System.out.println("\nEscolha  ate 5 habilidades dentre essas abaixo:\n Uma habilidade pode ser escolhida mais de uma vez.");
          System.out.println();
          System.out.println("1 - Pular - Caso não saiba a resposta pula o desafio do Hacker.");
          System.out.println("2 - Sorte - Jogue dois dados se o resultado for maior que 7 você passa esse desafio.");
          System.out.println("3 - Tente Novamente - você tem a oportunidade de responder novamente caso errou.");
          System.out.println("4 - Bônus por acerto - Permite pular uma questão após 3 acertos consecultivos.");
          System.out.println("5 - Ajuda dos Universitarios - Fica somente Duas alternativas do desafio.");
          System.out.println("6 - Visão além do alcance - revela a resposta correta.");

  }
  public static int escolhaHabilidade(int habilidade){
    int pular = 0;int sorte =0; int tenteNovamente = 0;
        int bonusPorAcerto = 0; int ajudaDosUniversitarios = 0; int visaoAlemDoAlcance = 0;int cont=0;
    
        switch(habilidade){
      case 1:
          pular++;
          cont++;
        break;
        case 2:
          sorte++;
          cont++;
        break;
        case 3:
          tenteNovamente++;
          cont++;
        break;
        case 4:
          bonusPorAcerto++;
          cont++;
        break;
        case 5:
          ajudaDosUniversitarios++;
          cont++;
        break;
        case 6:
        cont++;  
        visaoAlemDoAlcance++;
        break;
        default:System.out.println("Opção invalida"); 
      }
      return habilidade;
    
  }
  public static void main(String[] args) {
          
        Scanner entrada = new Scanner(System.in);
        
        int totaldehabilidade = 0;int pular = 0;int sorte =0; int tenteNovamente = 0;
        int bonusPorAcerto = 0; int ajudaDosUniversitarios = 0; int visaoAlemDoAlcance = 0;
        int i=0;int confirma =0;int habilidade=0;

    menu();
    int opcao = entrada.nextInt();

    
        switch(opcao){
          case 1:
          System.out.println("Vamos Criar o Seu personagem: ");
          System.out.println();
          System.out.println("Como vai se chamar seu personagem?");
          String nomePersonagem = entrada.next();
        
        habilidade();
        
        for( habilidade =0; habilidade <=5;i++){
          habilidade = entrada.nextInt();
        
        escolhaHabilidade(habilidade); 
           
      
      switch(habilidade){
        case 1:
          pular++;
          System.out.println(pular+" Pular.");
        break;  
        case 2:
          sorte++;
          System.out.println(sorte+" Sorte.");
        break;
        case 3:
            tenteNovamente++;
            System.out.println(tenteNovamente+" Tente Novamente.");
        break;
        case 4:
            bonusPorAcerto++;
            System.out.println(bonusPorAcerto+" Bonus Por Acerto.");
        break;
        case 5:
            ajudaDosUniversitarios++;
            System.out.println(ajudaDosUniversitarios+" Ajuda dos Universitários.");
        break;
        case 6:
            visaoAlemDoAlcance++;
            System.out.println(visaoAlemDoAlcance+ "Visão além do alcance.");
        break;
        }
      habilidade++;
      }
      System.out.println("Voce escolheu as seguintes habilidades: ");
      System.out.println(visaoAlemDoAlcance+ "Visão além do alcance.");
      System.out.println(ajudaDosUniversitarios+" Ajuda dos Universitários.");
      System.out.println(bonusPorAcerto+" Bonus Por Acerto.");
      System.out.println(tenteNovamente+" Tente Novamente.");
      System.out.println(sorte+" Sorte.");
      System.out.println(pular+" Pular.");
      do{
          
        System.out.println("Voce confirma as habilidade:\n1-Sim\n2-Não");
        confirma=entrada.nextInt();

      }while(confirma!=1);
  
           
          break;    
          case 2:
           System.out.println("               Instruções: ");

           System.out.println("Digite o numero 0 para retornar ao menu" );
           opcao = entrada.nextInt();
           if(opcao ==0){      
            menu();
           }
          break;
          case 3:
          
  }
}
}