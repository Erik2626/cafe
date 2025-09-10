/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

import lote.Lote;

/**
 *
 * @author Estudiantes
 */
public class Baristas implements Observe{
    private String id;
    private String name;

    public Baristas(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public void update(Lote lote) {
       System.out.println("Notificacion para:"+name+ "Nuevo lote disponible"+lote.toString());
    }
    
}
