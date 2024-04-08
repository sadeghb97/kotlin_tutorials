object StylishPrinter {
    fun print(str: String, style: Style){
        print(style.code + str + Style.RESET.code)
    }
    fun println(str: String, style: Style){
        this.print(str, style)
        println()
    }
}

data class Style (val code: String){
    companion object {
        val RESET:Style = Style("\u001B[0m")
        val BLACK:Style = Style("\u001B[30m")
        val RED:Style = Style("\u001B[31m")
        val  GREEN:Style = Style("\u001B[32m")
        val  YELLOW:Style = Style("\u001B[33m")
        val  BLUE:Style = Style("\u001B[34m")
        val  PURPLE:Style = Style("\u001B[35m")
        val  CYAN:Style = Style("\u001B[36m")
        val  WHITE:Style = Style("\u001B[37m")

        val  BOLD_RESET:Style = Style("\u001B[0;1m")
        val  BOLD_BLACK:Style = Style("\u001B[30;1m")
        val  BOLD_RED:Style = Style("\u001B[31;1m")
        val  BOLD_GREEN:Style = Style("\u001B[32;1m")
        val BOLD_YELLOW:Style = Style("\u001B[33;1m")
        val BOLD_BLUE:Style = Style("\u001B[34;1m")
        val  BOLD_PURPLE:Style = Style("\u001B[35;1m")
        val BOLD_CYAN:Style = Style("\u001B[36;1m")
        val  BOLD_WHITE:Style = Style("\u001B[37;1m")

        val BG_BLACK:Style = Style("\u001B[40m")
        val BG_RED:Style = Style("\u001B[41m")
        val BG_GREEN:Style = Style("\u001B[42m")
        val BG_YELLOW:Style = Style("\u001B[43m")
        val BG_BLUE:Style = Style("\u001B[44m")
        val BG_PURPLE:Style = Style("\u001B[45m")
        val BG_CYAN:Style = Style("\u001B[46m")
        val BG_WHITE:Style = Style("\u001B[47m")
    }

    operator fun plus(style: Style): Style {
        return Style(code + style.code)
    }
}