package cn.tiany;
import org.apache.log4j.Logger;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.log4j.PropertyConfigurator;
public class Test extends TimerTask{
	static Logger logger =Logger.getLogger(Test.class);
	static{
		//PropertyConfigurator.configure("log4j.properties");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();  
        timer.schedule(new Test(), 1000, 30000);
		
		//logger.debug("this is debug message");
		//logger.info("this is info message");
		//logger.error("this is error message");
		
		

	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		logger.debug("this is debug message");
	    logger.info("this is info message");
		logger.error("this is error message");
	}
	

}

