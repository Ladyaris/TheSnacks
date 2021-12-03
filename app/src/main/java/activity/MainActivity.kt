package activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ladyaris.thesnacks.R
import com.ladyaris.thesnacks.databinding.ActivityMainBinding
import fragment.BreakfastFragment
import fragment.DessertFragment
import fragment.VegetarianFragment

class MainActivity : AppCompatActivity() {

    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        setCurrentFragment(BreakfastFragment())
        mainBinding.navMain.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.icBreakfast -> setCurrentFragment(BreakfastFragment())
                R.id.icvegetarian -> setCurrentFragment(VegetarianFragment())
                R.id.icdessert -> setCurrentFragment(DessertFragment()) }

                true
        }
    }

    private fun setCurrentFragment(fragment: Fragment) {
       supportFragmentManager.beginTransaction().apply {
           replace(R.id.flMain, fragment)
           commit()
       }
    }
}