package sistema_banco.bancodocurso.Service;

public class NumberCleaner {
    public static String cleanNumber(String num) {
        return num.replaceAll("[^0-9]", "");
    }
}
