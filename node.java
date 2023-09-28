/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linked.list.phonebook;

/**
 *
 * @author Lenoo
 */
public class node<T>
{
     private T data;
    private  node<T> next;

    public node(T data, node<T> next) {
        this.data = data;
        this.next = next;
    }

    public node() {
    }

    public node(T x){
        data=x;
    }

    public T getData() {
        return data;
    }

    public node<T> getNext() {
        return next;
    }

    public void setNext(node<T> next) {
        this.next = next;
    }

    public void setData(T data) {
        this.data = data;
    }
    
}
