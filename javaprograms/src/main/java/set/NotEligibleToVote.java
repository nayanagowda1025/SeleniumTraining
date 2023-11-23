package set;

public class NotEligibleToVote extends RuntimeException {
	public String getMessage()
	{
		return "kindly wait untill you turn";
		
	}

}
