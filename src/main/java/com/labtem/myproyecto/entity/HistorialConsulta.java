package com.labtem.myproyecto.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "historial_consulta")
public class HistorialConsulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_historial")
    private Integer idHistorial;

    @ManyToOne(fetch = FetchType.EAGER)  // Cambiar de LAZY a EAGER
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.EAGER)  // Cambiar de LAZY a EAGER
    @JoinColumn(name = "id_recurso", nullable = false)
    private Recurso recurso;

    @Column(name = "fecha_consulta")
    private LocalDateTime fechaConsulta;

    public HistorialConsulta() {}

    public HistorialConsulta(Integer idHistorial, Usuario usuario, Recurso recurso, LocalDateTime fechaConsulta) {
        this.idHistorial = idHistorial;
        this.usuario = usuario;
        this.recurso = recurso;
        this.fechaConsulta = fechaConsulta;
    }

    public Integer getIdHistorial() { return idHistorial; }
    public void setIdHistorial(Integer idHistorial) { this.idHistorial = idHistorial; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    public Recurso getRecurso() { return recurso; }
    public void setRecurso(Recurso recurso) { this.recurso = recurso; }
    public LocalDateTime getFechaConsulta() { return fechaConsulta; }
    public void setFechaConsulta(LocalDateTime fechaConsulta) { this.fechaConsulta = fechaConsulta; }
}