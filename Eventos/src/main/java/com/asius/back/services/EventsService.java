package com.asius.back.services;



import com.asius.back.entity.Events;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface EventsService {
    Events agregarEvento(Events events);

    Events actualizarEvento(Events events);

    Set<Events> obtenerEvento();

    Events obtenerEvento(Long idEvents);

    void eliminarEvento(Long idEvents);
}
