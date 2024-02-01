package br.com.vbruno.repository;

import br.com.vbruno.model.Cambio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CambioRepository extends JpaRepository<Cambio, Long> {
    Cambio findByFromAndTo(String from, String to);
}
