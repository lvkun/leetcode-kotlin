package site.lvkun.leetcode.string_to_integer_atoi

class Solution {

    class StateManager {

        enum class State {
            START,
            SIGN,
            NUMBER,
            END
        }

        var sign = 1
        var ret = 0

        val result: Int
            get() = sign * ret

        var state: State = State.START

        fun match(c: Char): Boolean {
            state =
                when(state) {
                    State.START -> {
                        when {
                            c == '-' -> {
                                sign = -1
                                State.SIGN
                            }
                            c == '+' -> {
                                sign = 1
                                State.SIGN
                            }
                            c.isDigit() -> {
                                ret = (c - '0') + ret * 10
                                State.NUMBER
                            }
                            c.isWhitespace() -> {
                                State.START
                            }
                            else -> {
                                State.END
                            }
                        }
                    }
                    State.SIGN -> {
                        when {
                            c.isDigit() -> {
                                ret = (c - '0') + ret * 10
                                State.NUMBER
                            }
                            else -> {
                                State.END
                            }
                        }
                    }
                    State.NUMBER -> {
                        when {
                            c.isDigit() -> {
                                if (ret > Int.MAX_VALUE / 10) {
                                    ret = if (sign > 0) Int.MAX_VALUE else Int.MIN_VALUE
                                    State.END
                                } else if (ret == Int.MAX_VALUE / 10) {
                                    ret = if (c - '0' > 7)
                                        if (sign > 0) Int.MAX_VALUE else Int.MIN_VALUE
                                        else (c - '0') + ret * 10
                                    State.END
                                } else {
                                    ret = (c - '0') + ret * 10
                                    State.NUMBER
                                }
                            }
                            else -> {
                                State.END
                            }
                        }
                    }
                    else -> {
                        State.END
                    }
                }

            return state != State.END
        }
    }

    fun myAtoi(str: String): Int {
        val stateManager = StateManager()

        for (c in str) {
            if (!stateManager.match(c)) {
                break
            }
        }

        return stateManager.result
    }
}