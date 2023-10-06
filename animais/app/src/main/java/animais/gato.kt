package animais

import kotlin.random.Random

class gato {
    companion object {
        val listaCuriosidades = listOf(
            "Gatos dormem cerca de 70% de suas vidas.",
            "Os bigodes dos gatos ajudam na percepção espacial.",
            "Gatos têm 32 músculos em cada orelha.",
            "Um grupo de gatos é chamado de colônia.",
            "Gatos têm padrões únicos de impressões digitais nas narinas.",
            "Gatos têm padrões únicos de impressões digitais nas narinas.",
            "Gatos não têm papilas gustativas para saborear doces.",
            "A audição de um gato é três vezes melhor do que a dos humanos.",
            "Os gatos podem pular até seis vezes o comprimento de seu corpo.",
            "Os gatos têm um sistema de comunicação vocal complexo."
        )

        fun sorteiaCuriosidade(): String {
            val numCuriosidade = Random.nextInt(0, 10)
            return listaCuriosidades[numCuriosidade]
        }
    }
}