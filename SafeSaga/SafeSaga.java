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
    System.out.println("                  |        4 - Sair       |");
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
  static int inicioJogo(){
    System.out.println("Você está no seu ambiente de trabalho, localizado no centro da cidade. "+ 
    "São 17h30 de uma sexta-feira, do dia 07/03/2003 e seu expediente está para terminar. Porém, "+
    "seu chefe te passa uma tarefa de última hora e lhe da a opção de permanecer até mais tarde "+
    "ou terminar a atividade em casa. Em seguida seus amigos te convidam para um happy hour. "+
    "Sua demanda no trabalho para a próxima semana será muito grande e você pensa seriamente "+ 
    "se deve ficar até mais tarde para adiantar o serviço. Mas você não consegue tirar da "+
    "cabeça o fato de que você está morrendo de fome e quer aproveitar o seu novo computador.");
    System.out.println("1- ) Ficar até mais tarde no trabalho."); 
    System.out.println("2- ) Sair no horário e passar no Mc2000 para comprar um Big2000."); 
    System.out.println("3- ) Happy hour. "); 
    System.out.println("3- ) Ir para casa e terminar a tarefa designada a você."); 
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a opção desejada");
    return entrada.nextInt();
  }
  public static void primeiraEscolha(){
    System.out.println("Ao sair tarde do trabalho (Por volta das 22h00), você lembra que precisava "+
            "comprar o CD para o novo jogo que você gostaria de jogar, mas que agora era tarde para encontrar "+
            "uma loja aberta. Coincidentemente, ao andar algumas quadras até a estação do metro, você é  "+
            "abordado por um vendedor ambulante que lhe oferece alguns programas de computador e jogos "+ 
            "lançamentos. Entre eles, está seu tão aguardado jogo. Sem pensar duas vezes, você compra o jogo "+ 
            "do vendedor. (Vamos fazer o teste de sorte para ver se consegue um desconto na mídia).\n "+
            "Chegando em casa você não pensa duas vezes e já inicia a instalação do jogo e faz o procedimento "+
            "para 'crackear'. Porém, você lembra que havia marcado um horário no chat online com uma pessoa na"+
            "qual você conheceu na internet a alguns dias. Sendo assim, você vai para seu encontro virtual.\n" +
            "Lá estava sua/seu correspondente te esperando. Entre uma longa conversa, chega um momento em que "+ 
            "sua/seu correspondente lhe pede seu e-mail para que possa enviar fotos intimas, assim você poderá "+ 
            "saber como de fato ela/ele é.");  
            System.out.println("O que você quer fazer? "); 
            System.out.println("1-)Passa seu e-mail, pois está super curioso. ");
            System.out.println("2-)Da uma desculpa que precisar ir embora pois tem que testar um novo 'programa'"+
            "que acabou de instalar no computador, mas que vai pensar se encaminha o e-mail no próximo encontro."); 
  }
  public static void decisao1Escolha1(){
    System.out.println("Poucos minutos depois você recebe um e-mail. Ansioso para ver o resultado, "+
              "clica no arquivo e é quando você recebe uma mensagem: 'Identificamos que você instalou um programa "+
              "no qual te deixou totalmente vulnerável. Vários dos seus dados foram roubados. Para que eu não libere' " +
              "para o mundo, vamos fazer um jogo");
  }

  
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int[] habilidade = new int[5];
    int retornar=0;
    int confirma = 0;
    int decisao=0;
    
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
            System.out.println(nomePersonagem+ " Voce escolheu as seguintes habilidades: ");
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
          
          int escolhas = inicioJogo();

          switch(escolhas){
            case 1:
            primeiraEscolha();
            decisao = entrada.nextInt();
            if(decisao == 1){
              decisao1Escolha1();
            }
          }



          break;
        case 2:
          System.out.println("               Instruções: ");

          System.out.println("Digite o número 0 para retornar ao menu");
          System.out.println("Digite o número 4 para sair do jogo");
          retornar = entrada.nextInt();

          break;
        case 3:

      }
    }while(retornar == 0 && retornar != 4); 
  }  
}