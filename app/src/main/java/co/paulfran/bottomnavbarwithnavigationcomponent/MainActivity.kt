package co.paulfran.bottomnavbarwithnavigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Initialize our Navigation Controller
        val navController = findNavController(R.id.fragment)
        // Create AppBarConfiguration Object
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.firstFragment, R.id.secondFragment, R.id.thirdFragment))

        setupActionBarWithNavController(navController, appBarConfiguration)

        // Merge the Bottom Navigation View with the Navigation Controller
        NavigationUI.setupWithNavController(bottomNavigationView, navController)

    }
}