package jp.zenkoukai.wheelchairmeter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DistanceDataRepository extends JpaRepository<DistanceData, Long> {

}
