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
  static int primeiraEscolha(){
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
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite a opção desejada");
            return entrada.nextInt(); 
              
  }
  public static void decisao1Escolha1(){
    System.out.println(" Poucos minutos depois você recebe um e-mail. Ansioso para ver o resultado, "+
              "clica no arquivo e é quando você recebe uma mensagem: 'Identificamos que você instalou um programa "+
              "no qual te deixou totalmente vulnerável. Vários dos seus dados foram roubados. Para que eu não libere' " +
              "para o mundo, vamos fazer um jogo");
  }
  static int inicioQuiz(){
    System.out.println("As regras são simples. Farei uma série de perguntas pra testar seus conhecimentos sobre segurança da informação;"+
    " sendo assim, tome muito cuidado ao dar suas respostas, seus dados dependem disso."+ 
    " Acredito que você não tenha nenhuma habilidade especial para passar pelo meu “Quis da Redenção” isso poderia estragar meus planos"+
     " de me divertir com você.\n Você está preparado para começar?\n"+
    "1-)	Sim, vamos lá. (Vá para o parágrafo 16)\n"+
    "0-)	Não, quero sair correndo ( Vá para o parágrafo 15)\n");
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite a opção desejada");
    return entrada.nextInt(); 
  }
  public static void decisao1Alternatica2(){
    System.out.println("Ao encerrar o chat, você percebe que sua tela congela e um bloco de notas abre no seu monitor com a seguinte mensagem"+
    " Não precisamos mais do seu e-mail, identificamos que você instalou um programa no qual te deixou totalmente vulnerável. Vários dos seus"+
    " dados foram roubados. Para que eu não libere para o mundo, vamos fazer um jogo"+
    " Você fica completamente desesperado; todos os seus dados, como: Cartão de crédito, senha de banco, senha de redes sociais, e-mail,"+
     " fotos intimas que você havia mandado para outras pretendentes entre pequenas outras coisas haviam sido roubados.\n\n");
    System.out.println(" '- Hacker:'  Não somos pessoas tão ruins assim, queremos apenas nos divertir e ao mesmo tempo te dar uma lição para"+
    " que algumas coisas não se repitam. Para isso, no nosso jogo, iremos te dar a possibilidade de não perder seus dados e que você possa sair"+
    " bem com tudo isso, mais forte!!"
    );

  }
  static int decisao2(){
    System.out.println("Ao sair mais cedo do trabalho, você vai correndo comprar seu lanche no Mc2000. Chegando lá, você vê que a fila enorme "+
    "por conta do horário. Bom, você resolve esperar pacientemente para ser atendido. Neste meio período, você percebe é uma bela garota/garoto "+
    "abordando as pessoas para fazer uma pesquisa e você até que fica empolgado para poder bater um papo com ela/ele. Chegada a sua vez, ela "+ 
    "pergunta se você teria interesse em participar de uma pesquisa sobre provedores de internet e que no final da pesquisa haverá um brinde.\n "+
    "Você começa a conversar com ela/ele e você sente uma “química” entre vocês dois.\n"+ 
    "1-) Preencher todos os dados da pesquisa, pois você quer agradá-la/lo e não poderá fazer essa desfeita.\n"+
    "2-) Diz que não quer preencher a pesquisa, mas que isso não deveria interferir em uma decisão para um encontro.\n");
    Scanner entrada = new Scanner (System.in);
    System.out.println("Qual sua decisão?");
      
    return entrada.nextInt();
  }
  public static void decisao2Escolha1(){
    System.out.println("Ela/Ele agradece muito de passa pela gentileza e diz que irá te mandar uma mensagem de texto para marcar combinar um "+
    "encontro. Você recebe ao final da pesquisa um CD de provedor de internet. Ela/Ele diz que é uma novidade e que você deveria ver como ela "+
    "é super simples e leve de ser usado em qualquer máquina. Você não vê problema algum, afinal, isso tudo estava acontecendo dentro de uma "+
    "grande rede de fast-food.\n ");
    
  }
  public static void decisao2Escolha2(){
    System.out.println("Ela/Ele fica um pouco chateado/a com sua resposta, mas diz que gostou muito de você e que, e mesmo assim, lhe dará o "+
    "brinde sem preencher os dados e que passará o telefone dela/dele. Ele/ela te entrega um CD de provedor e, junto, um papel com o telefone. "+
    "Você fica muito feliz com a atitude dela/dele e lembra de que de fato queria trocar seu provedor. Você não vê problema algum, afinal, isso "+
    "tudo estava acontecendo dentro de uma grande rede de fast-food.");;
  }
  public static void decisao2Final(){
    System.out.println("Você finalmente consegue comprar seu combo na lanchonete e vai correndo para casa aproveitar seu computador. Claro que "+
    "você não poderia deixar de instalar o novo CD que você ganhou, porque quando você fosse conversar com ela/ele, teria que ter já algum "+
    "assunto para iniciar.\n"+
    "Ao finalizar a instalação, é onde seu pesadelo começa a acontecer. Seu computador congela e aparece uma mensagem 'Seu computador acaba de "+
    "ser invadido e todos os seus dados foram roubados. Para que eu não libere para o mundo, vamos fazer um jogo'\n"+
    " - Hacker: 'Não somos pessoas tão ruins assim, queremos apenas nos divertir e ao mesmo tempo te dar uma lição para que algumas coisas não "+
    "se repitam. Para isso, no nosso jogo, iremos te dar a possibilidade de não perder seus dados e que você possa sair bem com tudo isso, "+
    "mais forte!!");
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
              System.out.println("Qual habilidade vc deseja trocar?");
              int troca = entrada.nextInt();
            }
          } while (confirma != 1);
          
          int escolhas = inicioJogo();

          switch(escolhas){
            case 1:
              decisao = primeiraEscolha();
              if(decisao == 1){
                decisao1Escolha1();
                System.out.println("");
              }else if(decisao ==2){
                decisao1Alternatica2();
                System.out.println("");
              }
              break;
            case 2:
              decisao = decisao2();
              if(decisao == 1){
                  decisao2Escolha1();
              }if(decisao ==2){
                decisao2Escolha2();
              }
              decisao2Final();
              break;
            case 3:

              break;
            case 4:

              break;
              
          }
          decisao = inicioQuiz();


          break;
        case 2:
          System.out.println("               Instruções: ");

          System.out.println("Digite o número 0 para retornar ao menu");
          System.out.println("Digite o número 4 para sair do jogo");
          decisao = entrada.nextInt();

          break;
        case 3:

      }
    }while(decisao != 0 ); 
    System.out.println("Fim de jogo, Seus dados foram expostos na internet e toda sua vida esta comprometida por conta disso");
  }  
}