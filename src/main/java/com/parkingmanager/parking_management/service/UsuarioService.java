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

    @Transactional(readOnly = true)
    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Usúario não encontrado.")
        );
    }

    @Transactional
    public Usuario editarSenha(Long id, String senha) {
       Usuario user = buscarPorId(id);
       user.setSenha(senha);
       return user;
    }
}
