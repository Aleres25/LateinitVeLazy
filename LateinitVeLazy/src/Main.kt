import kotlin.random.Random

private lateinit var mesaj: String
fun main() {
    //Aşağıdaki satır hata verecktir.Çünkü latenit kullanıdığımızda,değişkeni kullanmadan önce kesinlikle initialize etmeliyiz.(lateinit property mesaj has not been initialized)
    // println(mesaj)


    mesaj = "Merhaba"
    //Aşağıdaki satır hata vermeyecektir.Çünkü latenit kullandığımız değişkeni initialize ettik.
    println(mesaj)


    //Aşağıda mesaj2 yi lazy olarak tanımladık böylece sadece gerekli durumlarda init edilecek.
    val mesaj2: String by lazy {
        "Küçük"
    }

    var randomSayi = Random.nextInt(10)
    println(randomSayi)
    //randomSayi değişkeninin 5 ten küçük olduğu durumlarda mesaj2 initialize edilir.
    if (randomSayi < 5) {
        println(mesaj2)
    }
}



