import java.util.List;

public class UserFactory {
    public static User createUser(String name, String email, String password, String role, boolean hasLicense) {
        String id = role.equalsIgnoreCase("T") ? "T" + System.currentTimeMillis() : "G" + System.currentTimeMillis();

        if (role.equalsIgnoreCase("T")) {
            return new Traveller(id, name, email, password, List.of());
        } else if (role.equalsIgnoreCase("G")) {
            return new Guide(id, name, email, password, List.of(), hasLicense);
        } else {
            throw new IllegalArgumentException("Invalid role specified.");
        }
    }
}
