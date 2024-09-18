package Fragment



class ForecastFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_forecast, container, false)
        view.setBackgroundColor(Color.parseColor("#20FF0000"))
        return view
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_forecast, container, false)
        val layout = LinearLayout(context)
        layout.orientation = LinearLayout.VERTICAL

        // Add dynamic views
        val imageView = ImageView(context)
        imageView.setImageResource(R.drawable.weather_icon)
        layout.addView(imageView)

        val textView = TextView(context)
        textView.text = "Today's Forecast"
        layout.addView(textView)

        return layout
    }

}
