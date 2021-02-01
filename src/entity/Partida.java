package entity;
// Generated 31-ene-2021 20:04:23 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Partida generated by hbm2java
 */
@Entity
@Table(name = "partida", schema="damas")
public class Partida  implements java.io.Serializable {

    @Id @GeneratedValue
    @Column(name = "idPartida")
     private Integer idPartida;
    
    @Column(name = "ganador")
     private String ganador;
    
     private Set movimientos = new HashSet(0);

    public Partida() {
    }

	
    public Partida(String ganador) {
        this.ganador = ganador;
    }
    public Partida(String ganador, Set movimientos) {
       this.ganador = ganador;
       this.movimientos = movimientos;
    }
   
    public Integer getIdPartida() {
        return this.idPartida;
    }
    
    public void setIdPartida(Integer idPartida) {
        this.idPartida = idPartida;
    }
    public String getGanador() {
        return this.ganador;
    }
    
    public void setGanador(String ganador) {
        this.ganador = ganador;
    }
    public Set getMovimientos() {
        return this.movimientos;
    }
    
    public void setMovimientos(Set movimientos) {
        this.movimientos = movimientos;
    }



}