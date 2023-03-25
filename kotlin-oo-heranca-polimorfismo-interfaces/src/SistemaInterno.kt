class SistemaInterno {

    fun entra(admin: Autenticavel, senha: Int){
        if(admin.autentica(senha)){
            println("Bem vindo ao Banco Digital BB")
        } else {
            println("Falha na autenticação")
        }
    }

}