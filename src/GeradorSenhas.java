import java.security.SecureRandom;

public class GeradorSenhas {
    public static void main(String[] args) throws Exception {
        int length=12;
        boolean incluiNumeros=true;
        boolean incluiSimbolos=true;
        String senha= gerandoSenha(incluiNumeros, incluiSimbolos, length);
        System.out.println(senha);
    }

    public static String gerandoSenha(boolean incluiNumeros, boolean incluiSimbolos, int length){
        String UPPER_CASE= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String LOWER_CASE = "abcdefghijklmnopqrstuvwxyz";
        String NUMEROS = "0123456789";
        String SIMBOLOS = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/";
        String characterSet = UPPER_CASE + LOWER_CASE;
        if (incluiNumeros) characterSet+= NUMEROS;
        if (incluiSimbolos) characterSet+= SIMBOLOS;
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(index));
        }
        return password.toString();
    }
}
