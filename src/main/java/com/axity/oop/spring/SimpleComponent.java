package com.axity.oop.spring;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class SimpleComponent {
    private final LocalDateTime fechaInicio;

    public SimpleComponent() {
        this.fechaInicio = LocalDateTime.now();
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }
}
