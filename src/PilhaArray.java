public class PilhaArray {
    //Português - Criamos um "Array" que vai guardar às informações.
    private int[] array;
    //Português - Criamos uma variável "Topo" para informar a posição do último elemento inserido na Pilha.
    private int summit;

    //Português - Quando a Pilha for criada, será definido que a Pilha está vazia.
    public PilhaArray(int size) {
        this.array = new int[size];
        this.summit = -1;
    }

    //Português - Passará "True" quando a Pilha estiver cheia (Tamanho Total - 1).
    public boolean isFull() {
        return summit == array.length -1;
    }

    //Português - Passará "True" quando a Pilha estiver sem elementos (Tamanho Total = -1).
    public boolean isEmpty() {
        return summit == -1;
    }

    //Português - Antes de colocar um novo elemento na Pilha, será olhado se a mesma não está cheia.
    //Português - Caso seja possível colocar mais elementos, será empilhado um novo elemento no topo.
    public void push(int element) {
        if (isFull()) {
            System.out.println("Não é Possível Colocar Mais Elementos, Pilha Está Cheia no Momento!");
            return;
        }
        summit++;
        array[summit] = element;
        System.out.println("Elemento " + element + " Empilhado com Sucesso!");
    }

    //Português - Antes de remover um elemento na Pilha, será olhado se a Pilha já não está vazia.
    //Português - Caso não esteja vazia, será removido o último elemento que foi colocado na Pilha.
    public void pop() {
        if (isEmpty()) {
            System.out.println("Não foi Possível Remover Elemento, Pilha Está Vazia no Momento!");
            return;
        }
        System.out.println("Elemento " + array[summit] + " Removido!");
        summit--;
    }

    //Português - Antes de pegar o elemento do topo, será olhado se a Pilha já não está vazia.
    //Português - Caso não esteja vazia, será pego o elemento do topo.
    public void peek() {
        if (isEmpty()) {
            System.out.println("Pilha Vazia!");
            return;
        }
        System.out.println(array[summit] + " é o Elemento do Topo!");
    }

    //Português - Antes de mostrar os elementos, será olhado se a Pilha está vazia.
    //Português - Caso seja possível, mostrará todos os elementos da Pilha.
    public void display() {
        if (isEmpty()) {
            System.out.println("Pilha Está Vazia, Não é Possível Mostrar ás Informações!");
        }
        for (int i = 0; i <= summit; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
