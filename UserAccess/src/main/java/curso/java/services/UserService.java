package curso.java.services;

import curso.java.data.UserData;
import curso.java.repositories.DatabaseRepository;
import curso.java.repositories.GoogleDataRepository;

public class UserService {

    DatabaseRepository databaseRepository;
    GoogleDataRepository googleDataRepository;

    public UserService(DatabaseRepository databaseRepository, GoogleDataRepository googleDataRepository) {
        this.databaseRepository = databaseRepository;
        this.googleDataRepository = googleDataRepository;
    }

    public UserData getUserFromDb(String userId) {
        // DEvolver usuario de la base de datos
        DatabaseRepository databaseRepository = new DatabaseRepository();
        UserData user = databaseRepository.getUser(userId);
    }

    public UserData getUserFromGoogle(String userId) {
        // DEvolver usuario de la base de datos de google
    }
}
