package Day12_Listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImpl implements IRetryAnalyzer {

	int count = 0;
	int retry = 3;

	@Override
	public boolean retry(ITestResult result) {
		if (count < retry) {
			count++;
			return true;
		}
		return false;
	}

}
