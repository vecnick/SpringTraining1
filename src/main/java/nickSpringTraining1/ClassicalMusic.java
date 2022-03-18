package nickSpringTraining1;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicalMusic implements Music{
    @PostConstruct
    public void oMyInit(){
        System.out.println("DoMyInit");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("DoMyDestroy");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

}
