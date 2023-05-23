package gcumsa.domain;

import gcumsa.domain.*;
import gcumsa.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Worlded extends AbstractEvent {

    private Long id;

    public Worlded(World aggregate) {
        super(aggregate);
    }

    public Worlded() {
        super();
    }
}
