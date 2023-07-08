public class Main {
    public static void main(String[] args) {
        Folder folder1 = new Folder("Folder 1");
        Folder subfolder1 = new Folder("Subfolder 1");
        File file1 = new File("File 1.txt");
        folder1.ajouterComponent(subfolder1);
        folder1.ajouterComponent(file1);

        Folder folder2 = new Folder("Folder 2");
        Folder subfolder2 = new Folder("Subfolder 2");
        File file2 = new File("File 2.txt");
        folder2.ajouterComponent(subfolder2);
        folder2.ajouterComponent(file2);

        folder1.afficher(0);
        folder2.afficher(0);
    }
}
