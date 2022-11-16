fun main() {
    print(solution(10, 15, 15, 9))
}

fun solution(yourLeft: Int, yourRight: Int, friendsLeft: Int, friendsRight: Int): Boolean {
    val yourList = arrayListOf(yourLeft, yourRight)
    val friendList = arrayListOf(friendsLeft, friendsRight)

    return (yourList.maxOrNull() == friendList.maxOrNull() && yourList.sum() == friendList.sum())
}