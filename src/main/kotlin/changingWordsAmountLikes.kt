fun printLikes(likes: Int) {
    val ending = if (likes % 10 == 1 && likes % 100 != 11) "Понравилось $likes человеку" else "Понравилось $likes людям"
    println(ending)
}