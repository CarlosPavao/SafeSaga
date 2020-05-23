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
  public static void escolhaHabilidade(){
    
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
         do{
           
          habilidade=entrada.nextInt();
          
          switch(habilidade){
              case 1:
                pular++;
                i++;
              break;
              case 2:
                sorte++;
                i++;
              break;
              case 3:
                tenteNovamente++;
                i++;
                break;
              case 4:
                bonusPorAcerto++;
                i++;
              break;
              case 5:
                ajudaDosUniversitarios++;
                i++;
              break;
              case 6:
                visaoAlemDoAlcance++;
                i++;
              break;
            default:System.out.println("Opção invalida"); 
          }
         
          System.out.println("Você já escolheu "+i+" habilidades.");
        }while(i<=4);
        
        
        System.out.println("Voce escolheu as seguintes habilidades: ");
        System.out.println();
        
        if(pular>0){
          System.out.println(pular+" Pular.");
        }if(sorte>0){
          System.out.println(pular+" Sorte.");
        }if (tenteNovamente>0){
          System.out.println(tenteNovamente+" Tente Novamente.");
        }if(bonusPorAcerto>0){
          System.out.println(bonusPorAcerto+" Bonus Por Acerto.");
        }if(ajudaDosUniversitarios>0){
          System.out.println(ajudaDosUniversitarios+" Ajuda dos Universitários.");
        }if(visaoAlemDoAlcance > 0){
          System.out.println(visaoAlemDoAlcance+ "Visão além do alcance.");
        }
        System.out.println("Voce confirma as habilidade:\n1-Sim\n2-Não");
        confirma=entrada.nextInt();

  
           
          break;    
          case 2:
           System.out.println("               Instruções: ");
           
            System.out.println("");
          break;
          case 3:
          
  }
}
}