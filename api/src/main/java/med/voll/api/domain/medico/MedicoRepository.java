package med.voll.api.domain.medico;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.Optional;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
    Optional<Object> findAll(Pageable paginacion);
    Page<Medico> findByActivoTrue(org.springframework.data.domain.Pageable paginacion);
}