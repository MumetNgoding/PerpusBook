package latihan.android.com.PerpusBook

import android.app.Application
import latihan.android.com.PerpusBook.data.BookRepo

class StartApp: Application() {
    fun getBookRepo() = BookRepo(this)
}