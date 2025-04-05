/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoteste;

import modelo.Carro;
import modelo.pessoa;

/**
 *
 * @author LAURABRITOTAVARES
 */
public class ProjetoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Carro meucarro = new Carro();
        meucarro.setCor("rosa");
        meucarro.setTipo("passeio");
        meucarro.setNumPorta(2);
        
        System.out.println("Cor:" + meucarro.getCor());
        System.out.println("Tipo:"+ meucarro.getTipo());
        System.out.println("Tipo:"+ meucarro.getNumPorta());
    

        
        pessoa minhaPessoa = new pessoa();
        minhaPessoa.setBiotipo("ablabla");
        minhaPessoa.setIdade(23);
        minhaPessoa.setNome("jorge");

        
        System.out.println("Biotipo:" + minhaPessoa.getBiotipo());
        System.out.println("Idade:"+ minhaPessoa.getIdade());
        System.out.println("Nome:"+ minhaPessoa.getNome());
        
    }
    
}

