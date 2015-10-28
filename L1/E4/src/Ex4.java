
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Munir Wanis
 */
public class Ex4 {

    private ArrayList<Numero> nums = new ArrayList<>();
    private ArrayList<Integer> results = new ArrayList<>();

    /**
     * Programa principal
     *
     * @param args
     */
    public static void main(String[] args) {

        Ex4 obj = new Ex4();

        obj.entradaDados();
        obj.alteraDados();
        obj.saidaDados();

    }

    public void entradaDados() {
        boolean _continue = true;

        System.out.println("Calculalouca de psicotropicos");

        do {
            System.out.println("\n[Enter] para prosseguir para prossima etapa");
            System.out.println("1. Resultado Normal");
            System.out.println("2. Resultado Primo");

            Scanner scanner = new Scanner(System.in);
            String option = scanner.nextLine();

            if (option.equals("1")) {
                System.out.print("\nDigite um numero inteiro para obter resultado qualquer: ");

                try {
                    int value = scanner.nextInt();
                    nums.add(new Numero(value));
                } catch (Exception e) {
                    System.out.println("Erro: digite um numero inteiro!");
                }

            } else if (option.equals("2")) {
                System.out.print("\nDigite um numero inteiro para obter resultado primo: ");

                try {
                    int value = scanner.nextInt();
                    nums.add(new Primo(value));
                } catch (Exception e) {
                    System.out.println("Erro: digite um numero inteiro!");
                }

            } else if (option.isEmpty()) {
                _continue = false;
            } else {
                System.out.println("\nOpção inválida.");
            }

        } while (_continue);
    }

    public void alteraDados() {

        boolean _continue = true;

        do {
            System.out.print("\nQual o indice do numero voce quer testar: ");
            try {
                Scanner scanner = new Scanner(System.in);
                int index = scanner.nextInt();

                if (this.nums.size() <= index) {
                    System.out.println("\nO indice apontado nao existe.");
                } else {
                    System.out.println("\n1. Soma");
                    System.out.println("2. Subtracao");
                    System.out.println("3. Multiplicacao");
                    System.out.println("4. Divisao");
                    System.out.println("5. Outro numero");
                    System.out.println("6. Sair");

                    int option = scanner.nextInt();

                    try {
                        int value;
                        int result;
                        switch (option) {
                            case 1:
                                System.out.print("\nSomar com qual numero? ");
                                value = scanner.nextInt();
                                result = nums.get(index).soma(value);
                                System.out.println("Resultado: " + String.valueOf(result));
                                break;
                            case 2:
                                System.out.print("\nSubtrair qual numero? ");
                                value = scanner.nextInt();
                                result = nums.get(index).sub(value);
                                System.out.println("Resultado: " + String.valueOf(result));
                                break;
                            case 3:
                                System.out.print("\nMultiplicar por qual numero? ");
                                value = scanner.nextInt();
                                result = nums.get(index).mult(value);
                                System.out.println("Resultado: " + String.valueOf(result));
                                break;
                            case 4:
                                System.out.print("\nDividir por qual numero? ");
                                value = scanner.nextInt();
                                result = nums.get(index).div(value);
                                System.out.println("Resultado: " + String.valueOf(result));
                                break;
                            case 5:
                                break;
                            case 6:
                                _continue = false;
                                break;
                            default:
                                System.out.println("\nOpção inválida.");
                                break;
                        }
                    } catch (NaoPrimoEx ex) {
                        System.out.println("Resultado não é primo");
                    }
                }
            } catch (Exception e) {
                System.out.println("Digite um numero inteiro de indice");
            }

        } while (_continue);
    }

    public void saidaDados() {
        System.out.println("\nNumeros adicionados:");
        for (Numero value : this.nums) {
            System.out.println(value.toString());
        }
    }
}
