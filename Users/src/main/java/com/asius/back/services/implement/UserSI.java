package com.asius.back.services.implement;
import com.asius.back.entity.User;
import com.asius.back.repository.UsuarioRepository;
import com.asius.back.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.Set;

@Service
public class UserSI implements UserServices {
    @Autowired
    private UsuarioRepository userRepository;
    @Override
    public User agregarUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User actualizarUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Set<User> obtenerUser() {
        return new LinkedHashSet<>(userRepository.findAll());
    }

    @Override
    public User obtenerUser(Integer idusurios) {
        return userRepository.findById(idusurios).get();
    }

    @Override
    public void eliminarUser(Integer idusurios) {
        User user = new User();
        user.setIdusurios(idusurios);
        userRepository.delete(user);
    }
}
