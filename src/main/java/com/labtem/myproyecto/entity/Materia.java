package com.labtem.myproyecto.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "materia")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_materia")
    private Integer idMateria;

    @Column(name = "nombre_materia", nullable = false, length = 150)
    private String nombreMateria;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "area_asociada", length = 100)
    private String areaAsociada;

    public Materia() {}

    public Materia(Integer idMateria, String nombreMateria, String descripcion, String areaAsociada) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.descripcion = descripcion;
        this.areaAsociada = areaAsociada;
    }

    public Integer getIdMateria() { return idMateria; }
    public void setIdMateria(Integer idMateria) { this.idMateria = idMateria; }
    public String getNombreMateria() { return nombreMateria; }
    public void setNombreMateria(String nombreMateria) { this.nombreMateria = nombreMateria; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getAreaAsociada() { return areaAsociada; }
    public void setAreaAsociada(String areaAsociada) { this.areaAsociada = areaAsociada; }
}