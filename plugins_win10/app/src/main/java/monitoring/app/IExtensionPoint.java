package monitoring.app;

import org.pf4j.ExtensionPoint;


public interface IExtensionPoint extends ExtensionPoint {
	String getGreeting();
}
