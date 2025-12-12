package com.labtem.myproyecto.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "favorito")
public class Favorito {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_favorito")
    private Integer idFavorito;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_recurso", nullable = false)
    private Recurso recurso;

    @Column(name = "fecha_agregado")
    private LocalDateTime fechaAgregado;

    public Favorito() {}

    public Favorito(Integer idFavorito, Usuario usuario, Recurso recurso, LocalDateTime fechaAgregado) {
        this.idFavorito = idFavorito;
        this.usuario = usuario;
        this.recurso = recurso;
        this.fechaAgregado = fechaAgregado;
    }

    // Getters y Setters
    public Integer getIdFavorito() { return idFavorito; }
    public void setIdFavorito(Integer idFavorito) { this.idFavorito = idFavorito; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    public Recurso getRecurso() { return recurso; }
    public void setRecurso(Recurso recurso) { this.recurso = recurso; }
    public LocalDateTime getFechaAgregado() { return fechaAgregado; }
    public void setFechaAgregado(LocalDateTime fechaAgregado) { this.fechaAgregado = fechaAgregado; }
}