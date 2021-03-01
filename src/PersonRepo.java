import java.util.Scanner;

public class PersonRepo {
    public static void main(String[] args) {
        PersonsTree personsTree = new PersonsTree();
        personsTree.displayAllPersonsFromRoot();
        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Surname: ");
        String surname = scanner.nextLine();
        System.out.println(personsTree.exists(name, surname));

    }
}
