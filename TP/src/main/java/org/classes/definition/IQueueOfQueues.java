package org.classes.definition;

import org.classes.dynamic.Queue;

/**
 * Precondicion: para usar cualquier de estos metodos la estructura debe estar inicializada.
 */
public interface IQueueOfQueues {

    /**
     * Postcondicion: Acola (coloca en el final de la cola) un valor.
     *
     * @param a valor a acolar.
     */
    void add(Queue a);

    /**
     * Precondicion: La cola no esta vacia.
     * Postcondicion: Desacola (quita el primer elemento).
     */
    void remove();

    /**
     * @return <code>true</code> si la cola esta vacia, <code>false</code> en otro caso.
     */
    boolean isEmpty();

    /**
     * @return Devuelve el primero.
     */
    Queue getFirst();

    //QueueOfQueues concatenate(QueueOfQueues[] queues);

    Queue flat();

    void reverseWithDepth();
}
