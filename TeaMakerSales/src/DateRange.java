import java.util.Date;

public class DateRange {
	private Date start;
	private Date end;

	public DateRange(Date start, Date end) {
		this.start = start;
		this.end = end;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	boolean includes(Date date) {
		return date.equals(getStart()) || date.equals(getEnd()) || (date.after(getStart()) && date.before(getEnd()));
	}
}