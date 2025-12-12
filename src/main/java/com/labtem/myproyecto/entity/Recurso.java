package com.labtem.myproyecto.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "recurso")
public class Recurso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_recurso")
    private Integer idRecurso;

    @Column(name = "titulo", nullable = false, length = 200)
    private String titulo;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_recurso", nullable = false)
    private TipoRecurso tipoRecurso;

    @Column(name = "enlace_o_ubicacion", length = 255)
    private String enlaceOUbicacion;

    @Column(name = "fecha_publicacion")
    private LocalDateTime fechaPublicacion;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private EstadoRecurso estado;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_origen")
    private TipoOrigen tipoOrigen;

    @ManyToOne(fetch = FetchType.EAGER)  // CAMBIAR A EAGER
    @JoinColumn(name = "id_usuario_compartio")
    private Usuario usuarioCompartio;

    @ManyToOne(fetch = FetchType.EAGER)  // CAMBIAR A EAGER
    @JoinColumn(name = "id_moderador_reviso")
    private Usuario moderadorReviso;

    @ManyToOne(fetch = FetchType.EAGER)  // CAMBIAR A EAGER
    @JoinColumn(name = "id_materia")
    private Materia materia;

    @ManyToOne(fetch = FetchType.EAGER)  // CAMBIAR A EAGER
    @JoinColumn(name = "id_tema")
    private Tema tema;

    public enum TipoRecurso { video, artículo, guía, ejercicio, documento }
    public enum EstadoRecurso { pendiente, aprobado, rechazado }
    public enum TipoOrigen { oficial, compartido }

    public Recurso() {}

    public Recurso(Integer idRecurso, String titulo, String descripcion, TipoRecurso tipoRecurso,
                   String enlaceOUbicacion, LocalDateTime fechaPublicacion, EstadoRecurso estado,
                   TipoOrigen tipoOrigen, Usuario usuarioCompartio, Usuario moderadorReviso,
                   Materia materia, Tema tema) {
        this.idRecurso = idRecurso;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tipoRecurso = tipoRecurso;
        this.enlaceOUbicacion = enlaceOUbicacion;
        this.fechaPublicacion = fechaPublicacion;
        this.estado = estado;
        this.tipoOrigen = tipoOrigen;
        this.usuarioCompartio = usuarioCompartio;
        this.moderadorReviso = moderadorReviso;
        this.materia = materia;
        this.tema = tema;
    }

    public Integer getIdRecurso() { return idRecurso; }
    public void setIdRecurso(Integer idRecurso) { this.idRecurso = idRecurso; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public TipoRecurso getTipoRecurso() { return tipoRecurso; }
    public void setTipoRecurso(TipoRecurso tipoRecurso) { this.tipoRecurso = tipoRecurso; }
    public String getEnlaceOUbicacion() { return enlaceOUbicacion; }
    public void setEnlaceOUbicacion(String enlaceOUbicacion) { this.enlaceOUbicacion = enlaceOUbicacion; }
    public LocalDateTime getFechaPublicacion() { return fechaPublicacion; }
    public void setFechaPublicacion(LocalDateTime fechaPublicacion) { this.fechaPublicacion = fechaPublicacion; }
    public EstadoRecurso getEstado() { return estado; }
    public void setEstado(EstadoRecurso estado) { this.estado = estado; }
    public TipoOrigen getTipoOrigen() { return tipoOrigen; }
    public void setTipoOrigen(TipoOrigen tipoOrigen) { this.tipoOrigen = tipoOrigen; }
    public Usuario getUsuarioCompartio() { return usuarioCompartio; }
    public void setUsuarioCompartio(Usuario usuarioCompartio) { this.usuarioCompartio = usuarioCompartio; }
    public Usuario getModeradorReviso() { return moderadorReviso; }
    public void setModeradorReviso(Usuario moderadorReviso) { this.moderadorReviso = moderadorReviso; }
    public Materia getMateria() { return materia; }
    public void setMateria(Materia materia) { this.materia = materia; }
    public Tema getTema() { return tema; }
    public void setTema(Tema tema) { this.tema = tema; }
}