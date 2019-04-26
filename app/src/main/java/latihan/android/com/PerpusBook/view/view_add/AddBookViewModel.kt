package latihan.android.com.PerpusBook.view.view_add

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import latihan.android.com.PerpusBook.StartApp
import latihan.android.com.PerpusBook.data.data_model.Book

class AddBookViewModel(application : Application): AndroidViewModel(application) {
    private val bookRepository = getApplication<StartApp>().getBookRepo()

    fun addBook(book: Book){
        bookRepository.insertBook(book)

    }
}