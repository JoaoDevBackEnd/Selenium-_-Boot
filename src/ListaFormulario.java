import java.util.List;
import java.util.ArrayList;

public class ListaFormulario {

    // CRIAÇÃO DE UMA ARRAY DA CLASSE CadastroFormulario para ser instanciada novos
    // registros no formulários.
    public List<CadastroFormulario> listaformulario = new ArrayList<CadastroFormulario>();

    public ListaFormulario() {
        listaformulario.add(new CadastroFormulario("Joao", "Victor", "joaodogma21@gmail.com", "Other", "1234567891",
                "21 Jan 1991"));

        listaformulario.add(new CadastroFormulario("Lucas", "Santos", "Lucasdogma@outlook.com", "Male", "1478523691",
                "9 Apr 2002"));

        listaformulario.add(new CadastroFormulario("Celia", "Viviviv", "vivicelia@gmail.com", "Female", "7147414972",
                "15 Dez 1998"));

        listaformulario.add(new CadastroFormulario("Marcus", "Viviviv", "vivicelia@gmail.com", "Female", "7147414972",
                "24 Jul 1997"));
        listaformulario.add(
                new CadastroFormulario("Vini", "Viviviv", "vivicelia@gmail.com", "Other", "7147414972", "14 Aug 1987"));
        listaformulario.add(
                new CadastroFormulario("Pablo", "Viviviv", "vivicelia@gmail.com", "Male", "7147414972", "21 Jun 1997"));
        listaformulario.add(
                new CadastroFormulario("Teu", "Viviviv", "vivicelia@gmail.com", "Female", "7147414972", "7 Aug 2005"));
    }
}
