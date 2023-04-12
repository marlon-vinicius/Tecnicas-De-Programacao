/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.avaliacao1b;

/**
 *
 * @author 1091392223022
 */
public class Teste {
    public static void main(String[] args) {
 
      double quilometros = 2.8;
      double litro = 4.5;
      double metroCubico = 2.5;
      double barril = 3.0;
      
      ConversaoDeDados metros = new ConversaoDeDados();
      metros.setKm(quilometros);      
      
      ConversaoDeDados deci = new ConversaoDeDados();
      deci.setLt(litro);     
      
      ConversaoDeDados pes = new ConversaoDeDados();
      pes.setMc(metroCubico);
      
      ConversaoDeDados deca = new ConversaoDeDados();
      deca.setBa(barril);
      
      ConversaoDeDados lit = new ConversaoDeDados();
      lit.setBa2(barril);

      System.out.println(quilometros + " quilometros correspondem a "+ metros.getKm()+" metros");
      System.out.println(litro + " litros correspondem a "+ deci.getLt()+" decilitros");
      System.out.println(metroCubico + " metros cubícos correspondem a "+ pes.getMc()+" pés cubícos");
      System.out.println(barril + " barris correspondem a "+ deca.getBa()+" decalitros");
      System.out.println(barril + " barris correspondem a "+ lit.getBa2()+" litros");
      
    }
}
