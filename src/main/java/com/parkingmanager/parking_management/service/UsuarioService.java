package com.parkingmanager.parking_management.service;

import com.parkingmanager.parking_management.entity.Usuario;
import com.parkingmanager.parking_management.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor // Cria um metódo construtor com a variavel UsuarioRepository, como metódo construtor, fazendo a injeção de dep. pelo proprio construtor
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Transactional
    public Usuario salvar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
