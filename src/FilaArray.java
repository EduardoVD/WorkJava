public class FilaArray {
    //Português - Criamos um "Array" que vai guardar às informações.
    private int[] array;
    //Português - Criamos um ponteiro que vai informar o início da Fila.
    private int start;
    //Português - Criamos um ponteiro que vai informar o fim da Fila.
    private int end;

    //Português - Quando a fila for criada, será gerada com o tamanho escolhido.
    //Português - Começa em "0", já o Fim começa no "-1".
    public FilaArray(int size) {
        this.array = new int[size];
        this.start = 0;
        this.end = -1;
    }

    //Português - Retorna "True", caso o "Fim" encoste no último espaço disponível do Array.
    public boolean isFull() {
        return end == array.length - 1;
    }

    //Português - Retorna "True", caso o "Start" seja maior que o "End".
    public boolean isEmpty() {
        return start > end;
    }

    //Português - Antes de colocar um novo elemento na Fila, será olhado se a mesma não está lotada.
    //Português - Caso seja possível colocar mais elementos, será colocado um novo elemento no final da Fila.
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Não é Possível Colocar um Novo Elemento, a Fila Está Cheia!");
            return;
        }
        end++;
        array[end] = element;
        System.out.println("Elemento " + element + " Foi Criado com Sucesso!");
    }

    //Português - Antes de remover um elemento na Fila, será olhado se a Fila já não está vazia.
    //Português - Caso não esteja vazia, será removido o primeiro elemento que foi colocado na Fila.
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Não é Possível Excluir um Elemento! A Fila Está Vazia");
            return;
        }
        System.out.println("Elemento " + array[start] + " Removido da Fila!");
        start++;
    }

    //Português - Antes de olhar quem é o primeiro elemento na Fila, será olhado se a Fila já não está vazia.
    //Português - Caso não esteja vazia, será olhado o primeiro elemento da Fila.
    public void front() {
        if (isEmpty()) {
            System.out.println("A Fila Está Vazia no Momento!");
            return;
        }
        System.out.println("O Primeiro Elemento da Fila é " + array[start]);
    }

    //Português - Antes de mostrar os elementos, será olhado se a Fila está vazia.
    //Português - Caso seja possível, mostrará todos os elementos da Fila.
    public void display() {
        if (isEmpty()) {
            System.out.println("A Fila Está Vazia, Não é Possível Mostrar ás Informações!");
            return;
        }
        System.out.println("Elementos da Fila: ");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
