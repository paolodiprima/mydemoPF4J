package plugin1.editing;

import org.pf4j.Extension;
import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;
import monitoring.app.IExtensionPoint;

public class Plugin1 extends Plugin {

    public Plugin1(PluginWrapper wrapper) {
        super(wrapper);
    }

    @Override
    public void start() {
        System.out.println("PLUGIN1.start()");
        //Plugin1IExtensionPoint.;
    }

    @Override
    public void stop() {
        System.out.println("PLUGIN1.stop()");
    }
    

    @Extension
    public static class Plugin1IExtensionPoint implements IExtensionPoint {
     
        @Override
        public String getGreeting() {
            return "greeting from PLUGIN1";
        }
    }
}
