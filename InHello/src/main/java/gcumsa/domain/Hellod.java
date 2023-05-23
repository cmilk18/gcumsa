package gcumsa.domain;

import gcumsa.domain.*;
import gcumsa.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Hellod extends AbstractEvent {

    private Long id;
    private String hello;

    public Hellod(Hello aggregate) {
        super(aggregate);
    }

    public Hellod() {
        super();
    }
}
