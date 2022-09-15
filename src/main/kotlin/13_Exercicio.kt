fun main(){

    val ano : Int = 2

    fun meses(ano:Int):Int = ano * 12
    fun dias(ano:Int):Int = ano * 365
    fun horas(ano:Int):Int = ano * 8760
    fun minutos(ano:Int):Int = ano * 525600
    fun segundos(ano:Int):Int = ano * 31536000


    println("$ano equivalem a:")
    println("${meses(ano)} meses")
    println("${dias(ano)} dias")
    println("${horas(ano)} horas")
    println("${minutos(ano)} minutos")
    println("${segundos(ano)} segundos")


    val qntCarString : String = "Rodrigo de Araujo Leite Pereira"

    fun contQtdCarString(qntCarString: String):String = "A String possui ${qntCarString.length} caracretes"

    println(contQtdCarString(qntCarString))

    fun cubo(nr:Int):Int = nr * nr * nr

    val nr :Int = 5

    println("$nr ao cubo é: ${cubo(nr)}")

    fun milhas2Km (milhas:Float):Float = milhas*1600

    val milhas:Float = 3F

    println("$milhas milhas em Km é: ${milhas2Km(milhas)} Km")

    val string:String = "Trocando todos os 'A' e 'a' por 'x'"

    println(trocaChar(string))

    val a:Int = 3
    val b:Int = 4

    println(testeFuncaoCompletaSoma(a,b))
}

fun trocaChar(string: String):String = string.replace("a","x",true)

fun testeFuncaoCompletaSoma(a:Int, b:Int):Int{
    return a + b
}