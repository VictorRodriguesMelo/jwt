package app.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto,Integer> {
}
