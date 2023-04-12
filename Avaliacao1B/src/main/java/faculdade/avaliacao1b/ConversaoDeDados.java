/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade.avaliacao1b;

/**
 *
 * @author 1091392223022
 */
public class ConversaoDeDados {
    private double km;
    private double lt;
    private double mc;
    private double ba;
    private double ba2;
    
    public void setKm(double km){
        this.km = km;
    }
    
    public double getKm(){
        return km * 1000;
    }
    
    public void setLt(double lt){
        this.lt = lt;
    }
    
    public double getLt(){
        return lt * 10;
    }
    
    public void setMc(double mc){
        this.mc = mc;
    }
    
    public double getMc(){
        return mc * 35.31;
    }
    
    public void setBa(double ba){
        this.ba = ba;
    }
    
    public double getBa(){
        return ba * 16.36;
    }
    
    public void setBa2(double ba2){
        this.ba2 = ba2;
    }
    
    public double getBa2(){
        return ba2 * 163.65;
    }
}
