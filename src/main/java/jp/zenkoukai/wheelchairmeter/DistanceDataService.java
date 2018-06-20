package jp.zenkoukai.wheelchairmeter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DistanceDataService {
	@Autowired
	DistanceDataRepository distanceDataRepository;

	public void save(DistanceData distanceData) {
		distanceDataRepository.save(distanceData);
	}
}
