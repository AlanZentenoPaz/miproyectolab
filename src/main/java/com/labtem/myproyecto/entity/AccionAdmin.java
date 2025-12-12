package com.labtem.myproyecto.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "accion_admin")
public class AccionAdmin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_accion")
    private Integer idAccion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_accion", nullable = false)
    private TipoAccion tipoAccion;

    @Enumerated(EnumType.STRING)
    @Column(name = "entidad_afectada", nullable = false)
    private EntidadAfectada entidadAfectada;

    @Column(name = "id_entidad_afectada")
    private Integer idEntidadAfectada;

    @Column(name = "fecha_accion")
    private LocalDateTime fechaAccion;

    @Column(name = "descripcion_accion", columnDefinition = "TEXT")
    private String descripcionAccion;

    @Column(name = "motivo", columnDefinition = "TEXT")
    private String motivo;

    public enum TipoAccion { alta, baja, modificación, asignación_rol, aprobación, rechazo }
    public enum EntidadAfectada { usuario, materia, recurso, rol, tema }

    public AccionAdmin() {}

    public AccionAdmin(Integer idAccion, Usuario usuario, TipoAccion tipoAccion, EntidadAfectada entidadAfectada,
                       Integer idEntidadAfectada, LocalDateTime fechaAccion, String descripcionAccion, String motivo) {
        this.idAccion = idAccion;
        this.usuario = usuario;
        this.tipoAccion = tipoAccion;
        this.entidadAfectada = entidadAfectada;
        this.idEntidadAfectada = idEntidadAfectada;
        this.fechaAccion = fechaAccion;
        this.descripcionAccion = descripcionAccion;
        this.motivo = motivo;
    }

    public Integer getIdAccion() { return idAccion; }
    public void setIdAccion(Integer idAccion) { this.idAccion = idAccion; }
    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
    public TipoAccion getTipoAccion() { return tipoAccion; }
    public void setTipoAccion(TipoAccion tipoAccion) { this.tipoAccion = tipoAccion; }
    public EntidadAfectada getEntidadAfectada() { return entidadAfectada; }
    public void setEntidadAfectada(EntidadAfectada entidadAfectada) { this.entidadAfectada = entidadAfectada; }
    public Integer getIdEntidadAfectada() { return idEntidadAfectada; }
    public void setIdEntidadAfectada(Integer idEntidadAfectada) { this.idEntidadAfectada = idEntidadAfectada; }
    public LocalDateTime getFechaAccion() { return fechaAccion; }
    public void setFechaAccion(LocalDateTime fechaAccion) { this.fechaAccion = fechaAccion; }
    public String getDescripcionAccion() { return descripcionAccion; }
    public void setDescripcionAccion(String descripcionAccion) { this.descripcionAccion = descripcionAccion; }
    public String getMotivo() { return motivo; }
    public void setMotivo(String motivo) { this.motivo = motivo; }
}