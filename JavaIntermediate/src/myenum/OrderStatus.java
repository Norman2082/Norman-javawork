package myenum;

public enum OrderStatus {
	PENDING("Highlighted status pending"),
	COMPLETED(" Highlighted status complete"),
	REJECTED(" Highlighted rejetected status"),
	DELIVERED(" Highlighted delivery complete"),
	FEEDBACK_COLLECTED("Ticker symbol for feedback collection");
	

String inf;

private OrderStatus(String n) {
	inf=n;
	
}
public String getStatus()
{
	return inf;
}
}