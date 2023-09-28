
package sa.edu.kau.fcit.cpit252.lab4BuilderFactory;


public class CharacterFactory {

    // TODO: Add a factory method that returns an object (Archer, FlagBearer, or Knight) by its type and name:
    public static Characters createCharacter(CharacterTypes type, String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("You must provide a name");
        }
        switch (type) {
            case ARCHER:
                return new Archer(name);
            case KNIGHT:
                return new Knight(name);
            case FLAG_BEARER:
                return new FlagBearer(name);
            default: throw new IllegalArgumentException("Unknown Type");
        }
    }
}