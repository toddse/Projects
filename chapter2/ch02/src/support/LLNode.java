/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.src.support;

/**
 *
 * @author Liakat
 */
public class LLNode <T>{
    protected T info;
    protected LLNode<T> link;
    
    public LLNode(T info){
        this.info = info;
        link = null;
                            }
    public void setInfo(T info){ this.info = info;}
    public T getInfo(){return info;}
    public void setLink(LLNode<T> link){this.link = link;}
    public LLNode<T> getLink(){return link;}
}
