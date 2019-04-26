package latihan.android.com.PerpusBook.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import latihan.android.com.PerpusBook.R

class MainClass: AppCompatActivity() {
    private lateinit var navogationController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainlayout)

        navogationController = findNavController(R.id.navigationHost)
        NavigationUI.setupActionBarWithNavController(this, navogationController)
    }
    override fun onSupportNavigateUp() = navogationController.navigateUp()
}
