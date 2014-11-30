package drools.service;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by serhii on 30.11.14.
 */
@Service
public class RuleService {

    private KieContainer kContainer;
    @Autowired
    private UserService userService;

    @PostConstruct
    private void initKContainer() {
        if (kContainer == null){
            KieServices ks = KieServices.Factory.get();
            kContainer = ks.getKieClasspathContainer();
        }
    }

    public void processRules(){
        KieSession kSession = kContainer.newKieSession("rulename");
        kSession.setGlobal("user", userService.getRandomUser());
    }
}
