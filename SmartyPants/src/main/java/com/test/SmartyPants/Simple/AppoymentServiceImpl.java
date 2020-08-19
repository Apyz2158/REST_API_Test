package com.test.SmartyPants.Simple;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Service;

@Service
public class AppoymentServiceImpl implements AppoymentService {

	

	@Override
	public AppoymentResponse getSlot(AppoymentDetails details) {
		
		List<SlotList> list = new ArrayList<SlotList>();
		String startTime = details.getOpenTime()+":00";
		String endTime = details.getCloseTime()+":00";
		int slotDuration = details.getAppointmentDurationInMinutes();
		String openTime=startTime;
		String closeTime=null;
		
		
		RandomGen gen =  new RandomGen();
		String companyid = gen.getAlphaNumericString(5);
		
		int totalMin= 1;
		try {
			
			totalMin = getTotalTime(startTime, endTime);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int noOfSlots =totalMin / slotDuration;
		//System.out.println("totalMin "+totalMin+" :noOfSlots "+slotDuration+" :noOfSlots "+noOfSlots);
		
		for(int i=0;i<noOfSlots;i++) {
			
			SlotList slot = new SlotList();
			slot.setOpenTime(openTime);
			try {
				closeTime = getEndTime(openTime, slotDuration);
			} catch (Exception e) {
				e.printStackTrace();
			}
			slot.setCloseTime(closeTime);
			slot.setToken(details.getMaximumOccupancyAtATime());
			list.add(slot);
			
			openTime = closeTime;
			
		}
		
		Timestamp timestamp = Timestamp.from(Instant.now());
		
		AppoymentResponse appoymentResponse = new AppoymentResponse();
		Body body =new Body();
		
		body.setCompanyId(companyid);
		body.setSlotsList(list);
		if(list.size() <= 0) {
			appoymentResponse.setCode(400);
			appoymentResponse.setMessage("Cannot make slots.");
			appoymentResponse.setSuccess(false);
			
		}else {
			appoymentResponse.setBody(body);
			appoymentResponse.setCode(200);
			appoymentResponse.setMessage("Null");
			appoymentResponse.setSuccess(true);
		}
		
		appoymentResponse.setTimestamp(timestamp.toString());
		
		return  appoymentResponse;
	}
	
	
	private String getEndTime(String stratTime,int duration) throws Exception{
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		
		Date date1 = dateFormat.parse(stratTime);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date1);
		cal.add(Calendar.MINUTE, duration);
		String endtime = dateFormat.format(cal.getTime());
		return endtime;
	}
	
	private int getTotalTime(String startTime,String endTime) throws Exception {
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		Date date1 = timeFormat.parse(startTime);
		Date date2 = timeFormat.parse(endTime);
		
		long timeDifference = date1.getTime() - date2.getTime();
		int totalMin = (int) TimeUnit.MILLISECONDS.toMinutes(timeDifference);
		totalMin = Math.abs(totalMin);
		return totalMin;
	}

}
