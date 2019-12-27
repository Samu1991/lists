import Exceptions.*;

public class LinkedList<T> {

    private int count;//contador
    private Node<T> head;//atributo para a cabeça da lista
    private Node<T> tail;//atributo para a cauda da lista

    /**
     * Construtor da lista
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    /**
     * Método para obter count
     *
     * @return
     */
    public int getCount() {
        return count;
    }

    /**
     * Método de lista vazia
     *
     * @return
     */
    private boolean isEmpty() {
        return (count == 0);
    }

    /**
     * Método para adicionar na cabeça da lista
     *
     * @param elem
     */
    public void addFirst(T elem) {
        //Criação de um novo node
        Node<T> novoNode = new Node<>(elem);

        if (isEmpty()) {
            head = novoNode;
        } else {
            novoNode.setNext(head);//novoNode vai ser atribuido a referencia do head
            head = novoNode;//o novoNode passa a primeiro elemento
        }

        count++;
    }
/*
    public void addLast(T elem){
        Node<T> novoNode= new Node<>(elem);
        if (isEmpty()) {
            tail = novoNode;
        } else {
            novoNode.setNext(tail);//novoNode vai ser atribuido a referencia do head
            tail = novoNode;//o novoNode passa a primeiro elemento
        }

        count++;

    }*/
    /**
     * Método para adicionar a lista
     *
     * @param elem
     */
    public void add(T elem) {
        //criação de um novo node
        Node<T> novo = new Node<>(elem);
        if (isEmpty()) {
            head = novo;
            tail = head;
        } else {
            //Node<T> current = head; //criamos node auxiliar com o valor de head

            tail.setNext(novo);//liga o novo nó a lista
            tail = novo;
        }
        count++;

    }

    /**
     * Método para remover o primeiro elemento da lista
     */
    public void removeFirst() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("Lista vazia, impossível remover!!");
        } else {
            head = head.getNext();//remove o nó a cabeça
            this.count--;
        }
    }

    public void removeLast() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("Lista vazia, impossível remover!!");
        } else {
            Node<T> current = head;
            Node<T> nodeAux = null;

            while (current.getNext() != null) {//enquanto o current.getNext for diferente de null
                nodeAux = current;
                current = nodeAux.getNext();
            }
            nodeAux.setNext(null);
            tail = nodeAux;
            this.count--;

        }
    }

    public void remove(T elem) throws EmptyListException {
        boolean found = false;
        if (isEmpty()) {
            throw new EmptyListException("Lista vazia, impossível remover");
        } else {
            Node<T> current = head.getNext();
            Node<T> anterior = head;

            while (current != null) {
                if (elem.equals(current.getElement())) {
                    found = true;

                    count--;
                } else {
                    anterior = current;
                    current = current.getNext();
                }
            }
            if(found == true){
                if(this.head.getElement().equals(elem)){
                    this.head.setNext(anterior.getNext());
                    this.head= anterior.getNext();
                }
            }
            count--;
        }
    }
    /**
     * Método para imprimir a lista
     */
    public void print() {
        Node<T> current = this.head;
        while (current != null) { //enquanto o current for diferent de null
            System.out.println(current.getElement().toString()); //print o elemento
            current = current.getNext(); // print o elemento e os seguintes
        }

       // System.out.println(this.count); //conta o numero de elementos
/*
        if (this.head !=null) { // se o head for diferente de null
            System.out.println("head    "+this.head.getElement().toString()); // dá o valor do 1 elemento
        }

        if (this.tail !=null) { // se tail for diferente de null
            System.out.println("tail    "+this.tail.getElement().toString()); // dá o valor do ultimo elemento
        }

 */
    }
}
