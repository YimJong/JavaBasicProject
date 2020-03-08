package service;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import dao.CouponDao;

public class CouponService{

	public static final int ONE_DAY = 1;
	
	
	CouponDao coupon = new CouponDao();
	
	private final ScheduledExecutorService service;
	
	public CouponService() {
		this.service = Executors.newScheduledThreadPool(1);
	}
	
	public void chargeEventChance(Runnable command, int hour, int minute, int second) {
		ZonedDateTime now = ZonedDateTime.now();
		ZonedDateTime chargingTime = this.getNextChargingTime(hour, minute, second, now);
		service.scheduleAtFixedRate(command, this.firstCharging(now, chargingTime), 24 * 60 * 60, SECONDS);
		
		
	}

	private long firstCharging(ZonedDateTime now, ZonedDateTime chargingTime) {

		Duration duration = Duration.between(now, chargingTime);
		return duration.getSeconds();
	}

	private ZonedDateTime getNextChargingTime(int hour, int minute, int second, ZonedDateTime now) {
		ZonedDateTime nextChargingTime;
		
		nextChargingTime = now
						   .withHour(hour)
						   .withMinute(minute)
						   .withSecond(second);
		
		if(this.checkTime(now, nextChargingTime)) {
			nextChargingTime = nextChargingTime.plusDays(ONE_DAY);
		}
		
		return nextChargingTime;
	}
	

	private boolean checkTime(ZonedDateTime now, ZonedDateTime nextChargingTime) {
		
		return now.compareTo(nextChargingTime) > 0;
		
	}
	
	
	
	
}
