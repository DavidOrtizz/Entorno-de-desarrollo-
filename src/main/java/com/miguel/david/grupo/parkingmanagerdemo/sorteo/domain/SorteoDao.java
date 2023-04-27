package com.miguel.david.grupo.parkingmanagerdemo.sorteo.domain;

import java.util.Date;

public class SorteoDao {
    private String descripcion;
    private Estado estado;
    private Date creacion;
    
     /**
     * Fecha en la que ha sido sorteado
     */
    private Date fechaSorteo;

    public SorteoDao() {
        this("",Estado.NUEVO);
    }
    public SorteoDao(String descrion, Estado estado) {
        this.descripcion = descripcion;
        this.estado = estado;
        this.creacion = new Date();
    }

    public Date getCreacion() {
        return creacion;
    }

    public void setCreacion(Date creacion) {
        this.creacion = creacion;
    }

    public String getDescripciob() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setStatus(Estado Estado) {
        this.estado = estado;
    }

    public Date getFechaSorteo() {
        return fechaSorteo;
    }

    public void setFechaSorteo(Date fechaSorteo) {
        this.fechaSorteo = fechaSorteo;
    }
}
