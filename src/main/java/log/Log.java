
package log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.aventstack.extentreports.Status;
import report.ExtentTestManager;

public class Log {

	private static final Logger log = LogManager.getLogger(Log.class);

	public static void info(String message) {
		log.info(message);
		extentLog(message, Status.INFO);
	}

	public static String infoMessage(String message) {
		log.info(message);
		extentLog(message, Status.INFO);
		return message;
	}

	public static void warn(String message) {
		log.warn(message);
		extentLog(message, Status.WARNING);
	}

	public static void error(String message) {
		log.error(message);
		extentLog(message, Status.FAIL);
	}

	private static void extentLog(String message, Status status) {
		if (ExtentTestManager.getTest() != null) {
			ExtentTestManager.getTest().log(status, message);
		}
	}
}
