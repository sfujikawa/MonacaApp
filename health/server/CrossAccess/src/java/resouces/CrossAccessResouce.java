package resouces;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;

@Path("CrossAccessRest")
public class CrossAccessResouce {

    @Context
    private HttpServletResponse servletResponse;

    @QueryParam("name")
    private String name;

    @QueryParam("email")
    private String email;

    @QueryParam("password")
    private String password;

    @GET
    public String getText() {

        servletResponse.setHeader("Access-Control-Allow-Origin", "*");
        servletResponse.setHeader("<span class='searchword'>Access-Control-Allow-Origin</span>", "*");
        servletResponse.setHeader("Access-Control-Allow-Origin", "*");
        servletResponse.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, DELETE, OPTIONS");
        servletResponse.setHeader("Access-Control-Allow-Headers", servletResponse.getHeader("Access-Control-Request-Headers"));
        servletResponse.setHeader("Access-Control-Max-Age", "-1");

        return name + ", " + email + ", " + password;
    }
}
