package jp.zenkoukai.wheelchairmeter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/distance")
public class DistanceAPIController {
	@Autowired
	DistanceDataService distanceDataService;

	@RequestMapping(method = RequestMethod.POST)
	public String registerDistance(@Validated @RequestBody DistanceData distanceData) {
		distanceDataService.save(distanceData);
		return "OK";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String testData() {
		return "hello world";
	}
}
