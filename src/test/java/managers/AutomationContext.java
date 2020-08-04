package managers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AutomationContext {

    public AutomationContext(ScenarioMgr scenarioMgr) throws IOException {
        this.scenarioMgr = scenarioMgr;
        configReader = new ConfigReader(System.getProperty("app"));
    }

    private final Map<String, String> contextMap = new HashMap<>();
    ScenarioMgr scenarioMgr;
    ConfigReader configReader;

    public ConfigReader getConfigReader(){
        return configReader;
    }

    public ScenarioMgr getScenarioMgr() {
        return scenarioMgr;
    }

    public String getContextMap(String key) {
        return contextMap.get(key);
    }

    public void setContextMap(String key, String value) {
        contextMap.put(key, value);
    }


}
