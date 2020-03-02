package fase3.fase3;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;
import java.util.logging.Logger;

@Path("/student")
public class StudentResource {

    private StudentService service = new StudentService();
    private static Logger log = Logger.getLogger(StudentResource.class.toString());

    @GET
    @Path("/get")
    public Response getStudents(@Context UriInfo uriInfo ) {
        List<Student> students = service.getAllStudents();

        GenericEntity<List<Student>> entity = new GenericEntity<List<Student>>( students )
        {};
        return Response.status(Status.OK).entity(entity).build();
    }

    @POST
    @Path("/create")
    public Response addStudent(@Context UriInfo uriInfo ) {

            Student newStudent = service.addStudent();
            URI uri = uriInfo.getAbsolutePathBuilder().path( Long.toString( newStudent.getId() ) ).build();

            return Response.created( uri ).entity( newStudent ).build();
    }
}