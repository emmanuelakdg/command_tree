class File implements Component {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public void afficher(int niveau) {
        StringBuilder concartenation = new StringBuilder();
        for (int i = 0; i < niveau; i++) {
            concartenation.append("\t");
        }
        System.out.println(concartenation.toString() + "\u251C\u2500\u2500\u2500" + name);
    }
}