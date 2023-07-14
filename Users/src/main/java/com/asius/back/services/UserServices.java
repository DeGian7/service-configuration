package com.asius.back.services;


import com.asius.back.entity.User;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UserServices {
    User agregarUser(User user);

    User actualizarUser(User user);

    Set<User> obtenerUser();

    User obtenerUser(Integer idusurios);

    void eliminarUser(Integer idusurios);
}
