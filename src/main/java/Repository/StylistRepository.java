package Repository;

import Model.Stylist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StylistRepository extends JpaRepository<Stylist, Long> {
}
