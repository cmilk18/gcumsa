package gcumsa.external;

import java.util.Date;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "InHello", url = "${api.url.InHello}")
public interface HelloService {
    @RequestMapping(method = RequestMethod.POST, path = "/hellos")
    public void hello(@RequestBody Hello hello);
}
