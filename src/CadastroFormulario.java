public class CadastroFormulario {
    String name;
    String email;
    String lastname;
    String gender;
    String phone;
    String nascimento;
    String hobbies;
    String mensagem;
    String city;
    String state;

    // CONSTRUÇÃO DA CLASSE FORMULÁRIO COM MÉTODOS GET E SET PARA CRIAÇÃO DE UM NOVO
    // OBJETO E RETORNAR OS VALORES DO SEU RESPECTIVOS OBJETOS
    public CadastroFormulario(String name, String lastName, String email, String gender, String phone,
            String nascimento) {
        this.name = name;
        this.lastname = lastName;
        this.email = email;
        this.gender = gender;
        this.phone = phone;
        this.nascimento = nascimento;
        // this.hobbies = hobbies;
        // this.mensagem = mensagem;
        // this.city = city;
        // this.state = state;
        // this.lastname = lastname;
    }

    public String get_name() {
        return name;
    }

    public String get_email() {
        return email;
    }

    public String get_gender() {
        return gender;
    }

    public String get_nascimento() {
        return nascimento;
    }

    public String get_hobbies() {
        return hobbies;
    }

    public String get_mensagem() {
        return mensagem;
    }

    public String get_city() {
        return city;
    }

    public String get_state() {
        return state;
    }

    public String get_lastname() {
        return lastname;
    }

    public String get_phone() {
        return phone;
    }

}
