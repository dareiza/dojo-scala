class Persona(primerNombre: String, segundoNombre: Option[String], apellido: String){

    def nombreCompleto = {
    segundoNombre match {
        case Some(i) => println(primerNombre+" "+i+" "+apellido)
        case None => println(primerNombre+" "+apellido)
        }
    }
}