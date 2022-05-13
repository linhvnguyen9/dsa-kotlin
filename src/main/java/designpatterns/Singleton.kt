package designpatterns

class Singleton private constructor() {
    companion object{
        private var INSTNACE: Singleton? = null

        fun getInstance(): Singleton {
            if (INSTNACE == null) {
                INSTNACE = Singleton()
            }
            return INSTNACE!!
        }
    }
}

class ThreadSafeSingleton private constructor() {
    companion object{
        private var INSTNACE: ThreadSafeSingleton? = null

        fun getInstance(): ThreadSafeSingleton {
            if (INSTNACE == null) {
                synchronized(this) {
                    if (INSTNACE == null) {
                        INSTNACE = ThreadSafeSingleton()
                    }
                }
            }
            return INSTNACE!!
        }
    }
}

object KotlinSingleton {

}
