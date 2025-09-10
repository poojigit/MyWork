package SingleResponsibility.example2;

public class UserRepository {
    public void save (String username, String email){
        System.out.println("Saving the details to the DB:" +username+ "," +email);
    }
}
