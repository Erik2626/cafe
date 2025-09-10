/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subject;

import java.util.ArrayList;
import java.util.List;
import lote.Lote;
import observer.Observe;

/**
 *
 * @author Estudiantes
 */
public class CooperativaCafes implements Subject{
    private List<Observe> observers;

    public CooperativaCafes() {
        observers = new ArrayList<>();
    }
    
    
    @Override
    public void registerObserver(Observe n) {
       observers.add(n);
       System.out.println("Nuevo barista suscrito");
    }

    @Override
    public void removeObserver(Observe n) {
      observers.remove(n);
      System.out.println("Barista eliminado");
    }
    
    public void notifyObserver(Lote lote) {
      for(Observe n : observers){
      n.update(lote);
      }
    }
    public void registrarLote(Lote lote) {
      System.out.println("Registrando nuevo lote:"+lote.toString());
      notifyObserver(lote);
    }

    @Override
    public void notifyObserver(Observe n) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

     
}
