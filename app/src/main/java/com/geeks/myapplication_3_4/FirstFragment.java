package com.geeks.myapplication_3_4;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.geeks.myapplication_3_4.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.Arrays;


public class FirstFragment extends Fragment implements AdapterClick{

    private FragmentFirstBinding binding;

    private ArrayList<ContinentsModel> continentsList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentFirstBinding.inflate(getLayoutInflater());
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        continentsList = new ArrayList<>();
        fillData();
        setupRecyclerView();
    }

    private void fillData() {

        ArrayList<String> eurasiaCountries = new ArrayList<>(Arrays.asList(" Armenia", "Kyrgyzstan,", "Azerbaijan", "Kazakhstan,", "Turkey"));
        ContinentsModel eurasia = new ContinentsModel("Eurasia", "https://www.google.ru/imgres?q=eurasia%20map%20png%20android&imgurl=https%3A%2F%2Ffreepngimg.com%2Fsave%2F81260-europe-map-asia-area-hd-image-free-png%2F1000x569&imgrefurl=https%3A%2F%2Ffreepngimg.com%2Fpng%2F81260-europe-map-asia-area-hd-image-free-png%2Fdownload&docid=rl5CDTT_mRVAuM&tbnid=Ccx82Ymc3VAg2M&vet=12ahUKEwifuKjfgsaFAxV2GxAIHRHeD-MQM3oECB4QAA..i&w=1000&h=569&hcb=2&ved=2ahUKEwifuKjfgsaFAxV2GxAIHRHeD-MQM3oECB4QAA", eurasiaCountries);
        continentsList.add(eurasia);

        ArrayList<String> australiaCountries = new ArrayList<>(Arrays.asList(" New Zealand", "Fiji", "Solomon Islands", "Papua New Guinea,", "Oceania"));
        ContinentsModel australia = new ContinentsModel("Australia", "https://www.google.ru/imgres?q=australia%20map%20png%20android&imgurl=https%3A%2F%2Fe7.pngegg.com%2Fpngimages%2F154%2F828%2Fpng-clipart-map-australia-map-world-road-map-thumbnail.png&imgrefurl=https%3A%2F%2Fwww.pngegg.com%2Fen%2Fsearch%3Fq%3Daustralia%2BMap&docid=oX_ueQ3xewM49M&tbnid=glFFwJZAZ9g3CM&vet=12ahUKEwiPu9a1hMaFAxUaBhAIHSI8AzQQM3oECE0QAA..i&w=348&h=328&hcb=2&ved=2ahUKEwiPu9a1hMaFAxUaBhAIHSI8AzQQM3oECE0QAA", australiaCountries);
        continentsList.add(australia);

        ArrayList<String> southAmericaCountries = new ArrayList<>(Arrays.asList("Argentina", "Bolivia", "Brazil", "Chile ", "Colombia"));
        ContinentsModel southAmerica = new ContinentsModel("South America", "https://www.google.ru/imgres?q=south%20america%20map%20png%20android&imgurl=https%3A%2F%2Fm.media-amazon.com%2Fimages%2FI%2F61As2M-ooJL.png&imgrefurl=https%3A%2F%2Fwww.amazon.com%2Fpereirasoft-Map-of-south-america%2Fdp%2FB01AWV6VSQ&docid=HV_-972ItlnpeM&tbnid=NNSl2dD3D2VPnM&vet=12ahUKEwib_8-bhcaFAxWpLBAIHT8jBkYQM3oECGAQAA..i&w=512&h=512&hcb=2&ved=2ahUKEwib_8-bhcaFAxWpLBAIHT8jBkYQM3oECGAQAA", southAmericaCountries);
        continentsList.add(southAmerica);

        ArrayList<String> northAmericaCountries = new ArrayList<>(Arrays.asList("Bahamas", "Bermuda", " Canada", "Central America ", "Caribbean"));
        ContinentsModel northAmerica = new ContinentsModel("North America", "https://www.google.ru/imgres?q=north%20america%20map%20png%20android&imgurl=https%3A%2F%2Ftoppng.com%2Fuploads%2Fpreview%2Fnorth-america-map-115499626138oxujj23qd.png&imgrefurl=https%3A%2F%2Ftoppng.com%2Fshow_download%2F89816%2Fnorth-america-map&docid=W2eCQENK60dwKM&tbnid=NlAPNJLL9StfhM&vet=12ahUKEwiwnbGuhcaFAxUmAhAIHajrC1gQM3oECEMQAA..i&w=840&h=859&hcb=2&ved=2ahUKEwiwnbGuhcaFAxUmAhAIHajrC1gQM3oECEMQAA", northAmericaCountries);
        continentsList.add(northAmerica);

        ArrayList<String>  africaCountries = new ArrayList<>(Arrays.asList("Nigeria", "Sudan", " Angola", "Algeria", "Uganda"));
        ContinentsModel africa = new ContinentsModel("Africa", "https://www.google.ru/imgres?q=africa%20map%20png%20android&imgurl=https%3A%2F%2Ftoppng.com%2Fuploads%2Fpreview%2Fmap-of-africa-political-map-of-africa-11563016801og8elhzvro.png&imgrefurl=https%3A%2F%2Ftoppng.com%2Ffree-image%2Fafrica-map-PNG-free-PNG-Images_262839&docid=wtvGmatXeELWVM&tbnid=weh6rtLfHnR27M&vet=12ahUKEwjg0IbnhcaFAxWlFxAIHYzbAO8QM3oECBMQAA..i&w=840&h=859&hcb=2&ved=2ahUKEwjg0IbnhcaFAxWlFxAIHYzbAO8QM3oECBMQAA", africaCountries);
        continentsList.add(africa);



    }

    @Override
    public void onClick(int position) {
        ContinentsModel continents =continentsList.get(position);

        Bundle bundle = new Bundle();
        bundle.putSerializable("continents",continents);


        ContinentsDetailFragment fragment = new ContinentsDetailFragment();
        fragment.setArguments(bundle);

        requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
        Toast.makeText(requireContext(),continents.getName(),Toast.LENGTH_SHORT).show();


    }
        private void setupRecyclerView() {
        ContinentsAdapter adapter = new ContinentsAdapter(continentsList,this);
        binding.rvContinents.setAdapter(adapter);


    }

    }

