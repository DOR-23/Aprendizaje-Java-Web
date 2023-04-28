package curso.java.repositories;

import curso.java.data.UserData;
import curso.java.exceptions.ConnectErrorException;

public class GoogleDataRepository {

    public UserData getUser(String userId) throws ConnectErrorException {
        // Aqui hariamos llamada a Google
        return new UserData(userId, "Alex", "Martin");
    }
}
