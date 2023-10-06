package animais

import kotlin.random.Random

class cachorro {

    companion object {
        val listaCuriosidades = listOf("Cães têm cerca de 300 milhões de receptores olfativos, enquanto os humanos têm apenas 5 milhões.",
            "O latido é a forma principal de comunicação dos cães.",
            "O basenji é conhecido como \"cão sem latido devido à sua falta de vocalização comum.",
            "Cães têm sido domesticados há mais de 15.000 anos.",
            "O cão mais alto do mundo, Zeus, tinha 1,12 metro de altura.",
            "Os cães têm pegadas únicas, assim como as impressões digitais humanas.",
            "Dálmatas são conhecidos por sua pelagem com manchas, mas nascem completamente brancos.",
            "O olfato canino é usado em buscas e resgates, detecção de drogas e muito mais.",
            "O cão-guia é uma assistência valiosa para pessoas com deficiência visual.",
            "Existem mais de 340 raças de cães reconhecidas oficialmente em todo o mundo."
        )

        fun sorteiaCuriosidade(): String {
            val numCuriosidade = Random.nextInt(0, 10)
            return gato.listaCuriosidades[numCuriosidade]
        }
    }
}