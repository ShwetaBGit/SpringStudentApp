package com.sb.beans;

import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Named("wmsg")
public class WishGenerated {

	// @Inject
	 //@Named("cal1") //to solve ambiguity problem
	private Calendar cal;

	int hour = 0;

	 @Inject
	 @Named("cal2")
	public WishGenerated(Calendar cal) {
		System.out.println("WishGenerated.WishGenerated()");
		this.cal = cal;
	}

	// @Inject
	public void setCal(Calendar cal) {
		this.cal = cal;
	}

	// @Inject
	public void assign(Calendar cal) {

		this.cal = cal;
	}

	// business logic
	public String generateWishMsg(String name) {

		int hour = cal.get(Calendar.HOUR_OF_DAY);

		
		System.out.println("cal" +cal);
		if (hour < 12)
			return "Good Morning" + name + "\n have a nice day";

		else if (hour < 16)
			return "Good afternoon " + name;
		else if (hour < 20)
			return "Good evening ";

		else
			return "Good night " + name + "\nSweet Dream \ntake care \nsleep tight";

	}

}
