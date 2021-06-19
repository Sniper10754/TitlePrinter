package TitlePrinter

import java.io.*

class TitlePrinter(f: File?) {
    @JvmOverloads
    @Throws(IOException::class)
    fun printTitle(w: Writer = BufferedWriter(OutputStreamWriter(System.out))) {
        for (line in titleLines) {
            w.write(line + "\n")
            w.flush()
        }
    }

    companion object {
        private val titleLines: ArrayList<String> = ArrayList()
    }

    init {
        val br = BufferedReader(FileReader(f))
        var line: String?
        while (br.readLine().also { line = it } != null) {
            line?.let { titleLines.add(it) }
        }
    }
}