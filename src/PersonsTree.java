public class PersonsTree {
    private Person root;

    public PersonsTree() {
        Person KazikKról = new Person("Kazik", "Król", null);
        Person MajaNowak = new Person("Maja", "Nowak", null);

        Person[] DarekKrólPersons = {KazikKról};
        Person DarekKról = new Person("Darek", "Król", DarekKrólPersons);

        Person JózekKról = new Person("Józek", "król", null);
        Person TeofilaKról = new Person("Teofila", "Król", null);

        Person[] MarekNowakPersons = {MajaNowak};
        Person MarekNowak = new Person("Marek", "Nowak", MarekNowakPersons);

        Person AnnaKowalska = new Person("Anna", "Kowalska", null);

        Person[] MajaKrólPersons = {DarekKról, JózekKról, TeofilaKról};
        Person MajaKról = new Person("Maja", "Król", MajaKrólPersons);

        Person StefanJanowczyk = new Person("Stefan", "Janowczyk", null);

        Person[] AndrzejNowakPersons = {MarekNowak, AnnaKowalska};
        Person AndrzejNowak = new Person("Andrzej", "Nowak", AndrzejNowakPersons);

        Person[] JurekJanowczykPersons = {MajaKról, StefanJanowczyk};
        Person JurekJanowczyk = new Person("Jurek", "Janowczyk", JurekJanowczykPersons);

        Person KasiaJanowczyk = new Person("Kasia", "Janowczyk", null);

        Person[] KasiaNowakPersons = {AndrzejNowak};
        Person KasiaNowak = new Person("Kasia", "Nowak", KasiaNowakPersons);

        Person[] MarekJanowczykPersons = {JurekJanowczyk, KasiaJanowczyk, KasiaNowak};
        root = new Person("Marek", "Janowczyk", MarekJanowczykPersons);
    }

        public void displayAllPersonsFromRoot() {
            displayAllPersons(root);
        }


    private void displayAllPersons(Person person) {
        Person[] persons = person.getPersons();

        for (int i = 0; persons != null && i < persons.length; i++) {
            displayAllPersons(persons[i]);
        }
        for (int i = 0; persons != null && i < persons.length; i++) {
            System.out.print(persons[i].getName() + " ");
            System.out.println(persons[i].getSurname());
        }
    }
        public boolean exists(String name) {
            return exists(root, name);
        }

        private boolean exists(Person person, String name) {
            Person[] persons = person.getPersons();
            for(int i = 0; persons != null && i < persons.length; i++) {
                if(persons[i].getName().equals(name)){
                    return true;
                }
            }

            boolean exists = false;
            for(int i = 0; persons != null && i < persons.length; i++) {
                exists |= exists(persons[i], name);
            }
            return exists;
    }
}


