package entity;
// Generated 31-ene-2021 20:04:23 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Movimientos generated by hbm2java
 */
@Entity
@Table(name = "movimiento", schema="damas")
public class Movimiento  implements java.io.Serializable {
    
    @Id
    @Column(name = "idMoviment")
     private Integer idMoviment;
    @Column(name = "idPartida")
    @ManyToOne
     private Partida partida;
    @Column(name = "columnaOrigen")
     private int columnaOrigen;
    @Column(name = "columnaDesti")
     private int columnaDesti;
    @Column(name = "filaOrigen")
     private int filaOrigen;
    @Column(name = "filaDesti")
     private int filaDesti;

    public Movimiento() {
    }

    public Movimiento(Partida partida, int columnaOrigen, int columnaDesti, int filaOrigen, int filaDesti) {
       this.partida = partida;
       this.columnaOrigen = columnaOrigen;
       this.columnaDesti = columnaDesti;
       this.filaOrigen = filaOrigen;
       this.filaDesti = filaDesti;
    }
   
    public Integer getIdMoviment() {
        return this.idMoviment;
    }
    
    public void setIdMoviment(Integer idMoviment) {
        this.idMoviment = idMoviment;
    }
    public Partida getPartida() {
        return this.partida;
    }
    
    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    public int getColumnaOrigen() {
        return this.columnaOrigen;
    }
    
    public void setColumnaOrigen(int columnaOrigen) {
        this.columnaOrigen = columnaOrigen;
    }
    public int getColumnaDesti() {
        return this.columnaDesti;
    }
    
    public void setColumnaDesti(int columnaDesti) {
        this.columnaDesti = columnaDesti;
    }
    public int getFilaOrigen() {
        return this.filaOrigen;
    }
    
    public void setFilaOrigen(int filaOrigen) {
        this.filaOrigen = filaOrigen;
    }
    public int getFilaDesti() {
        return this.filaDesti;
    }
    
    public void setFilaDesti(int filaDesti) {
        this.filaDesti = filaDesti;
    }




}
