/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesGenericas;

import java.util.ArrayList;

/**
 *
 * @author xaovs
 */
public class ListaDeFichas {
    private ArrayList<Ficha> listaDeFichas;
    
    public ListaDeFichas(){
        listaDeFichas = new ArrayList<>();
    }
    
    public void crearDomino(){
        Ficha f;
        for(int i=0;i<=6;i++){
            for (int j = 0; j <= i ; j++) {
                f = new Ficha(i, j);
                listaDeFichas.add(f);
            }
        }
    }
    
    public void imprimeLista(){
        for(Ficha f : listaDeFichas){
            f.imprimeFicha();
        }
    }
    
    
    
}
