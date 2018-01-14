package listeners;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.IInvokedMethod;
import org.testng.IObjectFactory;
import org.testng.IObjectFactory2;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SuiteRunState;
import org.testng.internal.annotations.IAnnotationFinder;
import org.testng.xml.XmlSuite;

import com.google.inject.Injector;

public class CustomListeners implements ITestListener, ISuite{

	public void onFinish(ISuite suite) {
		System.out.println("Finishing");
	}

	public void onStart(ISuite suite) {
		System.out.println("Starting");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.out.println("Screenshot Captured");
		Reporter.log("<a target=\"_blank\" href=\"cute.jpeg\">Screenshot Capture</a>");
	    Reporter.log("<br><a target=\"_blank\" href=\"cute.jpeg\"><img height=200,width=200,src=\"cute.jpeg\" alt=\"\"/></img></a>");
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public Object getAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> getAttributeNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object removeAttribute(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setAttribute(String arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	public void addListener(ITestNGListener arg0) {
		// TODO Auto-generated method stub
		
	}

	public List<IInvokedMethod> getAllInvokedMethods() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ITestNGMethod> getAllMethods() {
		// TODO Auto-generated method stub
		return null;
	}

	public IAnnotationFinder getAnnotationFinder() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<ITestNGMethod> getExcludedMethods() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getGuiceStage() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getHost() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<ITestNGMethod> getInvokedMethods() {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, Collection<ITestNGMethod>> getMethodsByGroups() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public IObjectFactory getObjectFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	public IObjectFactory2 getObjectFactory2() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getOutputDirectory() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getParallel() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getParameter(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Injector getParentInjector() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getParentModule() {
		// TODO Auto-generated method stub
		return null;
	}

	public Map<String, ISuiteResult> getResults() {
		// TODO Auto-generated method stub
		return null;
	}

	public SuiteRunState getSuiteState() {
		// TODO Auto-generated method stub
		return null;
	}

	public XmlSuite getXmlSuite() {
		// TODO Auto-generated method stub
		return null;
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

	public void setParentInjector(Injector arg0) {
		// TODO Auto-generated method stub
		
	}

}
