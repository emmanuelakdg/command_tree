import java.util.ArrayList;
import java.util.List;

class Folder implements Component {
    private String name;
    private List<Component> components;

    public Folder(String name) {
        this.name = name;
        this.components = new ArrayList<>();
    }

    public void ajouterComponent(Component component) {
        components.add(component);
    }

    public void supprimerComponent(Component component) {
        components.remove(component);
    }

    public void afficher(int niveau) {
        StringBuilder concartenation = new StringBuilder();
        for (int i = 0; i < niveau; i++) {
            concartenation.append("\t");
        }
        System.out.println(concartenation.toString() + "\u251C\u2500\u2500\u2500" + name);

        for (int i = 0; i < components.size() - 1; i++) {
            components.get(i).afficher(niveau + 1);
        }

        if (!components.isEmpty()) {
            components.get(components.size() - 1).afficher(niveau + 1);
        }
    }
}
