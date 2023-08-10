package com.hackaboss.caso1.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="ciudad" )
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 50)
    private String nombre;
    @Column(name = "estado")
    private Boolean estado;
    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;
    @Column(name = "fecha_modificacion", nullable = true)
    private LocalDateTime fechaModificacion;
    @Column(name = "fecha_eliminacion", nullable = true)
    private LocalDateTime fechaEliminacion;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "estado_id", nullable = false)
    private Estado estadoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDateTime fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public LocalDateTime getFechaEliminacion() {
        return fechaEliminacion;
    }

    public void setFechaEliminacion(LocalDateTime fechaEliminacion) {
        this.fechaEliminacion = fechaEliminacion;
    }

    public Estado getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(Estado estadoId) {
        this.estadoId = estadoId;
    }
}
