package curso.java.repositories;

import curso.java.data.UserData;

public class DatabaseRepository {

    public UserData getUser(String userId) {
        // Aqui hariamos llamada a Base de datos
        return new UserData(userId, "Alex", "Martin");
    }

}
