public class FilaArray {
    //Português - Criado um "Array" que vai guardar às informações.
    //English - Created an "Array" that will store the information.
    private int[] array;
    //Português - Criado um ponteiro que vai informar o início da Fila.
    //English - A pointer has been created that will indicate the beginning of the Queue.
    private int start;
    //Português - Criado um ponteiro que vai informar o fim da Fila.
    //English - Created a pointer that will indicate the end of the Queue.
    private int end;

    //Português - Quando a Fila for criada, será gerada com o tamanho escolhido.
    //Português - Começa em "0", já o Fim começa no "-1".
    //English - When the Queue is created, it will be generated with the chosen size.
    //English - It starts at "0", while the End starts at "-1".
    public FilaArray(int size) {
        this.array = new int[size];
        this.start = 0;
        this.end = -1;
    }

    //Português - Retorna "True", caso o "Fim" encoste no último espaço disponível do Array.
    //English - Returns "True" if "End" touches the last available space in the Array.
    public boolean isFull() {
        return end == array.length - 1;
    }

    //Português - Retorna "True", caso o "Start" seja maior que o "End".
    //English - Returns "True" if "Start" is greater than "End".
    public boolean isEmpty() {
        return start > end;
    }

    //Português - Antes de colocar um novo elemento na Fila, será olhado se a mesma não está lotada.
    //Português - Caso seja possível colocar mais elementos, será colocado um novo elemento no final da Fila.
    //English - Before adding a new item to the Queue, a check will be made to see if the Queue is full.
    //English - If it's possible to add more elements, a new element will be placed at the end of the Queue.
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
    //English - Before removing an element from the Queue, it will be checked whether the Queue is already empty.
    //English - If the Queue is not empty, the first element placed in it will be removed.
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
    //English - Before looking at who is the first element in the Queue, it will be checked whether the Queue is already empty.
    //English - If the queue is not empty, the first element in the Queue will be looked at.
    public void front() {
        if (isEmpty()) {
            System.out.println("A Fila Está Vazia no Momento!");
            return;
        }
        System.out.println("O Primeiro Elemento da Fila é " + array[start]);
    }

    //Português - Antes de mostrar os elementos, será olhado se a Fila está vazia.
    //Português - Caso seja possível, mostrará todos os elementos da Fila.
    //English - Before displaying the elements, we will check if the Queue is empty.
    //English - If possible, it will display all elements of the Queue.
    public void display() {
        if (isEmpty()) {
            System.out.println("A Fila Está Vazia, Não é Possível Mostrar ás Informações!");
            return;
        }
        System.out.println("Elementos da Fila: ");
        for (int i = start; i <= end; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
