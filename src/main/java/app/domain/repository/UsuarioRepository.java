package app.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.domain.entity.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByLogin(String login);
}
