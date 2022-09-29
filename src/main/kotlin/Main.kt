import config.viaCepConfig

fun main() {
    val service =    viaCepConfig()

    val address = service.getAdress("65900180").execute().body().

}