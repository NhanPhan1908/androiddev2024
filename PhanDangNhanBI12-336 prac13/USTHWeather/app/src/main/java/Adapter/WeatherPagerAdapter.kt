package Adapter

class WeatherPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getCount(): Int = 3

    override fun getItem(position: Int): Fragment = WeatherAndForecastFragment()

    override fun getPageTitle(position: Int): CharSequence {
        return when (position) {
            0 -> "Tab 1"
            1 -> "Tab 2"
            2 -> "Tab 3"
            else -> "Tab"
        }
    }
}
