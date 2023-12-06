package oop

class PersonSix(val firstname: String, val lastname: String) {

    private var timesSetNickname: Int = 0;

    var nickname: String? = null
        set(value) {
            timesSetNickname += 1
            field = value
        }

    fun showTimesNicknameWasSet() = println("nickname was set $timesSetNickname time(s)")
}