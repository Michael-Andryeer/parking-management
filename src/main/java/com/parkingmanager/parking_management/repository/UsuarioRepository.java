package com.parkingmanager.parking_management.repository;

import com.parkingmanager.parking_management.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
