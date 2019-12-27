public class Node<T> {

    public Node<T> next; //atributo para o nó seguinte
    public T element; //atributo para o elemento a armazenar no nó
    /**
     * Construtor do nó
     * @param element
     */
    public Node(T element){
        this.next= null;
        this.element = element;
    }

    /**
     * Método para obter o nó seguinte
     * @return next
     */
    public Node<T> getNext() {
        return next;
    }

    /**
     * Método para atribuir o nó seguinte
     * @param next
     */
    public void setNext(Node<T> next) {
        this.next = next;
    }

    /**
     * Método para obter o elemento a aramazenar no nó
     * @return
     */
    public T getElement() {
        return element;
    }


}
