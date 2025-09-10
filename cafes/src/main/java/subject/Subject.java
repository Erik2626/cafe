/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package subject;

import observer.Observe;

/**
 *
 * @author Estudiantes
 */
public interface Subject {
   void registerObserver(Observe n);
   void removeObserver(Observe n);
   void notifyObserver(Observe n);
}
