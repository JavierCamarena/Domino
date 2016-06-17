/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesGenericas;

/**
 *
 * @author xaovs
 */
public class Ficha {
    private int[] valores;
    public final int IZQUIERDA = 0;
    public final int DERECHA   = 1;
    
    public Ficha(int l1, int l2){
        valores = new int[2];
        valores[0] = l1;
        valores[1] = l2;
    }
    
    public void paint(){
        System.out.println("Obtener graficos y pintar");
    }
    
    public void gira(){
        int tem = valores[0];
        valores[0] = valores[1];
        valores[1] = tem;
    }

    public int[] getValores() {
        return valores;
    }

    public void setValores(int[] valores) {
        this.valores = valores;
    }
    
    public void imprimeFicha(){
        System.out.print(" ["+valores[0]+"|"+valores[1]+"] ");
    }
}
