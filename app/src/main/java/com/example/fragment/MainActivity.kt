import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.fragment.R
import com.example.fragment.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val  viewPager=findViewById<ViewPager>(R.id.viewpager)
        val tabs = findViewById<TabLayout>(R.id.tabs)

        viewPager.adapter = ViewPagerAdapter(this,supportFragmentManager)
        tabs.setupWithViewPager(viewPager)
    }
}
