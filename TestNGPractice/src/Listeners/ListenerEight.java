package Listeners;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.IAnnotation;
import org.testng.annotations.ITestAnnotation;

public class ListenerEight implements IAnnotationTransformer{
	
	public void transform(ITestAnnotation a, java.lang.Class cs, java.lang.reflect.Constructor c, java.lang.reflect.Method m) {
		
		a.setRetryAnalyzer(ListenerRetry.class);
	}
	

}
