public class App {
    public static void main(String[] args) throws Exception {
        try {
            String cep = FormataCep("12345678");
            System.out.println(cep);

        } catch(CepInvalido e) {
            System.err.println(e.getMessage());
        }
    }
    static String FormataCep(String cep)throws CepInvalido{
        if (cep.length() < 8) {
            throw new CepInvalido("Aquantidade de caracteres é insuficiente");
        } else if (cep.length() > 8) {
            throw new CepInvalido("Aquantidade de caracteres foi execida");
         } return cep;
        
    }
}
