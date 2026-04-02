//Português - Ferramenta usada para entender a digitação do usuário no Console.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Português - Habilita a ferramente para entender a digitação do usuário.
        Scanner scanner = new Scanner(System.in);
        //Português - Cria a Pilha, definindo que a mesma vai possuír apenas 5 espaços no Array.
        PilhaArray pilha = new PilhaArray(3);
        //Português - Cria a Fila, definindo que a mesma vai possuir apenas 5 espaços mo Array.
        FilaArray fila = new FilaArray(3);

        //Português - Criação de um "Loop", tudo dentro desse "Do" será executado, verificando no final a condição "While".
        int mainOption;
        do {
            System.out.println("Menu Principal");
            System.out.println("1 - Pilha");
            System.out.println("2 - Fila");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma Operação: ");
            //Português - Pausa o programa, esperando o usuário escrever no Console.
            mainOption = scanner.nextInt();

            //Português - Olha qual opção foi selecionada para definir que método será chamado.
            switch (mainOption) {
                case 1:
                    pilhaMenu(scanner, pilha);
                    break;
                case 2:
                    filaMenu(scanner, fila);
                    break;
                case 3:
                    System.out.println("Saindo do Sistema");
            }
            //Português - Caso a operação não seja "3", vai repetir novamente o "Menu Principal".
        } while (mainOption != 3);
        scanner.close();
    }

    //Português - Método separado responsável pelo "Menu Pilha"
    private static void pilhaMenu(Scanner scanner, PilhaArray pilha) {
        int optionPilha;
        do {
            System.out.println("Opções de Pilha");
            System.out.println("1 - Adicionar Novo Elemento");
            System.out.println("2 - Remover Elemento");
            System.out.println("3 - Mostrar Elemento do Topo");
            System.out.println("4 - Mostrar Todos Elementos da Pilha");
            System.out.println("5 - Pilha Está Cheia?");
            System.out.println("6 - Pilha Está Vazia?");
            System.out.println("7 - Retornar");
            System.out.print("Escolha uma Operação: ");
            //Português - Pausa o programa, esperando o usuário escrever no Console.
            optionPilha = scanner.nextInt();

            //Português - Olha qual opção foi selecionada para definir que método será chamado.
            switch (optionPilha) {
                case 1:
                    System.out.println("Digite o Valor Para Adicionar Novo Elemento");
                    pilha.push(scanner.nextInt());
                    break;
                case 2: pilha.pop();
                    break;
                case 3: pilha.peek();
                    break;
                case 4: pilha.display();
                    break;
                case 5: if (pilha.isFull()) {
                    System.out.println("Pilha Está Cheia!");
                    break;
                }
                System.out.println("Pilha Não Está Cheia!");
                    break;
                case 6: if (pilha.isEmpty()) {
                    System.out.println("Pilha Está Vazia!");
                    break;
                }
                System.out.println("Pilha Não Está Vazia!");
                    break;
                case 7: System.out.println("Voltando ao Menu Principal");
            }
            //Português - Caso a operação não seja "5", vai repetir novamente o "Menu Pilha".
        } while (optionPilha != 7);
    }

    //Português - Método separado responsável pelo "Menu Fila"
    private static void filaMenu(Scanner scanner, FilaArray fila) {
        int optionFila;
        do {
            System.out.println("Opções de Fila");
            System.out.println("1 - Adicionar Novo Elemento");
            System.out.println("2 - Remover Elemento");
            System.out.println("3 - Mostrar Primeiro Elemento");
            System.out.println("4 - Mostrar Todos Elementos da Fila");
            System.out.println("5 - Fila Está Cheia?");
            System.out.println("6 - Fila Está Vazia?");
            System.out.println("7 - Retornar");
            System.out.print("Escolha uma Operação: ");
            //Português - Pausa o programa, esperando o usuário escrever no Console.
            optionFila = scanner.nextInt();

            //Português - Olha qual opção foi selecionada para definir que método será chamado.
            switch (optionFila) {
                case 1:
                    System.out.println("Digite o Valor Para Adicionar Novo Elemento");
                    fila.enqueue(scanner.nextInt());
                    break;
                case 2: fila.dequeue();
                    break;
                case 3: fila.front();
                    break;
                case 4: fila.display();
                    break;
                case 5: if (fila.isFull()) {
                    System.out.println("Fila Está Cheia!");
                    break;
                }
                System.out.println("Fila Não Está Cheia!");
                    break;
                case 6: if (fila.isEmpty()) {
                    System.out.println("Fila Está Vazia!");
                    break;
                }
                System.out.println("Fila Não Está Vazia!");
                    break;
                case 7: System.out.println("Voltando ao Menu Principal");
            }
            //Português - Caso a operação não seja "5", vai repetir novamente o "Menu Fila".
        } while (optionFila != 7);
    }
}
