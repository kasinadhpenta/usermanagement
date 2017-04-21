package cgi;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class Calculator
{
	Logger logger = Logger.getLogger(Calculator.class);
	
    public double add( int a, int b)
    {
    	//BasicConfigurator.configure();
    	logger.info("This is my add method");
        return a+b;
    }
    public double multiply( int a, int b)
    {
    	//BasicConfigurator.configure();
    	logger.info("This is my multiply method");
        return a*b;
    }
}
