package com.labtem.myproyecto.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "encuesta_satisfaccion")
public class EncuestaSatisfaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_encuesta")
    private Integer idEncuesta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_recurso", nullable = false)
    private Recurso recurso;

    @Column(name = "calificacion")
    private Byte calificacion;

    @Column(name = "comentario", columnDefinition = "TEXT")
    private String comentario;

    @Column(name = "fecha_respuesta")
    private LocalDateTime fechaRespuesta;

    public EncuestaSatisfaccion() {}

    public EncuestaSatisfaccion(Integer idEncuesta, Usuario usuario, Recurso recurso, Byte calificacion,
                                String comentario, LocalDateTime fechaRespuesta) {
        this.idEncuesta = idEncuesta;
        this.usuario = usuario;
        this.recurso = recurso;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fechaRespuesta = fechaRespuesta;
    }

    public Integer getIdEncuesta() { return idEncuesta; }
    public void setIdEncuesta(Integer idEncuesta) { this.idEncuesta = idEncuesta; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    public Recurso getRecurso() { return recurso; }
    public void setRecurso(Recurso recurso) { this.recurso = recurso; }
    public Byte getCalificacion() { return calificacion; }
    public void setCalificacion(Byte calificacion) { this.calificacion = calificacion; }
    public String getComentario() { return comentario; }
    public void setComentario(String comentario) { this.comentario = comentario; }
    public LocalDateTime getFechaRespuesta() { return fechaRespuesta; }
    public void setFechaRespuesta(LocalDateTime fechaRespuesta) { this.fechaRespuesta = fechaRespuesta; }
}