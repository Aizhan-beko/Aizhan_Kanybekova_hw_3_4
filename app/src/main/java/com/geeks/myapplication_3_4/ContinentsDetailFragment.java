package com.geeks.myapplication_3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geeks.myapplication_3_4.databinding.FragmentContinentsDetailBinding;

import java.util.List;

public class ContinentsDetailFragment extends Fragment {

    private FragmentContinentsDetailBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentContinentsDetailBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


            ContinentsModel continent = (ContinentsModel) getArguments().getSerializable("continents");
            if (continent.getName().equals("Eurasia")) {
            } else if (continent.getName().equals("Australia")) {
            } else if (continent.getName().equals("South America")) {
            } else if (continent.getName().equals("North America")) {
            } else if (continent.getName().equals("Africa")) {
            }


            binding.tvContinentName.setText(continent.getName());

                List<String> countries = continent.getCountries();
                StringBuilder countriesText = new StringBuilder();
                for (String country : countries) {
                    countriesText.append(country).append("\n");
                }
                binding.tvCountries.setText(countriesText.toString());
            }
        }


