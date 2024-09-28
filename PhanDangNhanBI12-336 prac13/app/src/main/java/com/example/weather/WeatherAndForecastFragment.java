package com.example.weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class WeatherAndForecastFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);

        // Dynamically add WeatherFragment
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.weather_container, new WeatherFragment());
        transaction.add(R.id.forecast_container, new ForecastFragment());
        transaction.commit();

        return view;
    }
}
