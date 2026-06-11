import entities.Account;
import entities.User;

public static void main(String[] args) {
    Locale.of("BR");
    Scanner sc = new Scanner(System.in);

    // Lista estática e provisória de clientes
    List<Account> otherAccounts = new ArrayList<>(
            List.of(
                    new Account(1000, 123.00, new User("João", "123.123.123-12")),
                    new Account(2000, 321.00, new User("Maria", "456.456.456-32")),
                    new Account(3000, 0.00, new User("Pedro", "789.789.789-09"))
            )
    );

    // Inicio do programa
    System.out.println("---- NOVA BANK ----");
    System.out.print("");
    System.out.println("[1] Entrar");
    System.out.println("[2] Cadastrar");

    User user = null;
    Account acc = null;
    boolean accountExist = false;
    int accountSelect = sc.nextInt();

    switch (accountSelect) {
        case 1:
            accountExist = true;
            break;
        case 2:
            accountExist = false;
            break;
    }

    if (!accountExist) {
        // Conta não existe
        System.out.println("---- Criar conta ----");
        System.out.print("Nome: ");
        String name = sc.next();
        sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.next();
        sc.nextLine();
        System.out.print("Senha (4 dígitos): ");
        int pass = sc.nextInt();
        while (pass > 9999 || pass < 1000) {
            System.out.println("Apenas senha de 4 dígitos!");
            System.out.print("Senha (4 dígitos): ");
            pass = sc.nextInt();
        }

        user = new User(name, cpf);
        acc = new Account(0, user, pass);
        System.out.println("Conta Criada!");
        System.out.print("Número de conta: "+ acc.getAccountNum());
        System.out.println("");
    }
    // Conta já existe

    System.out.println("---- Entrar em conta ----");

    sc.close();

}