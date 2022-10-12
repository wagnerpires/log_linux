package com.wrtecnologia.log.dtos;

import com.wrtecnologia.log.entities.Log;

import java.io.Serializable;
import java.time.LocalDate;

public class LogDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private LocalDate data;
    private Double valor;

    public LogDTO() {

    }

    public LogDTO(Long id, LocalDate data, Double valor) {
        this.id = id;
        this.data = data;
        this.valor = valor;
    }

    public LogDTO(Log entity) {
        id = entity.getId();
        data = entity.getData();
        valor = entity.getValor();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
