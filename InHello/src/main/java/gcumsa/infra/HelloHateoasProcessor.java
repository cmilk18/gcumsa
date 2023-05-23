package gcumsa.infra;

import gcumsa.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class HelloHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Hello>> {

    @Override
    public EntityModel<Hello> process(EntityModel<Hello> model) {
        return model;
    }
}
